package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.FormControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XReset
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the model of a scroll bar control. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlSpinButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, Enabled, HelpText, HelpURL, MouseWheelBehavior, Orientation, Printable, Repeat, RepeatDelay, SpinIncrement, SpinValue, SpinValueMax, SpinValueMin, SymbolColor */ @js.native
trait SpinButton
  extends FormControlModel
     with XReset {
  /** specifies the RGB color to be used for the control */
  var BackgroundColor: Color = js.native
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double = js.native
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double = js.native
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    * @see com.sun.star.awt.UnoControlSpinButtonModel.SpinValue
    * @see com.sun.star.form.XReset
    */
  var DefaultSpinValue: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: Double = js.native
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: Double = js.native
  /** specifies whether the control will be printed with the document. */
  var Printable: Boolean = js.native
  /** specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed. */
  var Repeat: Boolean = js.native
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    */
  var RepeatDelay: Double = js.native
  /** specifies the increment by which the value is changed when using operating the spin button. */
  var SpinIncrement: Double = js.native
  /** specifies the current value of the control. */
  var SpinValue: Double = js.native
  /** specifies the maximum value of the control. */
  var SpinValueMax: Double = js.native
  /** specifies the minimum value of the control. */
  var SpinValueMin: Double = js.native
  /** specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons. */
  var SymbolColor: Color = js.native
}

