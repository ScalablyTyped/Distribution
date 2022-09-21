package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use {@link XFrame} instead of this one
  * @deprecated Deprecated
  */
trait XTask
  extends StObject
     with XFrame {
  
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
  
  inline def apply(
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
    queryInterface: `type` => Any,
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
  
  extension [Self <: XTask](x: Self) {
    
    inline def setArrangeWindowsHorizontal(value: () => Unit): Self = StObject.set(x, "arrangeWindowsHorizontal", js.Any.fromFunction0(value))
    
    inline def setArrangeWindowsVertical(value: () => Unit): Self = StObject.set(x, "arrangeWindowsVertical", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Boolean): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setTileWindows(value: () => Unit): Self = StObject.set(x, "tileWindows", js.Any.fromFunction0(value))
  }
}
