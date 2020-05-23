package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives notification of general document events.
  *
  * This interface is an IDL version of the Java interface **org.xml.sax.DocumentHandler** with some smaller adaptations.
  */
trait XDocumentHandler extends XInterface {
  /** receives notification of character data. */
  def characters(aChars: String): Unit
  /** receives notification of the end of a document. */
  def endDocument(): Unit
  /** receives notification of the end of an element. */
  def endElement(aName: String): Unit
  /** receives notification of white space that can be ignored. */
  def ignorableWhitespace(aWhitespaces: String): Unit
  /** receives notification of a processing instruction. */
  def processingInstruction(aTarget: String, aData: String): Unit
  /** receives an object for locating the origin of SAX document events. */
  def setDocumentLocator(xLocator: XLocator): Unit
  /** receives notification of the beginning of a document. */
  def startDocument(): Unit
  /** receives notification of the beginning of an element . */
  def startElement(aName: String, xAttribs: XAttributeList): Unit
}

object XDocumentHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    characters: String => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit
  ): XDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
    __obj.asInstanceOf[XDocumentHandler]
  }
}

