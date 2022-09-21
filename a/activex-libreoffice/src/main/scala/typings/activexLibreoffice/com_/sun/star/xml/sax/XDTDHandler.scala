package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives events according to the DTD of the document.
  *
  * The SAX parser may report these events in any order, regardless of the order in which the notations and unparsed entities were declared; however, all
  * DTD events must be reported after the document handler's `startDocument` event, and before the first `startElement` event. It is up to the application
  * to store the information for future use (perhaps in a hash table or object tree). If the application encounters attributes of type "NOTATION",
  * "ENTITY", or "ENTITIES", it can use the information that it obtained through this interface to find the entity and/or notation that corresponds with
  * the attribute value.
  */
trait XDTDHandler
  extends StObject
     with XInterface {
  
  /** receives notification of a notation declaration event. */
  def notationDecl(sName: String, sPublicId: String, sSystemId: String): Unit
  
  /** receives notification of an unparsed entity declaration event. */
  def unparsedEntityDecl(sName: String, sPublicId: String, sSystemId: String, sNotationName: String): Unit
}
object XDTDHandler {
  
  inline def apply(
    acquire: () => Unit,
    notationDecl: (String, String, String) => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    unparsedEntityDecl: (String, String, String, String) => Unit
  ): XDTDHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), notationDecl = js.Any.fromFunction3(notationDecl), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unparsedEntityDecl = js.Any.fromFunction4(unparsedEntityDecl))
    __obj.asInstanceOf[XDTDHandler]
  }
  
  extension [Self <: XDTDHandler](x: Self) {
    
    inline def setNotationDecl(value: (String, String, String) => Unit): Self = StObject.set(x, "notationDecl", js.Any.fromFunction3(value))
    
    inline def setUnparsedEntityDecl(value: (String, String, String, String) => Unit): Self = StObject.set(x, "unparsedEntityDecl", js.Any.fromFunction4(value))
  }
}
