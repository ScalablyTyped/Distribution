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
    acquire: js.Function0[scala.Unit],
    endDocumentFragment: js.Function0[scala.Unit],
    getDocument: js.Function0[XDocument],
    getDocumentFragment: js.Function0[XDocumentFragment],
    getState: js.Function0[SAXDocumentBuilderState],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    startDocumentFragment: js.Function1[XDocument, scala.Unit]
  ): XSAXDocumentBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Document")(Document)
    __obj.updateDynamic("DocumentFragment")(DocumentFragment)
    __obj.updateDynamic("State")(State)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("endDocumentFragment")(endDocumentFragment)
    __obj.updateDynamic("getDocument")(getDocument)
    __obj.updateDynamic("getDocumentFragment")(getDocumentFragment)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("startDocumentFragment")(startDocumentFragment)
    __obj.asInstanceOf[XSAXDocumentBuilder]
  }
}

