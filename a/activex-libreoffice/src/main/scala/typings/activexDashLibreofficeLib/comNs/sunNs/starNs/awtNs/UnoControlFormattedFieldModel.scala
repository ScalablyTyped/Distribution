package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlFormattedField} . */
trait UnoControlFormattedFieldModel extends UnoControlModel {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: scala.Double
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
  /**
    * specifies the default value of the formatted field.
    *
    * This may be a numeric value (double) or a string, depending on the formatting of the field.
    */
  var EffectiveDefault: js.Any
  /**
    * specifies the maximum value that can be entered.
    *
    * This property is ignored if the format of the field is no numeric format.
    */
  var EffectiveMax: scala.Double
  /**
    * specifies the minimum value that can be entered.
    *
    * This property is ignored if the format of the field is no numeric format.
    */
  var EffectiveMin: scala.Double
  /**
    * specifies the current value of the formatted field.
    *
    * This may be a numeric value (double) or a string, depending on the formatting of the field.
    */
  var EffectiveValue: scala.Double
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: FontDescriptor
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double
  /**
    * specifies the format to be used when formatting the field input and output.
    *
    * This value is meaningful relative to the FormatsSupplier property only.
    */
  var FormatKey: scala.Double
  /** supplies the formats the field should work with. */
  var FormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: scala.Boolean
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: scala.Double
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: scala.Double
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: scala.Boolean
  /**
    * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
    * @since OOo 2.0
    */
  var Repeat: scala.Boolean
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: scala.Double
  /** specifies that the control has a spin button. */
  var Spin: scala.Boolean
  /**
    * specifies that the text is checked during the user input.
    *
    * This property is optional - not every component implementing this service is required to provide it, as real-time input checking on a formatted field
    * may be pretty expensive.
    */
  var StrictFormat: scala.Boolean
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /** specifies the text displayed in the control. */
  var Text: java.lang.String
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies that the text is treated as a number. */
  var TreatAsNumber: scala.Boolean
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: scala.Double
}

