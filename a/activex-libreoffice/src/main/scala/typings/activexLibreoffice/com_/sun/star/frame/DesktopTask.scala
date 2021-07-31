package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Point
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * use the {@link Frame} service instead of this
  * @deprecated Deprecated
  */
trait DesktopTask
  extends StObject
     with XDesktopTask
     with XPropertySet
     with XWindowArranger
     with XFramesSupplier {
  
  var IsAlwaysVisible: Boolean
  
  var IsDesktop: Boolean
  
  var IsFloating: Boolean
  
  /** use th visible state of the frame container window instead of this */
  var IsVisible: Boolean
  
  /** use the position of the frame container window instead of this */
  var Position: Point
  
  /** use the size of the frame container window instead of this */
  var Size: typings.activexLibreoffice.com_.sun.star.awt.Size
  
  /** use property {@link Frame.Title} instead of that */
  var Title: String
  
  /**
    * use {@link com.sun.star.lang.XInitialization} instead.
    * @deprecated Deprecated
    */
  /* InferMemberOverrides */
  override def initialize(TaskWindow: XWindow): Unit
}
object DesktopTask {
  
  @scala.inline
  def apply(
    ActiveFrame: XFrame,
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Frames: XFrames,
    IsAlwaysVisible: Boolean,
    IsDesktop: Boolean,
    IsFloating: Boolean,
    IsVisible: Boolean,
    Name: String,
    Position: Point,
    PropertySetInfo: XPropertySetInfo,
    Size: Size,
    Title: String,
    acquire: () => Unit,
    activate: () => Unit,
    addEventListener: XEventListener => Unit,
    addFrameActionListener: XFrameActionListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    arrange: Double => Unit,
    close: () => Boolean,
    contextChanged: () => Unit,
    deactivate: () => Unit,
    dispose: () => Unit,
    findFrame: (String, Double) => XFrame,
    getActiveFrame: () => XFrame,
    getComponentWindow: () => XWindow,
    getContainerWindow: () => XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getFrames: () => XFrames,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    hasArrangeCommand: Double => Boolean,
    initialize: XWindow => Unit,
    isActive: () => Boolean,
    isTop: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFrameActionListener: XFrameActionListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setActiveFrame: XFrame => Unit,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DesktopTask = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame.asInstanceOf[js.Any], ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Frames = Frames.asInstanceOf[js.Any], IsAlwaysVisible = IsAlwaysVisible.asInstanceOf[js.Any], IsDesktop = IsDesktop.asInstanceOf[js.Any], IsFloating = IsFloating.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), arrange = js.Any.fromFunction1(arrange), close = js.Any.fromFunction0(close), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = js.Any.fromFunction0(getActiveFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getFrames = js.Any.fromFunction0(getFrames), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setActiveFrame = js.Any.fromFunction1(setActiveFrame), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DesktopTask]
  }
  
  @scala.inline
  implicit class DesktopTaskMutableBuilder[Self <: DesktopTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialize(value: XWindow => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAlwaysVisible(value: Boolean): Self = StObject.set(x, "IsAlwaysVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDesktop(value: Boolean): Self = StObject.set(x, "IsDesktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFloating(value: Boolean): Self = StObject.set(x, "IsFloating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Point): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
