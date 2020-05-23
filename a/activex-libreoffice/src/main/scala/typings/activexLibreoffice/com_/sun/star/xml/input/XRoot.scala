package typings.activexLibreoffice.com_.sun.star.xml.input

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Root interface being passed to {@link SaxDocumentHandler} service upon instantiation. */
trait XRoot extends XInterface {
  /** Receives notification of the end of a document. */
  def endDocument(): Unit
  /**
    * Receives notification of a processing instruction.
    * @param target target
    * @param data data
    */
  def processingInstruction(target: String, data: String): Unit
  /**
    * Receives an object for locating the origin of SAX document events.
    * @param locator locator
    */
  def setDocumentLocator(locator: XLocator): Unit
  /**
    * Receives notification of the beginning of a document.
    * @param xMapping mapping to obtain ids out of XML namespace URIs and vice versa
    */
  def startDocument(xMapping: XNamespaceMapping): Unit
  /**
    * Called upon root element.
    * @param uid namespace uid of element
    * @param localName local name of element
    * @param xAttributes attributes of element
    */
  def startRootElement(uid: Double, localName: String, xAttributes: XAttributes): XElement
}

object XRoot {
  @scala.inline
  def apply(
    acquire: () => Unit,
    endDocument: () => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startDocument: XNamespaceMapping => Unit,
    startRootElement: (Double, String, XAttributes) => XElement
  ): XRoot = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endDocument = js.Any.fromFunction0(endDocument), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction1(startDocument), startRootElement = js.Any.fromFunction3(startRootElement))
    __obj.asInstanceOf[XRoot]
  }
}

