package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds a new dom tree */
trait XDocumentBuilder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Obtain an instance of a DOMImplementation object. */
  val DOMImplementation: XDOMImplementation
  /** Obtain an instance of a DOMImplementation object. */
  def getDOMImplementation(): XDOMImplementation
  /** Indicates whether or not this parser is configured to understand namespaces. */
  def isNamespaceAware(): scala.Boolean
  /** Indicates whether or not this parser is configured to validate XML documents. */
  def isValidating(): scala.Boolean
  /** Obtain a new instance of a DOM Document object to build a DOM tree with. */
  def newDocument(): XDocument
  /** Parse the content of the given InputStream as an XML document and return a new DOM Document object. */
  def parse(is: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream): XDocument
  /** Parse the content of the given URI as an XML document and return a new DOM Document object. */
  def parseURI(uri: java.lang.String): XDocument
  /** Specify the EntityResolver to be used to resolve entities present in the XML document to be parsed. */
  def setEntityResolver(er: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XEntityResolver): scala.Unit
  /** Specify the ErrorHandler to be used to report errors present in the XML document to be parsed. */
  def setErrorHandler(eh: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XErrorHandler): scala.Unit
}

object XDocumentBuilder {
  @scala.inline
  def apply(
    DOMImplementation: XDOMImplementation,
    acquire: () => scala.Unit,
    getDOMImplementation: () => XDOMImplementation,
    isNamespaceAware: () => scala.Boolean,
    isValidating: () => scala.Boolean,
    newDocument: () => XDocument,
    parse: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XInputStream => XDocument,
    parseURI: java.lang.String => XDocument,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setEntityResolver: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XEntityResolver => scala.Unit,
    setErrorHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XErrorHandler => scala.Unit
  ): XDocumentBuilder = {
    val __obj = js.Dynamic.literal(DOMImplementation = DOMImplementation, acquire = js.Any.fromFunction0(acquire), getDOMImplementation = js.Any.fromFunction0(getDOMImplementation), isNamespaceAware = js.Any.fromFunction0(isNamespaceAware), isValidating = js.Any.fromFunction0(isValidating), newDocument = js.Any.fromFunction0(newDocument), parse = js.Any.fromFunction1(parse), parseURI = js.Any.fromFunction1(parseURI), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEntityResolver = js.Any.fromFunction1(setEntityResolver), setErrorHandler = js.Any.fromFunction1(setErrorHandler))
  
    __obj.asInstanceOf[XDocumentBuilder]
  }
}

