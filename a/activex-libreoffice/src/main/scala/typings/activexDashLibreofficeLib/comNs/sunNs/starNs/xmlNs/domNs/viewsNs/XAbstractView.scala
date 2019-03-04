package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAbstractView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Document: XDocumentView
  def getDocument(): XDocumentView
}

object XAbstractView {
  @scala.inline
  def apply(
    Document: XDocumentView,
    acquire: js.Function0[scala.Unit],
    getDocument: js.Function0[XDocumentView],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAbstractView = {
    val __obj = js.Dynamic.literal(Document = Document, acquire = acquire, getDocument = getDocument, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAbstractView]
  }
}

