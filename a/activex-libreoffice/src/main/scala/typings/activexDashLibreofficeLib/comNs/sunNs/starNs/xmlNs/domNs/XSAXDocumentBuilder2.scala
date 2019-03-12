package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link SAXDocumentBuilder} service to implement.
  * @since LibreOffice 4.0
  */
trait XSAXDocumentBuilder2
  extends XSAXDocumentBuilder
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler

object XSAXDocumentBuilder2 {
  @scala.inline
  def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    endDocument: () => scala.Unit,
    endDocumentFragment: () => scala.Unit,
    endElement: java.lang.String => scala.Unit,
    getDocument: () => XDocument,
    getDocumentFragment: () => XDocumentFragment,
    getState: () => SAXDocumentBuilderState,
    ignorableWhitespace: java.lang.String => scala.Unit,
    processingInstruction: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reset: () => scala.Unit,
    setDocumentLocator: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator => scala.Unit,
    startDocument: () => scala.Unit,
    startDocumentFragment: XDocument => scala.Unit,
    startElement: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList) => scala.Unit
  ): XSAXDocumentBuilder2 = {
    val __obj = js.Dynamic.literal(Document = Document, DocumentFragment = DocumentFragment, State = State, acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endDocumentFragment = js.Any.fromFunction0(endDocumentFragment), endElement = js.Any.fromFunction1(endElement), getDocument = js.Any.fromFunction0(getDocument), getDocumentFragment = js.Any.fromFunction0(getDocumentFragment), getState = js.Any.fromFunction0(getState), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reset = js.Any.fromFunction0(reset), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startDocumentFragment = js.Any.fromFunction1(startDocumentFragment), startElement = js.Any.fromFunction2(startElement))
  
    __obj.asInstanceOf[XSAXDocumentBuilder2]
  }
}

