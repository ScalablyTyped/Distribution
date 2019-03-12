package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Builds a new dom tree */
trait XSAXDocumentBuilder
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Document: XDocument
  val DocumentFragment: XDocumentFragment
  val State: SAXDocumentBuilderState
  def endDocumentFragment(): scala.Unit
  def getDocument(): XDocument
  def getDocumentFragment(): XDocumentFragment
  def getState(): SAXDocumentBuilderState
  def reset(): scala.Unit
  def startDocumentFragment(ownerDoc: XDocument): scala.Unit
}

object XSAXDocumentBuilder {
  @scala.inline
  def apply(
    Document: XDocument,
    DocumentFragment: XDocumentFragment,
    State: SAXDocumentBuilderState,
    acquire: () => scala.Unit,
    endDocumentFragment: () => scala.Unit,
    getDocument: () => XDocument,
    getDocumentFragment: () => XDocumentFragment,
    getState: () => SAXDocumentBuilderState,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    reset: () => scala.Unit,
    startDocumentFragment: XDocument => scala.Unit
  ): XSAXDocumentBuilder = {
    val __obj = js.Dynamic.literal(Document = Document, DocumentFragment = DocumentFragment, State = State, acquire = js.Any.fromFunction0(acquire), endDocumentFragment = js.Any.fromFunction0(endDocumentFragment), getDocument = js.Any.fromFunction0(getDocument), getDocumentFragment = js.Any.fromFunction0(getDocumentFragment), getState = js.Any.fromFunction0(getState), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), reset = js.Any.fromFunction0(reset), startDocumentFragment = js.Any.fromFunction1(startDocumentFragment))
  
    __obj.asInstanceOf[XSAXDocumentBuilder]
  }
}

