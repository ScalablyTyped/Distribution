package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlEdit} . */
trait UnoControlEditModel extends UnoControlModel {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: scala.Double
  /**
    * If set to true an horizontal scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoHScroll: scala.Boolean
  /**
    * If set to true an vertical scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoVScroll: scala.Boolean
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
  /** specifies the echo character for a password edit field. */
  var EchoChar: scala.Double
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: FontDescriptor
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double
  /** specifies if the content of the control can be scrolled in the horizontal direction. */
  var HScroll: scala.Boolean
  /** specifies if hard line breaks will be returned in the {@link XTextComponent.getText()} method. */
  var HardLineBreaks: scala.Boolean
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
    * specifies which line end type should be used for multi line text
    *
    * Controls working with this model care for this setting when the user enters text. Every line break entered into the control will be treated according
    * to this setting, so that the {@link Text} property always contains only line ends in the format specified.
    *
    * Possible values are all constants from the {@link LineEndFormat} group.
    *
    * Note that this setting is usually not relevant when you set new text via the API. No matter which line end format is used in this new text then, usual
    * control implementations should recognize all line end formats and display them properly.
    * @since OOo 2.0
    */
  var LineEndFormat: scala.Double
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: scala.Double
  /** specifies that the control may have more than one line. */
  var MultiLine: scala.Boolean
  /**
    * specifies whether the control paints it background or not.
    * @since OOo 2.3
    */
  var PaintTransparent: scala.Boolean
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: scala.Boolean
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /** specifies the text displayed in the control. */
  var Text: java.lang.String
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies if the content of the control can be scrolled in the vertical direction. */
  var VScroll: scala.Boolean
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

