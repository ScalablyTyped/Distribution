package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.presentationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service is a presentation that is available from a {@link PresentationDocument} via the {@link XPresentationSupplier} interface. */
trait Presentation
  extends XPresentation
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** enables/disables the shape animations. */
  var AllowAnimations: scala.Boolean
  /** If this string is not empty, it contains the name of a customized show that is used for the presentation. */
  var CustomShow: java.lang.String
  /** If this string is not empty, it contains the name of the page where the presentation is started. */
  var FirstPage: java.lang.String
  /** If this property is set to `TRUE` , the window of the presentation is always on top of all other windows. */
  var IsAlwaysOnTop: scala.Boolean
  /**
    * If this property is `TRUE` , all pages are changed automatically.
    *
    * This overrides the properties of the pages.
    */
  var IsAutomatic: scala.Boolean
  /** If this property is set to `TRUE` , the presentation is repeated endlessly. */
  var IsEndless: scala.Boolean
  /** If this property is set to `TRUE` , the presentation runs in full-screen mode. */
  var IsFullScreen: scala.Boolean
  /**
    * With this property, you can set the presentation to live mode.
    *
    * Implementations that have no live mode capability may ignore this property and always return false.
    */
  var IsLivePresentation: scala.Boolean
  /** If this property is `TRUE` , the mouse is visible during the presentation. */
  var IsMouseVisible: scala.Boolean
  /**
    * is the duration of the black screen after the presentation has finished.
    *
    * If this is set to `0` , no black screen is shown.
    */
  var Pause: scala.Double
  /** If this is set to `TRUE` , the Navigator is opened at the start of the presentation. */
  var StartWithNavigator: scala.Boolean
  /**
    * If this is `TRUE` , a pen is shown during presentation.
    *
    * You can draw on the presentation with this pen.
    */
  var UsePen: scala.Boolean
}

object Presentation {
  @scala.inline
  def apply(
    AllowAnimations: scala.Boolean,
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
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
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
    start: js.Function0[scala.Unit]
  ): Presentation = {
    val __obj = js.Dynamic.literal(AllowAnimations = AllowAnimations, CustomShow = CustomShow, FirstPage = FirstPage, IsAlwaysOnTop = IsAlwaysOnTop, IsAutomatic = IsAutomatic, IsEndless = IsEndless, IsFullScreen = IsFullScreen, IsLivePresentation = IsLivePresentation, IsMouseVisible = IsMouseVisible, Pause = Pause, PropertySetInfo = PropertySetInfo, StartWithNavigator = StartWithNavigator, UsePen = UsePen, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, end = end, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, rehearseTimings = rehearseTimings, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, start = start)
  
    __obj.asInstanceOf[Presentation]
  }
}

