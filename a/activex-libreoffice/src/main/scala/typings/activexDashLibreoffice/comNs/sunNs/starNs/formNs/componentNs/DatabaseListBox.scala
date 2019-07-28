package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.DataAwareControlModel
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
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.componentNs.ListBox because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined DefaultSelection, ListSource */ @js.native
trait DatabaseListBox extends DataAwareControlModel {
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
  var ListSourceType: typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.ListSourceType = js.native
  /** The selected value, if there is at most one. */
  var SelectedValue: js.Any = js.native
  /** The selected values. */
  var SelectedValues: SafeArray[_] = js.native
}

