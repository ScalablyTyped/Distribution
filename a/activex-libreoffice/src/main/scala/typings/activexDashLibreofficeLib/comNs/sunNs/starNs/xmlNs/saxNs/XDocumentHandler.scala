package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification of general document events.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.DocumentHandler** with some smaller adaptations.
  */
trait XDocumentHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** receives notification of character data. */
  def characters(aChars: java.lang.String): scala.Unit
  /** receives notification of the end of a document. */
  def endDocument(): scala.Unit
  /** receives notification of the end of an element. */
  def endElement(aName: java.lang.String): scala.Unit
  /** receives notification of white space that can be ignored. */
  def ignorableWhitespace(aWhitespaces: java.lang.String): scala.Unit
  /** receives notification of a processing instruction. */
  def processingInstruction(aTarget: java.lang.String, aData: java.lang.String): scala.Unit
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): scala.Unit
  /** receives notification of the beginning of a document. */
  def startDocument(): scala.Unit
  /** receives notification of the beginning of an element . */
  def startElement(aName: java.lang.String, xAttribs: XAttributeList): scala.Unit
}

object XDocumentHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[XLocator, scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startElement: js.Function2[java.lang.String, XAttributeList, scala.Unit]
  ): XDocumentHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("characters")(characters)
    __obj.updateDynamic("endDocument")(endDocument)
    __obj.updateDynamic("endElement")(endElement)
    __obj.updateDynamic("ignorableWhitespace")(ignorableWhitespace)
    __obj.updateDynamic("processingInstruction")(processingInstruction)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDocumentLocator")(setDocumentLocator)
    __obj.updateDynamic("startDocument")(startDocument)
    __obj.updateDynamic("startElement")(startElement)
    __obj.asInstanceOf[XDocumentHandler]
  }
}

