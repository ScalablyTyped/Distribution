package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the {@link XController} interface
  * @since OOo 3.0
  */
trait XController2 extends XController {
  /**
    * denotes the "root window" of the controller.
    *
    * If the controller is plugged into a frame, this window acts as the frame's `ComponentWindow` .
    * @see XFrame
    */
  var ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /**
    * denotes the arguments used to create the instance.
    *
    * Usually, controllers are created via {@link XModel2.createViewController()} , where the caller can pass not only a controller name, but also arguments
    * parameterizing the to-be-created instance. Those arguments used at creation time can subsequently be retrieved using the `CreationArguments` member.
    */
  var CreationArguments: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * get the sidebar if exists
    * @since LibreOffice 5.1
    */
  val Sidebar: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XSidebarProvider
  /**
    * specifies the view name of the controller.
    *
    * A view name is a logical name, which can be used to create views of the same type. The name is meaningful only in conjunction with {@link
    * XModel2.createViewController()}if it's passed there, a view/controller pair of the same type will be created.
    */
  var ViewControllerName: java.lang.String
  /**
    * get the sidebar if exists
    * @since LibreOffice 5.1
    */
  def getSidebar(): activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XSidebarProvider
}

object XController2 {
  @scala.inline
  def apply(
    ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    CreationArguments: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Frame: XFrame,
    Model: XModel,
    Sidebar: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XSidebarProvider,
    ViewControllerName: java.lang.String,
    ViewData: js.Any,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachFrame: js.Function1[XFrame, scala.Unit],
    attachModel: js.Function1[XModel, scala.Boolean],
    dispose: js.Function0[scala.Unit],
    getFrame: js.Function0[XFrame],
    getModel: js.Function0[XModel],
    getSidebar: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XSidebarProvider],
    getViewData: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): XController2 = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow, CreationArguments = CreationArguments, Frame = Frame, Model = Model, Sidebar = Sidebar, ViewControllerName = ViewControllerName, ViewData = ViewData, acquire = acquire, addEventListener = addEventListener, attachFrame = attachFrame, attachModel = attachModel, dispose = dispose, getFrame = getFrame, getModel = getModel, getSidebar = getSidebar, getViewData = getViewData, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, restoreViewData = restoreViewData, suspend = suspend)
  
    __obj.asInstanceOf[XController2]
  }
}

