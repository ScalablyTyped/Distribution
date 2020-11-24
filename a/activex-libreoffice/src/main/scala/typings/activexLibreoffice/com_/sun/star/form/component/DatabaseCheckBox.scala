package typings.activexLibreoffice.com_.sun.star.form.component

import typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel
import typings.activexLibreoffice.com_.sun.star.graphic.XGraphic
import typings.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service specifies a check box which is data-aware, and can be bound to a database field.
  *
  * Mostly, you will create data-aware checkboxes as tristate checkboxes, because this is a requirement to correctly handle `NULL` values in databases.
  * @see com.sun.star.awt.UnoControlCheckBoxModel.TriState
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
- typings.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
- typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
- typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
- typings.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImagePosition, ImageURL, Label, MultiLine, Printable, State, Tabstop, TextColor, TextLineColor, TriState, VerticalAlign, VisualEffect, WritingMode
- typings.activexLibreoffice.com_.sun.star.form.component.CheckBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultState, RefValue */ @js.native
trait DatabaseCheckBox extends DataAwareControlModel {
  
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
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    * @see com.sun.star.form.XReset
    */
  var DefaultState: Double = js.native
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  
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
    * contains a reference value which is used for submission in a HTML form
    *
    * When submitting a {@link HTMLForm} which contains a check box, which is checked, the RefValue is used for submission.
    */
  var RefValue: String = js.native
  
  /**
    * specifies the state of the control.
    *
    * `; 0: not checked; 1: checked; 2: don't know; `
    */
  var State: Double = js.native
  
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  
  /** specifies that the control may have the state "don't know". */
  var TriState: Boolean = js.native
  
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 2.0
    */
  var VerticalAlign: VerticalAlignment = js.native
  
  /**
    * specifies a visual effect to apply to the check box control
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
