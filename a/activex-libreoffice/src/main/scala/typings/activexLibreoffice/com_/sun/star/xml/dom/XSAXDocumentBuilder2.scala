package typings.activexLibreoffice.com_.sun.star.xml.dom

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.xml.sax.XAttributeList
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import typings.activexLibreoffice.com_.sun.star.xml.sax.XLocator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link SAXDocumentBuilder} service to implement.
  * @since LibreOffice 4.0
  */
trait XSAXDocumentBuilder2
  extends XSAXDocumentBuilder
     with XDocumentHandler

object XSAXDocumentBuilder2 {
  @scala.inline
  def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: () => Unit,
    characters: String => Unit,
    endDocument: () => Unit,
    endDocumentFragment: () => Unit,
    endElement: String => Unit,
    getDocument: () => XDocument,
    getDocumentFragment: () => XDocumentFragment,
    getState: () => SAXDocumentBuilderState,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reset: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startDocument: () => Unit,
    startDocumentFragment: XDocument => Unit,
    startElement: (String, XAttributeList) => Unit
  ): XSAXDocumentBuilder2 = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], DocumentFragment = DocumentFragment.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endDocumentFragment = js.Any.fromFunction0(endDocumentFragment), endElement = js.Any.fromFunction1(endElement), getDocument = js.Any.fromFunction0(getDocument), getDocumentFragment = js.Any.fromFunction0(getDocumentFragment), getState = js.Any.fromFunction0(getState), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reset = js.Any.fromFunction0(reset), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startDocumentFragment = js.Any.fromFunction1(startDocumentFragment), startElement = js.Any.fromFunction2(startElement))
    __obj.asInstanceOf[XSAXDocumentBuilder2]
  }
}

