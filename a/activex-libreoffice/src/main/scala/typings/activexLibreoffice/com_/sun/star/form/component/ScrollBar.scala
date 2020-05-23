package typings.activexLibreoffice.com_.sun.star.form.component

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.form.FormControlModel
import typings.activexLibreoffice.com_.sun.star.form.XReset
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the model of a scroll bar control. */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
- typings.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlScrollBarModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined BackgroundColor, BlockIncrement, Border, BorderColor, Enabled, HelpText, HelpURL, LineIncrement, LiveScroll, Orientation, Printable, RepeatDelay, ScrollValue, ScrollValueMax, ScrollValueMin, SymbolColor, Tabstop, VisibleSize */ @js.native
trait ScrollBar
  extends FormControlModel
     with XReset {
  /**
    * specifies the RGB color to be used for the control.
    * @since OOo 2.0
    */
  var BackgroundColor: Color = js.native
  /** specifies the increment for a block move. */
  var BlockIncrement: Double = js.native
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
    * @see com.sun.star.awt.UnoControlScrollBarModel.ScrollValue
    * @see com.sun.star.form.XReset
    */
  var DefaultScrollValue: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  /** specifies the increment for a single line move. */
  var LineIncrement: Double = js.native
  /**
    * specifies the scrolling behavior of the control.
    *
    * `TRUE` means, that when the user moves the slider in the scroll bar, the content of the window is updated immediately. `FALSE` means, that the window
    * is only updated after the user has released the mouse button.
    * @since OOo 2.0
    */
  var LiveScroll: Boolean = js.native
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: Double = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as scrolling the scrollbar), then usual control implementations
    * allow to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: Double = js.native
  /** specifies the scroll value of the control. */
  var ScrollValue: Double = js.native
  /** specifies the maximum scroll value of the control. */
  var ScrollValueMax: Double = js.native
  /**
    * specifies the minimum scroll value of the control.
    *
    * If this optional property is not present, clients of the component should assume a minimal scroll value of 0.
    */
  var ScrollValueMin: Double = js.native
  /**
    * specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons.
    * @since OOo 2.0
    */
  var SymbolColor: Color = js.native
  /**
    * specifies that the control can be reached with the TAB key.
    * @since OOo 2.0
    */
  var Tabstop: Boolean = js.native
  /** specifies the visible size of the scroll bar. */
  var VisibleSize: Double = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

