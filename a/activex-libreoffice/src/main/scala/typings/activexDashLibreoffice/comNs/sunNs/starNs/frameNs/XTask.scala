package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use {@link XFrame} instead of this one
  * @deprecated Deprecated
  */
trait XTask extends XFrame {
  /** @deprecated Deprecated */
  def arrangeWindowsHorizontal(): Unit
  /** @deprecated Deprecated */
  def arrangeWindowsVertical(): Unit
  /**
    * use {@link com.sun.star.util.XCloseable} or {@link com.sun.star.lang.XComponent.dispose()} at a {@link Frame} instead of this one
    * @deprecated Deprecated
    */
  def close(): Boolean
  /** @deprecated Deprecated */
  def tileWindows(): Unit
}

object XTask {
  @scala.inline
  def apply(
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Name: String,
    acquire: () => Unit,
    activate: () => Unit,
    addEventListener: XEventListener => Unit,
    addFrameActionListener: XFrameActionListener => Unit,
    arrangeWindowsHorizontal: () => Unit,
    arrangeWindowsVertical: () => Unit,
    close: () => Boolean,
    contextChanged: () => Unit,
    deactivate: () => Unit,
    dispose: () => Unit,
    findFrame: (String, Double) => XFrame,
    getComponentWindow: () => XWindow,
    getContainerWindow: () => XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getName: () => String,
    initialize: XWindow => Unit,
    isActive: () => Boolean,
    isTop: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFrameActionListener: XFrameActionListener => Unit,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Unit,
    setName: String => Unit,
    tileWindows: () => Unit
  ): XTask = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow, ContainerWindow = ContainerWindow, Controller = Controller, Creator = Creator, Name = Name, acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), arrangeWindowsHorizontal = js.Any.fromFunction0(arrangeWindowsHorizontal), arrangeWindowsVertical = js.Any.fromFunction0(arrangeWindowsVertical), close = js.Any.fromFunction0(close), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName), tileWindows = js.Any.fromFunction0(tileWindows))
  
    __obj.asInstanceOf[XTask]
  }
}

