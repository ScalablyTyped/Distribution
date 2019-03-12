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
  var CreationArguments: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
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
    CreationArguments: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Frame: XFrame,
    Model: XModel,
    Sidebar: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XSidebarProvider,
    ViewControllerName: java.lang.String,
    ViewData: js.Any,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attachFrame: XFrame => scala.Unit,
    attachModel: XModel => scala.Boolean,
    dispose: () => scala.Unit,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getSidebar: () => activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XSidebarProvider,
    getViewData: () => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    restoreViewData: js.Any => scala.Unit,
    suspend: scala.Boolean => scala.Boolean
  ): XController2 = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow, CreationArguments = CreationArguments, Frame = Frame, Model = Model, Sidebar = Sidebar, ViewControllerName = ViewControllerName, ViewData = ViewData, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSidebar = js.Any.fromFunction0(getSidebar), getViewData = js.Any.fromFunction0(getViewData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), restoreViewData = js.Any.fromFunction1(restoreViewData), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[XController2]
  }
}

