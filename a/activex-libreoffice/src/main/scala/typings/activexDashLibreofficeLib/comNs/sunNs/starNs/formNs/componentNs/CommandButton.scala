package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the control model for a clickable button which is part of a form component hierarchy.
  * @see ImageButton
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlButtonModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, DefaultButton, Enabled, FocusOnClick, FontDescriptor, FontEmphasisMark, FontRelief, Graphic, HelpText, HelpURL, ImageAlign, ImagePosition, ImageURL, Label, MultiLine, Printable, PushButtonType, Repeat, RepeatDelay, State, Tabstop, TextColor, TextLineColor, Toggle, VerticalAlign */ @js.native
trait CommandButton
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControlModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XImageProducerSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XReset {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: scala.Double = js.native
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** describes the action to be executed by the button when pressed. */
  var ButtonType: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormButtonType = js.native
  /** specifies that the button is the default button on the document. */
  var DefaultButton: scala.Boolean = js.native
  /**
    * specifies the default toggle state for the button, used when it is reset.
    *
    * This property is meaningful only when {@link com.sun.star.awt.UnoControlButtonModel.Toggle} is `TRUE` . In this case, the `DefaultState` controls to
    * which `State` the button will be reset.
    *
    * For a given implementation of the interface, if this (optional) property is present, then also the optional interface {@link com.sun.star.form.XReset}
    * must be present.
    */
  var DefaultState: scala.Boolean = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean = js.native
  /**
    * specifies whether the button control should grab the focus when clicked.
    *
    * If set to `TRUE` (which is the default), the button control automatically grabs the focus when the user clicks onto it with the mouse. ;  If set to
    * `FALSE` , the focus is preserved when the user operates the button control with the mouse.
    * @since OOo 2.0
    */
  var FocusOnClick: scala.Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double = js.native
  /**
    * specifies a graphic to be displayed at the button
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
  /** specifies the alignment of the image inside the button as {@link ImageAlign} value. */
  var ImageAlign: scala.Double = js.native
  /**
    * specifies the position of the image, if any, relative to the text, if any
    *
    * Valid values of this property are specified with {@link ImagePosition} .
    *
    * If this property is present, it supersedes the {@link ImageAlign} property - setting one of both properties sets the other one to the best possible
    * match.
    */
  var ImagePosition: scala.Double = js.native
  /**
    * specifies an URL to an image to use for the button.
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
  /** specifies the default action of the button as PushButtonType value. */
  var PushButtonType: scala.Double = js.native
  /**
    * specifies whether the control should show repeating behavior.
    *
    * Normally, when you click a button with the mouse, you need to release the mouse button, and press it again. With this property set to `TRUE` , the
    * button is repeatedly pressed while you hold down the mouse button.
    * @since OOo 2.0
    */
  var Repeat: scala.Boolean = js.native
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as pressing the button), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: scala.Double = js.native
  /**
    * specifies the state of the control.
    *
    * If {@link Toggle} property is set to `TRUE` , the pressed state is enabled and its pressed state can be obtained with this property.
    *
    * `; 0: not pressed; 1: pressed; 2: don't know; `
    * @see Toggle
    */
  var State: scala.Double = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean = js.native
  /**
    * describes the frame, where to open the document specified by the TargetURL.
    *
    * This property is evaluated if the button is of type URL.
    *
    * As always, there is a number of target names which have a special meaning, and force a special {@link com.sun.star.frame.Frame} to be used.
    */
  var TargetFrame: java.lang.String = js.native
  /**
    * specifies the URL, which should be opened if the button was clicked.
    *
    * This property is evaluated if the button is of type URL.
    * @see com.sun.star.form.FormButtonType
    */
  var TargetURL: java.lang.String = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color = js.native
  /**
    * specifies whether the button should toggle on a single operation.
    *
    * If this property is set to `TRUE` , a single operation of the button control (pressing space while it is focused, or clicking onto it) toggles it
    * between a **pressed** and a **not pressed** state.
    *
    * The default for this property is `FALSE` , which means the button behaves like a usual push button.
    * @since OOo 2.0
    */
  var Toggle: scala.Boolean = js.native
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 2.0
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment = js.native
}

