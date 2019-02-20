package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.inputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Root interface being passed to {@link SaxDocumentHandler} service upon instantiation. */
trait XRoot
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Receives notification of the end of a document. */
  def endDocument(): scala.Unit
  /**
    * Receives notification of a processing instruction.
    * @param target target
    * @param data data
    */
  def processingInstruction(target: java.lang.String, data: java.lang.String): scala.Unit
  /**
    * Receives an object for locating the origin of SAX document events.
    * @param locator locator
    */
  def setDocumentLocator(locator: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator): scala.Unit
  /**
    * Receives notification of the beginning of a document.
    * @param xMapping mapping to obtain ids out of XML namespace URIs and vice versa
    */
  def startDocument(xMapping: XNamespaceMapping): scala.Unit
  /**
    * Called upon root element.
    * @param uid namespace uid of element
    * @param localName local name of element
    * @param xAttributes attributes of element
    */
  def startRootElement(uid: scala.Double, localName: java.lang.String, xAttributes: XAttributes): XElement
}

