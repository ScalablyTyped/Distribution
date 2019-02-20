package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies the ControlModel for an edit field which contains a currency value. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlCurrencyFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, Border, BorderColor, CurrencySymbol, DecimalAccuracy, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, HideInactiveSelection, MouseWheelBehavior, PrependCurrencySymbol, Printable, ReadOnly, Repeat, RepeatDelay, ShowThousandsSeparator, Spin, StrictFormat, Tabstop, TextColor, TextLineColor, Value, ValueMax, ValueMin, ValueStep, VerticalAlign, WritingMode */ @js.native
trait CurrencyField
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControlModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XReset {
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: scala.Double = js.native
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: scala.Double = js.native
  /** specifies the currency symbol. */
  var CurrencySymbol: java.lang.String = js.native
  /** specifies the decimal accuracy. */
  var DecimalAccuracy: scala.Double = js.native
  /**
    * contains a default value for the control.
    * @see com.sun.star.awt.UnoControlCurrencyFieldModel.Value
    * @see com.sun.star.form.XReset
    */
  var DefaultValue: scala.Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double = js.native
  /** specifies the help text of the control. */
  var HelpText: java.lang.String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String = js.native
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: scala.Boolean = js.native
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: scala.Double = js.native
  /** specifies whether the currency symbol is to be prepended. */
  var PrependCurrencySymbol: scala.Boolean = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean = js.native
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: scala.Boolean = js.native
  /**
    * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
    * @since OOo 2.0
    */
  var Repeat: scala.Boolean = js.native
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: scala.Double = js.native
  /** specifies whether the thousands separator is to be displayed. */
  var ShowThousandsSeparator: scala.Boolean = js.native
  /** specifies that the control has a spin button. */
  var Spin: scala.Boolean = js.native
  /** specifies that the value is checked during the user input. */
  var StrictFormat: scala.Boolean = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** specifies the value displayed in the control. */
  var Value: scala.Double = js.native
  /** specifies the maximum value that can be entered. */
  var ValueMax: scala.Double = js.native
  /** specifies the minimum value that can be entered. */
  var ValueMin: scala.Double = js.native
  /** specifies the value step when using the spin button. */
  var ValueStep: scala.Double = js.native
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment = js.native
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: scala.Double = js.native
}

