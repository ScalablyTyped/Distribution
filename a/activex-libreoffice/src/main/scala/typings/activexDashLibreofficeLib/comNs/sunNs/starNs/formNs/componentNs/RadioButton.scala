package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

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
- activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlRadioButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImagePosition, ImageURL, Label, MultiLine, Printable, State, Tabstop, TextColor, TextLineColor, VerticalAlign, VisualEffect, WritingMode */ @js.native
trait RadioButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControlModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XReset {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    * @since OOo 2.0
    */
  var Align: scala.Double = js.native
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: scala.Double = js.native
  /**
    * contains a default value for the control.
    *
    * This value is used when the control is initially displayed, and for resetting it.
    *
    * In a group of radio buttons only one button should be checked by default.
    * @see com.sun.star.awt.UnoControlRadioButtonModel.State
    * @see com.sun.star.form.XReset
    */
  var DefaultState: scala.Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double = js.native
  /**
    * specifies a graphic to be displayed besides the label of the control
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic = js.native
  /** specifies the help text of the control. */
  var HelpText: java.lang.String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String = js.native
  /**
    * specifies the position of the image, if any, relative to the text, if any
    *
    * Valid values of this property are specified with {@link ImagePosition} .
    */
  var ImagePosition: scala.Double = js.native
  /**
    * specifies an URL to an image to display besides the label of the control
    * @see Graphic
    */
  var ImageURL: java.lang.String = js.native
  /** specifies the label of the control. */
  var Label: java.lang.String = js.native
  /**
    * specifies that the text may be displayed on more than one line.
    * @since OOo 2.0
    */
  var MultiLine: scala.Boolean = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean = js.native
  /**
    * contains a reference value which is used for submission in a HTML form.
    *
    * If the form the control belongs to is to be submitted (see {@link com.sun.star.form.XSubmit} ), and the control is checked, this reference value is
    * used for submission.
    */
  var RefValue: java.lang.String = js.native
  /**
    * specifies the state of the control.
    *
    * `; 0: not checked; 1: checked; `
    */
  var State: scala.Double = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /**
    * specifies a value which is to be associated with the control when it's **not** selected.
    *
    * In various situations, the {@link RefValue} is associated with the control if and only if it is selected. ; {@link UncheckedRefValue} provides a
    * extensions of this concept: If present, the value should be associated with the control when it is **not** selected.
    */
  var UncheckedRefValue: java.lang.String = js.native
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 2.0
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment = js.native
  /**
    * specifies a visual effect to apply to the radio button control.
    *
    * Possible values for this property are {@link VisualEffect.FLAT} and {@link VisualEffect.LOOK3D} .
    * @see com.sun.star.awt.VisualEffect
    * @since OOo 2.0
    */
  var VisualEffect: scala.Double = js.native
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: scala.Double = js.native
}

