package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.viewsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAbstractView extends XInterface {
  val Document: XDocumentView
  def getDocument(): XDocumentView
}

object XAbstractView {
  @scala.inline
  def apply(
    Document: XDocumentView,
    acquire: () => Unit,
    getDocument: () => XDocumentView,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAbstractView = {
    val __obj = js.Dynamic.literal(Document = Document, acquire = js.Any.fromFunction0(acquire), getDocument = js.Any.fromFunction0(getDocument), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAbstractView]
  }
}

