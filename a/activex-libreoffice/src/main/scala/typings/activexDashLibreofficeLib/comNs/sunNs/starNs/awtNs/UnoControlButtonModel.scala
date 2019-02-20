package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlButton} . */
trait UnoControlButtonModel extends UnoControlModel {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: scala.Double
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies that the button is the default button on the document. */
  var DefaultButton: scala.Boolean
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /**
    * specifies whether the button control should grab the focus when clicked.
    *
    * If set to `TRUE` (which is the default), the button control automatically grabs the focus when the user clicks onto it with the mouse. ;  If set to
    * `FALSE` , the focus is preserved when the user operates the button control with the mouse.
    * @since OOo 2.0
    */
  var FocusOnClick: scala.Boolean
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: FontDescriptor
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double
  /**
    * specifies a graphic to be displayed at the button
    *
    * If this property is present, it interacts with the {@link ImageURL} in the following way: If {@link ImageURL} is set, {@link Graphic} will be reset to
    * an object as loaded from the given image URL, or `NULL` if {@link ImageURL} does not point to a valid image file.If {@link Graphic} is set, {@link
    * ImageURL} will be reset to an empty string.
    * @since OOo 2.1
    */
  var Graphic: activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /** specifies the alignment of the image inside the button as {@link ImageAlign} value. */
  var ImageAlign: scala.Double
  /**
    * specifies the position of the image, if any, relative to the text, if any
    *
    * Valid values of this property are specified with {@link ImagePosition} .
    *
    * If this property is present, it supersedes the {@link ImageAlign} property - setting one of both properties sets the other one to the best possible
    * match.
    */
  var ImagePosition: scala.Double
  /**
    * specifies an URL to an image to use for the button.
    * @see Graphic
    */
  var ImageURL: java.lang.String
  /** specifies the label of the control. */
  var Label: java.lang.String
  /**
    * specifies that the text may be displayed on more than one line.
    * @since OOo 2.0
    */
  var MultiLine: scala.Boolean
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies the default action of the button as PushButtonType value. */
  var PushButtonType: scala.Double
  /**
    * specifies whether the control should show repeating behavior.
    *
    * Normally, when you click a button with the mouse, you need to release the mouse button, and press it again. With this property set to `TRUE` , the
    * button is repeatedly pressed while you hold down the mouse button.
    * @since OOo 2.0
    */
  var Repeat: scala.Boolean
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as pressing the button), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: scala.Double
  /**
    * specifies the state of the control.
    *
    * If {@link Toggle} property is set to `TRUE` , the pressed state is enabled and its pressed state can be obtained with this property.
    *
    * `; 0: not pressed; 1: pressed; 2: don't know; `
    * @see Toggle
    */
  var State: scala.Double
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies whether the button should toggle on a single operation.
    *
    * If this property is set to `TRUE` , a single operation of the button control (pressing space while it is focused, or clicking onto it) toggles it
    * between a **pressed** and a **not pressed** state.
    *
    * The default for this property is `FALSE` , which means the button behaves like a usual push button.
    * @since OOo 2.0
    */
  var Toggle: scala.Boolean
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 2.0
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
}

