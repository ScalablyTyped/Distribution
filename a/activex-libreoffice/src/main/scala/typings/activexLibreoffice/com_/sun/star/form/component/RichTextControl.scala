package typings.activexLibreoffice.com_.sun.star.form.component

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.container.XContentEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.form.FormControlModel
import typings.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties
import typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typings.activexLibreoffice.com_.sun.star.text.XTextRange
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a component which extends the {@link com.sun.star.awt.UnoControlEditModel} with capabilities to display and input formatted text. */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
- typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.style.ParagraphPropertiesComplex because var conflicts: WritingMode. Inlined 
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlEditModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, AutoHScroll, AutoVScroll, BackgroundColor, Border, BorderColor, EchoChar, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HardLineBreaks, HelpText, HelpURL, HideInactiveSelection, HScroll, LineEndFormat, MaxTextLen, MultiLine, PaintTransparent, Printable, ReadOnly, Tabstop, Text, TextColor, TextLineColor, VerticalAlign, VScroll, WritingMode */ @js.native
trait RichTextControl
  extends FormControlModel
     with XTextRange
     with XContentEnumerationAccess
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with ParagraphProperties
     with ParagraphPropertiesAsian {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double = js.native
  /**
    * If set to true an horizontal scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoHScroll: Boolean = js.native
  /**
    * If set to true an vertical scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoVScroll: Boolean = js.native
  /** specifies the background color (RGB) of the control. */
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
  /** specifies the echo character for a password edit field. */
  var EchoChar: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  /** specifies if the content of the control can be scrolled in the horizontal direction. */
  var HScroll: Boolean = js.native
  /**
    * specifies whether text should be automatically wrapped to fit into the control.
    *
    * If set to `TRUE` , users need to manually press the enter key to insert a line break. If set to `FALSE` , text is automatically wrapped at the control
    * border.
    */
  var HardLineBreaks: Boolean = js.native
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: Boolean = js.native
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
  var LineEndFormat: Double = js.native
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: Double = js.native
  /** specifies that the control may have more than one line. */
  var MultiLine: Boolean = js.native
  /**
    * specifies whether the control paints it background or not.
    * @since OOo 2.3
    */
  var PaintTransparent: Boolean = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean = js.native
  /**
    * specifies whether the control should display the text including all its formatting.
    *
    * If this is set to `FALSE` , the control will act as ordinary {@link com.sun.star.awt.UnoControlEditModel} .
    *
    * If the property is set to `TRUE` , the control will ignore the following properties: {@link com.sun.star.awt.UnoControlEditModel.EchoChar}{@link
    * com.sun.star.awt.UnoControlEditModel.MaxTextLen}{@link com.sun.star.awt.UnoControlEditModel.MultiLine}{@link
    * com.sun.star.awt.UnoControlEditModel.Align}
    */
  var RichText: Boolean = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  /** specifies the text displayed in the control. */
  var Text: String = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  /** specifies if the content of the control can be scrolled in the vertical direction. */
  var VScroll: Boolean = js.native
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: VerticalAlignment = js.native
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: Double = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

