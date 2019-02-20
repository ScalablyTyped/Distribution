package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the standard model of an {@link UnoControlSpinButton} .
  *
  * A spin button is a control which has a numeric value associated with it, and allows to change this value using two spin buttons.
  *
  * A spin button is similar to a scroll bar, but it usually has no (own) visual representation of the associated value, but is used to propagate its
  * value to other controls.
  * @see UnoControlScrollBarModel
  */
trait UnoControlSpinButtonModel extends UnoControlModel {
  /** specifies the RGB color to be used for the control */
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
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: scala.Double
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: scala.Double
  /** specifies whether the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed. */
  var Repeat: scala.Boolean
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    */
  var RepeatDelay: scala.Double
  /** specifies the increment by which the value is changed when using operating the spin button. */
  var SpinIncrement: scala.Double
  /** specifies the current value of the control. */
  var SpinValue: scala.Double
  /** specifies the maximum value of the control. */
  var SpinValueMax: scala.Double
  /** specifies the minimum value of the control. */
  var SpinValueMin: scala.Double
  /** specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons. */
  var SymbolColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
}

