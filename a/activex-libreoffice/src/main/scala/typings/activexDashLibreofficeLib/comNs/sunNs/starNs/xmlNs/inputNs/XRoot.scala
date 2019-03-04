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

object XRoot {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    endDocument: js.Function0[scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator, scala.Unit],
    startDocument: js.Function1[XNamespaceMapping, scala.Unit],
    startRootElement: js.Function3[scala.Double, java.lang.String, XAttributes, XElement]
  ): XRoot = {
    val __obj = js.Dynamic.literal(acquire = acquire, endDocument = endDocument, processingInstruction = processingInstruction, queryInterface = queryInterface, release = release, setDocumentLocator = setDocumentLocator, startDocument = startDocument, startRootElement = startRootElement)
  
    __obj.asInstanceOf[XRoot]
  }
}

