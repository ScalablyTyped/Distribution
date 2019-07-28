package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.FormControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XReset
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a model for a control which allows to choose in a list of alternative values. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.UnoControlListBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, ItemSeparatorPos, LineCount, MouseWheelBehavior, MultiSelection, Printable, ReadOnly, SelectedItems, StringItemList, Tabstop, TextColor, TextLineColor, WritingMode */ @js.native
trait ListBox
  extends FormControlModel
     with XReset {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double = js.native
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
  /**
    * contains the indexes of entries of the listbox, which should selected by default.
    *
    * This selection is used initially or for a reset.
    * @see com.sun.star.awt.UnoControlListBoxModel.SelectedItems
    * @see com.sun.star.form.XReset
    */
  var DefaultSelection: SafeArray[Double] = js.native
  /** specifies if the control has a drop down button. */
  var Dropdown: Boolean = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  /**
    * specifies where an item separator - a horizontal line - is drawn.
    *
    * If this is not `NULL` , then a horizontal line will be drawn between the item at the given position, and the following item.
    * @since OOo 3.3
    */
  var ItemSeparatorPos: Double = js.native
  /** specifies the maximum line count displayed in the drop down box. */
  var LineCount: Double = js.native
  /** contains the values associated to the strings to be displayed (which are specified by {@link com.sun.star.awt.UnoControlListBoxModel.StringItemList} ) */
  var ListSource: SafeArray[String] = js.native
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
    * control under which circumstances this is possible.
    */
  var MouseWheelBehavior: Double = js.native
  /** specifies if more than one entry can be selected. */
  var MultiSelection: Boolean = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean = js.native
  /** specifies the sequence of selected items, identified by the position. */
  var SelectedItems: SafeArray[Double] = js.native
  /** specifies the list of items. */
  var StringItemList: SafeArray[String] = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: Double = js.native
}

