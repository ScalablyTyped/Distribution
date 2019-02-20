package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlScrollBar} . */
trait UnoControlScrollBarModel extends UnoControlModel {
  /**
    * specifies the RGB color to be used for the control.
    * @since OOo 2.0
    */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the increment for a block move. */
  var BlockIncrement: scala.Double
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
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /** specifies the increment for a single line move. */
  var LineIncrement: scala.Double
  /**
    * specifies the scrolling behavior of the control.
    *
    * `TRUE` means, that when the user moves the slider in the scroll bar, the content of the window is updated immediately. `FALSE` means, that the window
    * is only updated after the user has released the mouse button.
    * @since OOo 2.0
    */
  var LiveScroll: scala.Boolean
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: scala.Double
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as scrolling the scrollbar), then usual control implementations
    * allow to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: scala.Double
  /** specifies the scroll value of the control. */
  var ScrollValue: scala.Double
  /** specifies the maximum scroll value of the control. */
  var ScrollValueMax: scala.Double
  /**
    * specifies the minimum scroll value of the control.
    *
    * If this optional property is not present, clients of the component should assume a minimal scroll value of 0.
    */
  var ScrollValueMin: scala.Double
  /**
    * specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons.
    * @since OOo 2.0
    */
  var SymbolColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies that the control can be reached with the TAB key.
    * @since OOo 2.0
    */
  var Tabstop: scala.Boolean
  /** specifies the visible size of the scroll bar. */
  var VisibleSize: scala.Double
}

