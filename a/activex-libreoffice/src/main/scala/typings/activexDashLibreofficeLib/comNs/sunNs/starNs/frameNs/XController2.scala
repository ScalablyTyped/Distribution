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

