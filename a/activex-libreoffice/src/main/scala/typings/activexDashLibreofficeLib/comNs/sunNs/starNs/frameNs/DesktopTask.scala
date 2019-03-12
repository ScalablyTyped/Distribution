package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * use the {@link Frame} service instead of this
  * @deprecated Deprecated
  */
trait DesktopTask
  extends XFramesSupplier
     with XDesktopTask
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XWindowArranger {
  var IsAlwaysVisible: scala.Boolean
  var IsDesktop: scala.Boolean
  var IsFloating: scala.Boolean
  /** use th visible state of the frame container window instead of this */
  var IsVisible: scala.Boolean
  /** use the position of the frame container window instead of this */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** use the size of the frame container window instead of this */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** use property {@link Frame.Title} instead of that */
  var Title: java.lang.String
  /**
    * use {@link com.sun.star.lang.XInitialization} instead.
    * @deprecated Deprecated
    */
  /* InferMemberOverrides */
  override def initialize(TaskWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow): scala.Unit
}

object DesktopTask {
  @scala.inline
  def apply(
    ActiveFrame: XFrame,
    ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Frames: XFrames,
    IsAlwaysVisible: scala.Boolean,
    IsDesktop: scala.Boolean,
    IsFloating: scala.Boolean,
    IsVisible: scala.Boolean,
    Name: java.lang.String,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Title: java.lang.String,
    acquire: () => scala.Unit,
    activate: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFrameActionListener: XFrameActionListener => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    arrange: scala.Double => scala.Unit,
    close: () => scala.Boolean,
    contextChanged: () => scala.Unit,
    deactivate: () => scala.Unit,
    dispose: () => scala.Unit,
    findFrame: (java.lang.String, scala.Double) => XFrame,
    getActiveFrame: () => XFrame,
    getComponentWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getContainerWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getFrames: () => XFrames,
    getName: () => java.lang.String,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    hasArrangeCommand: scala.Double => scala.Boolean,
    initialize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => scala.Unit,
    isActive: () => scala.Boolean,
    isTop: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFrameActionListener: XFrameActionListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setActiveFrame: XFrame => scala.Unit,
    setComponent: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, XController) => scala.Boolean,
    setCreator: XFramesSupplier => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): DesktopTask = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame, ComponentWindow = ComponentWindow, ContainerWindow = ContainerWindow, Controller = Controller, Creator = Creator, Frames = Frames, IsAlwaysVisible = IsAlwaysVisible, IsDesktop = IsDesktop, IsFloating = IsFloating, IsVisible = IsVisible, Name = Name, Position = Position, PropertySetInfo = PropertySetInfo, Size = Size, Title = Title, acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), arrange = js.Any.fromFunction1(arrange), close = js.Any.fromFunction0(close), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = js.Any.fromFunction0(getActiveFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getFrames = js.Any.fromFunction0(getFrames), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasArrangeCommand = js.Any.fromFunction1(hasArrangeCommand), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setActiveFrame = js.Any.fromFunction1(setActiveFrame), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[DesktopTask]
  }
}

