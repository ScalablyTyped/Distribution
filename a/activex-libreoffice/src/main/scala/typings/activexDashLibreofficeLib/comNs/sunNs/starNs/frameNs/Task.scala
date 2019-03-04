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
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow, ContainerWindow = ContainerWindow, Controller = Controller, Creator = Creator, Name = Name, acquire = acquire, activate = activate, addEventListener = addEventListener, addFrameActionListener = addFrameActionListener, arrangeWindowsHorizontal = arrangeWindowsHorizontal, arrangeWindowsVertical = arrangeWindowsVertical, close = close, contextChanged = contextChanged, deactivate = deactivate, dispose = dispose, findFrame = findFrame, getComponentWindow = getComponentWindow, getContainerWindow = getContainerWindow, getController = getController, getCreator = getCreator, getName = getName, initialize = initialize, isActive = isActive, isTop = isTop, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeFrameActionListener = removeFrameActionListener, setComponent = setComponent, setCreator = setCreator, setName = setName, tileWindows = tileWindows)
  
    __obj.asInstanceOf[Task]
  }
}

