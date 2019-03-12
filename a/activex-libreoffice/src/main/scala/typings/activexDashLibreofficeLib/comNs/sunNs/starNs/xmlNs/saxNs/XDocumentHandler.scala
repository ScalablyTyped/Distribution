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
    acquire: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    endDocument: () => scala.Unit,
    endElement: java.lang.String => scala.Unit,
    ignorableWhitespace: java.lang.String => scala.Unit,
    processingInstruction: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDocumentLocator: XLocator => scala.Unit,
    startDocument: () => scala.Unit,
    startElement: (java.lang.String, XAttributeList) => scala.Unit
  ): XDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
  
    __obj.asInstanceOf[XDocumentHandler]
  }
}

