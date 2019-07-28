package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.FormControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XReset
import typings.activexDashLibreoffice.comNs.sunNs.starNs.graphicNs.XGraphic
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.VerticalAlignment
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component which acts as a radio button as needed in HTMLForms.
  *
  * Radio buttons are controls which can be grouped together, and in every group, only one of the controls can be check. This means if one of them is
  * checked by a user interaction, all other controls in the same group are automatically unchecked
  *
  * Like in HTML, radio buttons are grouped together if and only if they have the same name (see {@link com.sun.star.form.FormComponent.Name} ).
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlRadioButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImagePosition, ImageURL, Label, MultiLine, Printable, State, Tabstop, TextColor, TextLineColor, VerticalAlign, VisualEffect, WritingMode */ @js.native
trait RadioButton
  extends FormControlModel
     with XReset {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    * @since OOo 2.0
    */
  var Align: Double = js.native
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: Double = js.native
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    *
    * In a group of radio buttons only one button should be checked by default.
    * @see com.sun.star.awt.UnoControlRadioButtonModel.State
    * @see com.sun.star.form.XReset
    */
  var DefaultState: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  /**
    * specifies a graphic to be displayed besides the label of the control
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: XGraphic = js.native
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  /**
    * specifies the position of the image, if any, relative to the text, if any
    *
    * Valid values of this property are specified with {@link ImagePosition} .
    */
  var ImagePosition: Double = js.native
  /**
    * specifies an URL to an image to display besides the label of the control
    * @see Graphic
    */
  var ImageURL: String = js.native
  /** specifies the label of the control. */
  var Label: String = js.native
  /**
    * specifies that the text may be displayed on more than one line.
    * @since OOo 2.0
    */
  var MultiLine: Boolean = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  /**
    * contains a reference value which is used for submission in a HTML form.
    *
    * If the form the control belongs to is to be submitted (see {@link com.sun.star.form.XSubmit} ), and the control is checked, this reference value is
    * used for submission.
    */
  var RefValue: String = js.native
  /**
    * specifies the state of the control.
    *
    * `; 0: not checked; 1: checked; `
    */
  var State: Double = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  /**
    * specifies a value which is to be associated with the control when it's **not** selected.
    *
    * In various situations, the {@link RefValue} is associated with the control if and only if it is selected. ; {@link UncheckedRefValue} provides a
    * extensions of this concept: If present, the value should be associated with the control when it is **not** selected.
    */
  var UncheckedRefValue: String = js.native
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 2.0
    */
  var VerticalAlign: VerticalAlignment = js.native
  /**
    * specifies a visual effect to apply to the radio button control.
    *
    * Possible values for this property are {@link VisualEffect.FLAT} and {@link VisualEffect.LOOK3D} .
    * @see com.sun.star.awt.VisualEffect
    * @since OOo 2.0
    */
  var VisualEffect: Double = js.native
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: Double = js.native
}

