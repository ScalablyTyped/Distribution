package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlProgressBar} . */
trait UnoControlProgressBarModel extends UnoControlModel {
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: scala.Double
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: scala.Double
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the fill color (RGB) of the control. */
  var FillColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies the progress value of the control. */
  var ProgressValue: scala.Double
  /** specifies the maximum progress value of the control. */
  var ProgressValueMax: scala.Double
  /** specifies the minimum progress value of the control. */
  var ProgressValueMin: scala.Double
}

