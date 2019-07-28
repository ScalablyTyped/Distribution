package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds a new dom tree */
trait XSAXDocumentBuilder extends XInterface {
  val Document: XDocument
  val DocumentFragment: XDocumentFragment
  val State: SAXDocumentBuilderState
  def endDocumentFragment(): Unit
  def getDocument(): XDocument
  def getDocumentFragment(): XDocumentFragment
  def getState(): SAXDocumentBuilderState
  def reset(): Unit
  def startDocumentFragment(ownerDoc: XDocument): Unit
}

object XSAXDocumentBuilder {
  @scala.inline
  def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: () => Unit,
    endDocumentFragment: () => Unit,
    getDocument: () => XDocument,
    getDocumentFragment: () => XDocumentFragment,
    getState: () => SAXDocumentBuilderState,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    reset: () => Unit,
    startDocumentFragment: XDocument => Unit
  ): XSAXDocumentBuilder = {
    val __obj = js.Dynamic.literal(Document = Document, DocumentFragment = DocumentFragment, State = State, acquire = js.Any.fromFunction0(acquire), endDocumentFragment = js.Any.fromFunction0(endDocumentFragment), getDocument = js.Any.fromFunction0(getDocument), getDocumentFragment = js.Any.fromFunction0(getDocumentFragment), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reset = js.Any.fromFunction0(reset), startDocumentFragment = js.Any.fromFunction1(startDocumentFragment))
  
    __obj.asInstanceOf[XSAXDocumentBuilder]
  }
}

