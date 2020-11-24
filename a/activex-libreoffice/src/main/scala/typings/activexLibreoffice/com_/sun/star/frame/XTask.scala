package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XFrame} instead of this one
  * @deprecated Deprecated
  */
@js.native
trait XTask extends XFrame {
  
  /** @deprecated Deprecated */
  def arrangeWindowsHorizontal(): Unit = js.native
  
  /** @deprecated Deprecated */
  def arrangeWindowsVertical(): Unit = js.native
  
  /**
    * use {@link com.sun.star.util.XCloseable} or {@link com.sun.star.lang.XComponent.dispose()} at a {@link Frame} instead of this one
    * @deprecated Deprecated
    */
  def close(): Boolean = js.native
  
  /** @deprecated Deprecated */
  def tileWindows(): Unit = js.native
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
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), arrangeWindowsHorizontal = js.Any.fromFunction0(arrangeWindowsHorizontal), arrangeWindowsVertical = js.Any.fromFunction0(arrangeWindowsVertical), close = js.Any.fromFunction0(close), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName), tileWindows = js.Any.fromFunction0(tileWindows))
    __obj.asInstanceOf[XTask]
  }
  
  @scala.inline
  implicit class XTaskOps[Self <: XTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrangeWindowsHorizontal(value: () => Unit): Self = this.set("arrangeWindowsHorizontal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setArrangeWindowsVertical(value: () => Unit): Self = this.set("arrangeWindowsVertical", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Boolean): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTileWindows(value: () => Unit): Self = this.set("tileWindows", js.Any.fromFunction0(value))
  }
}
