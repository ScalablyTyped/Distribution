package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a top level frame in the frame hierarchy with the desktop as root
  *
  * Please use the service {@link Frame} instead of this deprecated {@link Task} . If it's method {@link XFrame.isTop()} returns `TRUE` , it's the same as
  * a check for the {@link Task} service.
  * @deprecated Deprecated
  * @see Frame
  * @since OOo 1.1.2
  */
trait Task
  extends StObject
     with XTask
object Task {
  
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
  ): Task = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), arrangeWindowsHorizontal = js.Any.fromFunction0(arrangeWindowsHorizontal), arrangeWindowsVertical = js.Any.fromFunction0(arrangeWindowsVertical), close = js.Any.fromFunction0(close), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName), tileWindows = js.Any.fromFunction0(tileWindows))
    __obj.asInstanceOf[Task]
  }
}
