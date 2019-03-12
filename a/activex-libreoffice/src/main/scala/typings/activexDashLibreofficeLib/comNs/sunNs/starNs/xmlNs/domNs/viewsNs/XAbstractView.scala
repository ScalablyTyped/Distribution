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
    acquire: () => scala.Unit,
    getDocument: () => XDocumentView,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAbstractView = {
    val __obj = js.Dynamic.literal(Document = Document, acquire = js.Any.fromFunction0(acquire), getDocument = js.Any.fromFunction0(getDocument), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAbstractView]
  }
}

