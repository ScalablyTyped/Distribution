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
    acquire: () => scala.Unit,
    activate: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFrameActionListener: XFrameActionListener => scala.Unit,
    arrangeWindowsHorizontal: () => scala.Unit,
    arrangeWindowsVertical: () => scala.Unit,
    close: () => scala.Boolean,
    contextChanged: () => scala.Unit,
    deactivate: () => scala.Unit,
    dispose: () => scala.Unit,
    findFrame: (java.lang.String, scala.Double) => XFrame,
    getComponentWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getContainerWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getName: () => java.lang.String,
    initialize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => scala.Unit,
    isActive: () => scala.Boolean,
    isTop: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFrameActionListener: XFrameActionListener => scala.Unit,
    setComponent: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, XController) => scala.Boolean,
    setCreator: XFramesSupplier => scala.Unit,
    setName: java.lang.String => scala.Unit,
    tileWindows: () => scala.Unit
  ): Task = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow, ContainerWindow = ContainerWindow, Controller = Controller, Creator = Creator, Name = Name, acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), arrangeWindowsHorizontal = js.Any.fromFunction0(arrangeWindowsHorizontal), arrangeWindowsVertical = js.Any.fromFunction0(arrangeWindowsVertical), close = js.Any.fromFunction0(close), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName), tileWindows = js.Any.fromFunction0(tileWindows))
  
    __obj.asInstanceOf[Task]
  }
}

