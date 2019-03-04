package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val DefaultView: XAbstractView
  def getDefaultView(): XAbstractView
}

object XDocumentView {
  @scala.inline
  def apply(
    DefaultView: XAbstractView,
    acquire: js.Function0[scala.Unit],
    getDefaultView: js.Function0[XAbstractView],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDocumentView = {
    val __obj = js.Dynamic.literal(DefaultView = DefaultView, acquire = acquire, getDefaultView = getDefaultView, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDocumentView]
  }
}

