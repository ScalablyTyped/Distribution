package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * enhances the {@link Presentation} service to give access to a {@link XPresentation2} interface.
  * @since OOo 3.0
  */
trait Presentation2
  extends Presentation
     with XPresentation2

object Presentation2 {
  @scala.inline
  def apply(
    AllowAnimations: scala.Boolean,
    Controller: XSlideShowController,
    CustomShow: java.lang.String,
    FirstPage: java.lang.String,
    IsAlwaysOnTop: scala.Boolean,
    IsAutomatic: scala.Boolean,
    IsEndless: scala.Boolean,
    IsFullScreen: scala.Boolean,
    IsLivePresentation: scala.Boolean,
    IsMouseVisible: scala.Boolean,
    Pause: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    StartWithNavigator: scala.Boolean,
    UsePen: scala.Boolean,
    acquire: js.Function0[scala.Unit],
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
    end: js.Function0[scala.Unit],
    getController: js.Function0[XSlideShowController],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    isRunning: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rehearseTimings: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    start: js.Function0[scala.Unit],
    startWithArguments: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): Presentation2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowAnimations")(AllowAnimations)
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("CustomShow")(CustomShow)
    __obj.updateDynamic("FirstPage")(FirstPage)
    __obj.updateDynamic("IsAlwaysOnTop")(IsAlwaysOnTop)
    __obj.updateDynamic("IsAutomatic")(IsAutomatic)
    __obj.updateDynamic("IsEndless")(IsEndless)
    __obj.updateDynamic("IsFullScreen")(IsFullScreen)
    __obj.updateDynamic("IsLivePresentation")(IsLivePresentation)
    __obj.updateDynamic("IsMouseVisible")(IsMouseVisible)
    __obj.updateDynamic("Pause")(Pause)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("StartWithNavigator")(StartWithNavigator)
    __obj.updateDynamic("UsePen")(UsePen)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("getController")(getController)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("isRunning")(isRunning)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("rehearseTimings")(rehearseTimings)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("startWithArguments")(startWithArguments)
    __obj.asInstanceOf[Presentation2]
  }
}

