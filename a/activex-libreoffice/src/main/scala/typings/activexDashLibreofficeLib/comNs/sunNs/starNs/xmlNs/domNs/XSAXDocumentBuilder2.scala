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
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endDocumentFragment: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    getDocument: js.Function0[XDocument],
    getDocumentFragment: js.Function0[XDocumentFragment],
    getState: js.Function0[SAXDocumentBuilderState],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator, scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startDocumentFragment: js.Function1[XDocument, scala.Unit],
    startElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList, 
      scala.Unit
    ]
  ): XSAXDocumentBuilder2 = {
    val __obj = js.Dynamic.literal(Document = Document, DocumentFragment = DocumentFragment, State = State, acquire = acquire, characters = characters, endDocument = endDocument, endDocumentFragment = endDocumentFragment, endElement = endElement, getDocument = getDocument, getDocumentFragment = getDocumentFragment, getState = getState, ignorableWhitespace = ignorableWhitespace, processingInstruction = processingInstruction, queryInterface = queryInterface, release = release, reset = reset, setDocumentLocator = setDocumentLocator, startDocument = startDocument, startDocumentFragment = startDocumentFragment, startElement = startElement)
  
    __obj.asInstanceOf[XSAXDocumentBuilder2]
  }
}

