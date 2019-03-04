package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait StartModule extends XController {
  def createWithParentWindow(ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
}

object StartModule {
  @scala.inline
  def apply(
    Frame: XFrame,
    Model: XModel,
    ViewData: js.Any,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachFrame: js.Function1[XFrame, scala.Unit],
    attachModel: js.Function1[XModel, scala.Boolean],
    createWithParentWindow: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getFrame: js.Function0[XFrame],
    getModel: js.Function0[XModel],
    getViewData: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): StartModule = {
    val __obj = js.Dynamic.literal(Frame = Frame, Model = Model, ViewData = ViewData, acquire = acquire, addEventListener = addEventListener, attachFrame = attachFrame, attachModel = attachModel, createWithParentWindow = createWithParentWindow, dispose = dispose, getFrame = getFrame, getModel = getModel, getViewData = getViewData, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, restoreViewData = restoreViewData, suspend = suspend)
  
    __obj.asInstanceOf[StartModule]
  }
}

