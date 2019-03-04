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
    val __obj = js.Dynamic.literal(AllowAnimations = AllowAnimations, Controller = Controller, CustomShow = CustomShow, FirstPage = FirstPage, IsAlwaysOnTop = IsAlwaysOnTop, IsAutomatic = IsAutomatic, IsEndless = IsEndless, IsFullScreen = IsFullScreen, IsLivePresentation = IsLivePresentation, IsMouseVisible = IsMouseVisible, Pause = Pause, PropertySetInfo = PropertySetInfo, StartWithNavigator = StartWithNavigator, UsePen = UsePen, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, end = end, getController = getController, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, isRunning = isRunning, queryInterface = queryInterface, rehearseTimings = rehearseTimings, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, start = start, startWithArguments = startWithArguments)
  
    __obj.asInstanceOf[Presentation2]
  }
}

