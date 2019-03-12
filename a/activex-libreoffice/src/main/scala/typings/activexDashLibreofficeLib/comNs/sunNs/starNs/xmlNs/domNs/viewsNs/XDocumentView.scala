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
    acquire: () => scala.Unit,
    getDefaultView: () => XAbstractView,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDocumentView = {
    val __obj = js.Dynamic.literal(DefaultView = DefaultView, acquire = js.Any.fromFunction0(acquire), getDefaultView = js.Any.fromFunction0(getDefaultView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentView]
  }
}

