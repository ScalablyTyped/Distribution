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

