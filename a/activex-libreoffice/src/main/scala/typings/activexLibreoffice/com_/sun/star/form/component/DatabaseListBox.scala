package typings.activexLibreoffice.com_.sun.star.form.component

import typings.activexLibreoffice.com_.sun.star.awt.XItemList
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.form.DataAwareControlModel
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies a data-aware list box control model.
  *
  * The base service for list boxes ( {@link ListBox} ) offers only one possibility to specify the list entries: The display strings in the {@link
  * com.sun.star.awt.UnoControlListBoxModel.StringItemList} property and the corresponding values in the {@link ListBox.ListSource} property.
  *
  * This service here extends this mimic. It allows to fill the list from a data source. This means that a second result set is opened, which works on the
  * same connection as the form which the list box belongs to, but can be based on an arbitrary table or SQL statement.
  *
  * For instance, you may have a form which is bound to a table **invoice** , and you use it to enter invoices for your customers. Probably, you will have
  * a second table (say **customer** ), which (among other data) contains a unique key for identifying customers. In your invoice table, you will have a
  * foreign key referring to these customers. ;  Now, besides the result set the form is based on (all your invoices), the list box can be instructed to
  * open a second result set, this time for the **customer** table, and fill its list with entries from this result set. ;  Additionally, it allows to
  * model the relation between the two tables: When the user selects a customer from the list, this customer has the unique id we just talked about (which
  * is not necessarily visible to the user in any way). The list box then automatically transfers this id into the foreign key column of **invoice** ,
  * thus allowing the user to transparently work with human-readable strings instead of pure numbers. ;  Let's call this result set the list is filled
  * from the **list result set** here ...
  *
  * The display strings are always taken from the first column of that result set, and the corresponding value as per the BoundColumn property.
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
- typings.activexLibreoffice.com_.sun.star.awt.UnoControlListBoxModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, Dropdown, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, HelpText, HelpURL, ItemSeparatorPos, LineCount, MouseWheelBehavior, MultiSelection, Printable, ReadOnly, SelectedItems, StringItemList, Tabstop, TextColor, TextLineColor, WritingMode
- typings.activexLibreoffice.com_.sun.star.form.component.ListBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultSelection, ListSource */ @js.native
trait DatabaseListBox
  extends DataAwareControlModel
     with XItemList {
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
    * specifies which column of the list result set should be used for data exchange.
    *
    * When you make a selection from a list box, the "BoundColumn" property reflects which column value of a result set should be used as the value of the
    * component. If the control is bound to a database field, the column value is stored in the database field identified by the property {@link
    * com.sun.star.form.DataAwareControlModel.DataField} .
    *
    * **-1 **: The index (starting at 0) of the selected list box entry is stored in the current database field.;
    *
    * **0 or greater **: The column value of the result set at the position (0-indexed) is stored in the current database field. In particular, for value 0,
    * the selected (displayed) list box string is stored.
    *
    *
    *
    * The bound column property is only used if a list source is defined and the list source matches with the types
    * com::sun::star::form::ListSourceType::TABLE, com::sun::star::form::ListSourceType::QUERY, com::sun::star::form::ListSourceType::SQL or
    * com::sun::star::form::ListSourceType::SQLPASSTHROUGH. Otherwise the property is ignored, as there is no result set from which to get the column
    * values.
    */
  var BoundColumn: Double = js.native
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
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
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
    * describes the kind of list source used.
    *
    * Depending on the value of this property, the way the value of {@link ListBox.ListSource} is evaluated varies.
    * **com::sun::star::form::ListSourceType::VALUELIST **: The elements in the string sequence in {@link ListBox.ListSource} build up the entry list.;
    *
    * **com::sun::star::form::ListSourceType::TABLE **: The first element of the string sequence in {@link ListBox.ListSource} determines the table which
    * the list result set should be based on.;
    *
    * **com::sun::star::form::ListSourceType::QUERY **: The first element of the string sequence in {@link ListBox.ListSource} determines the query which
    * the list result set should be based on. ;  For retrieving the query, the connection which the data form is working with ( {@link
    * com.sun.star.sdb.RowSet.ActiveConnection} ) is queried for the {@link com.sun.star.sdb.XQueriesSupplier} interface.;
    *
    * **com::sun::star::form::ListSourceType::SQL **: The first element of the string sequence in {@link ListBox.ListSource} contains the SQL statement
    * which the list result set should be based on.; ;
    *
    * **com::sun::star::form::ListSourceType::SQLPASSTHROUGH **: The first element of the string sequence in {@link ListBox.ListSource} contains the SQL
    * statement which the list result set should be based on. ;  The statement is not analyzed by the parser. This means that you can use database specific
    * SQL features here, but, on the other hand, lose features like parameter value substitution.;
    *
    * **com::sun::star::form::ListSourceType::TABLEFIELDS **: The first element of the string sequence in {@link ListBox.ListSource} determines the table
    * whose column names should fill the list.
    */
  var ListSourceType: typings.activexLibreoffice.com_.sun.star.form.ListSourceType = js.native
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
  /** The selected value, if there is at most one. */
  var SelectedValue: js.Any = js.native
  /** The selected values. */
  var SelectedValues: SafeArray[_] = js.native
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
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

