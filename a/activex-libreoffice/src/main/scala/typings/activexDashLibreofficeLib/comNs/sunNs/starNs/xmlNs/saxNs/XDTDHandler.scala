package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** receives notification of a notation declaration event. */
  def notationDecl(sName: java.lang.String, sPublicId: java.lang.String, sSystemId: java.lang.String): scala.Unit
  /** receives notification of an unparsed entity declaration event. */
  def unparsedEntityDecl(
    sName: java.lang.String,
    sPublicId: java.lang.String,
    sSystemId: java.lang.String,
    sNotationName: java.lang.String
  ): scala.Unit
}

object XDTDHandler {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    notationDecl: (java.lang.String, java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    unparsedEntityDecl: (java.lang.String, java.lang.String, java.lang.String, java.lang.String) => scala.Unit
  ): XDTDHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), notationDecl = js.Any.fromFunction3(notationDecl), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unparsedEntityDecl = js.Any.fromFunction4(unparsedEntityDecl))
  
    __obj.asInstanceOf[XDTDHandler]
  }
}

