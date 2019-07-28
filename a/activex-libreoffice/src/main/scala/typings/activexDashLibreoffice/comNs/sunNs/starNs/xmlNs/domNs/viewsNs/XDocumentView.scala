package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.viewsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentView extends XInterface {
  val DefaultView: XAbstractView
  def getDefaultView(): XAbstractView
}

object XDocumentView {
  @scala.inline
  def apply(
    DefaultView: XAbstractView,
    acquire: () => Unit,
    getDefaultView: () => XAbstractView,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentView = {
    val __obj = js.Dynamic.literal(DefaultView = DefaultView, acquire = js.Any.fromFunction0(acquire), getDefaultView = js.Any.fromFunction0(getDefaultView), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentView]
  }
}

