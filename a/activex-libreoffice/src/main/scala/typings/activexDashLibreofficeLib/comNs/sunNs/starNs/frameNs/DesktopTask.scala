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
    acquire: js.Function0[scala.Unit],
    activate: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    arrange: js.Function1[scala.Double, scala.Unit],
    close: js.Function0[scala.Boolean],
    contextChanged: js.Function0[scala.Unit],
    deactivate: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    findFrame: js.Function2[java.lang.String, scala.Double, XFrame],
    getActiveFrame: js.Function0[XFrame],
    getComponentWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getContainerWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getController: js.Function0[XController],
    getCreator: js.Function0[XFramesSupplier],
    getFrames: js.Function0[XFrames],
    getName: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    hasArrangeCommand: js.Function1[scala.Double, scala.Boolean],
    initialize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    isActive: js.Function0[scala.Boolean],
    isTop: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setActiveFrame: js.Function1[XFrame, scala.Unit],
    setComponent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      XController, 
      scala.Boolean
    ],
    setCreator: js.Function1[XFramesSupplier, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): DesktopTask = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame, ComponentWindow = ComponentWindow, ContainerWindow = ContainerWindow, Controller = Controller, Creator = Creator, Frames = Frames, IsAlwaysVisible = IsAlwaysVisible, IsDesktop = IsDesktop, IsFloating = IsFloating, IsVisible = IsVisible, Name = Name, Position = Position, PropertySetInfo = PropertySetInfo, Size = Size, Title = Title, acquire = acquire, activate = activate, addEventListener = addEventListener, addFrameActionListener = addFrameActionListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, arrange = arrange, close = close, contextChanged = contextChanged, deactivate = deactivate, dispose = dispose, findFrame = findFrame, getActiveFrame = getActiveFrame, getComponentWindow = getComponentWindow, getContainerWindow = getContainerWindow, getController = getController, getCreator = getCreator, getFrames = getFrames, getName = getName, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, hasArrangeCommand = hasArrangeCommand, initialize = initialize, isActive = isActive, isTop = isTop, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeFrameActionListener = removeFrameActionListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setActiveFrame = setActiveFrame, setComponent = setComponent, setCreator = setCreator, setName = setName, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[DesktopTask]
  }
}

