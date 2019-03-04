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
    acquire: js.Function0[scala.Unit],
    notationDecl: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    unparsedEntityDecl: js.Function4[java.lang.String, java.lang.String, java.lang.String, java.lang.String, scala.Unit]
  ): XDTDHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, notationDecl = notationDecl, queryInterface = queryInterface, release = release, unparsedEntityDecl = unparsedEntityDecl)
  
    __obj.asInstanceOf[XDTDHandler]
  }
}

