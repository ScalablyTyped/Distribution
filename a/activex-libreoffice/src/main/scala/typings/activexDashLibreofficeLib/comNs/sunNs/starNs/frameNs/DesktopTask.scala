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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveFrame")(ActiveFrame)
    __obj.updateDynamic("ComponentWindow")(ComponentWindow)
    __obj.updateDynamic("ContainerWindow")(ContainerWindow)
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("Creator")(Creator)
    __obj.updateDynamic("Frames")(Frames)
    __obj.updateDynamic("IsAlwaysVisible")(IsAlwaysVisible)
    __obj.updateDynamic("IsDesktop")(IsDesktop)
    __obj.updateDynamic("IsFloating")(IsFloating)
    __obj.updateDynamic("IsVisible")(IsVisible)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("Position")(Position)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFrameActionListener")(addFrameActionListener)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("arrange")(arrange)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("contextChanged")(contextChanged)
    __obj.updateDynamic("deactivate")(deactivate)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("findFrame")(findFrame)
    __obj.updateDynamic("getActiveFrame")(getActiveFrame)
    __obj.updateDynamic("getComponentWindow")(getComponentWindow)
    __obj.updateDynamic("getContainerWindow")(getContainerWindow)
    __obj.updateDynamic("getController")(getController)
    __obj.updateDynamic("getCreator")(getCreator)
    __obj.updateDynamic("getFrames")(getFrames)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("hasArrangeCommand")(hasArrangeCommand)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isTop")(isTop)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFrameActionListener")(removeFrameActionListener)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setActiveFrame")(setActiveFrame)
    __obj.updateDynamic("setComponent")(setComponent)
    __obj.updateDynamic("setCreator")(setCreator)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[DesktopTask]
  }
}

