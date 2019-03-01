package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a top level frame in the frame hierarchy with the desktop as root
  *
  * Please use the service {@link Frame} instead of this deprecated {@link Task} . If it's method {@link XFrame.isTop()} returns `TRUE` , it's the same as
  * a check for the {@link Task} service.
  * @deprecated Deprecated
  * @see Frame
  * @since OOo 1.1.2
  */
trait Task extends XTask

object Task {
  @scala.inline
  def apply(
    ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Name: java.lang.String,
    acquire: js.Function0[scala.Unit],
    activate: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    arrangeWindowsHorizontal: js.Function0[scala.Unit],
    arrangeWindowsVertical: js.Function0[scala.Unit],
    close: js.Function0[scala.Boolean],
    contextChanged: js.Function0[scala.Unit],
    deactivate: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    findFrame: js.Function2[java.lang.String, scala.Double, XFrame],
    getComponentWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getContainerWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getController: js.Function0[XController],
    getCreator: js.Function0[XFramesSupplier],
    getName: js.Function0[java.lang.String],
    initialize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    isActive: js.Function0[scala.Boolean],
    isTop: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    setComponent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      XController, 
      scala.Boolean
    ],
    setCreator: js.Function1[XFramesSupplier, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    tileWindows: js.Function0[scala.Unit]
  ): Task = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ComponentWindow")(ComponentWindow)
    __obj.updateDynamic("ContainerWindow")(ContainerWindow)
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("Creator")(Creator)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFrameActionListener")(addFrameActionListener)
    __obj.updateDynamic("arrangeWindowsHorizontal")(arrangeWindowsHorizontal)
    __obj.updateDynamic("arrangeWindowsVertical")(arrangeWindowsVertical)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("contextChanged")(contextChanged)
    __obj.updateDynamic("deactivate")(deactivate)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("findFrame")(findFrame)
    __obj.updateDynamic("getComponentWindow")(getComponentWindow)
    __obj.updateDynamic("getContainerWindow")(getContainerWindow)
    __obj.updateDynamic("getController")(getController)
    __obj.updateDynamic("getCreator")(getCreator)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isTop")(isTop)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFrameActionListener")(removeFrameActionListener)
    __obj.updateDynamic("setComponent")(setComponent)
    __obj.updateDynamic("setCreator")(setCreator)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("tileWindows")(tileWindows)
    __obj.asInstanceOf[Task]
  }
}

