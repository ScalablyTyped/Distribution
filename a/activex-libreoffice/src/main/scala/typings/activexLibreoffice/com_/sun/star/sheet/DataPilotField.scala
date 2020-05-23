package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a single field in a data pilot table.
  *
  * If the data pilot table is based on a spreadsheet cell range, a field is represented by a column of the range and is named using the topmost cell of
  * the column.
  */
trait DataPilotField
  extends XNamed
     with XPropertySet
     with XDataPilotField
     with XDataPilotFieldGrouping {
  /** enables the automatic inclusion of only a number of items with the highest or lowest result values. */
  var AutoShowInfo: DataPilotFieldAutoShowInfo
  /**
    * specifies the function used to calculate results for this field.
    *
    * For column and row fields, this is the function for subtotals (GeneralFunction::NONE means no subtotals). For data fields, this is the function shown
    * in the data pilot table.
    */
  var Function: GeneralFunction
  /**
    * specifies the function used to calculate results for this field.
    *
    * For column and row fields, this is the function for subtotals ( {@link GeneralFunction2.NONE} means no subtotals). For data fields, this is the
    * function shown in the data pilot table.
    * @since LibreOffice 5.3
    */
  var Function2: Double
  /**
    * contains the grouping information of the DataPilot field.
    *
    * By changing the value of this property it is possible to modify the grouping settings of this field.
    */
  var GroupInfo: DataPilotFieldGroupInfo
  /** specifies whether this field has auto show information. */
  var HasAutoShowInfo: Boolean
  /** specifies whether this field has layout information. */
  var HasLayoutInfo: Boolean
  /** specifies whether this field has a reference. */
  var HasReference: Boolean
  /** specifies whether this field has sorting information. */
  var HasSortInfo: Boolean
  /** specifies whether this field is a group field. */
  var IsGroupField: Boolean
  /** controls how the field's items are laid out in the result table. */
  var LayoutInfo: DataPilotFieldLayoutInfo
  /**
    * specifies the orientation of the field.
    *
    * If the orientation of a field has been changed using this property, the field will be moved to the last position in the collection of all fields with
    * the specified orientation.
    */
  var Orientation: DataPilotFieldOrientation
  /** controls how the results are shown in relation to a selected reference result. */
  var Reference: DataPilotFieldReference
  /** specifies the selected page which is used to filter the data pilot. */
  var SelectedPage: String
  /** specifies whether to show this field also if it is empty or not. */
  var ShowEmpty: Boolean
  /** controls how the field's items are sorted. */
  var SortInfo: DataPilotFieldSortInfo
  /**
    * specifies the functions used to calculate subtotals for this field.
    *
    * This property is supported by column and row fields only.
    *
    * An empty sequence means no subtotals. The same effect can be achieved by setting the property {@link Function} to the value GeneralFunction::NONE. If
    * the length of the sequence is greater then 1, then the sequence MUST NOT contain one of the values GeneralFunction::NONE or GeneralFunction::AUTO.
    *
    * The order of the functions in this sequence is reflected in the DataPilot table. Multiple entries of the same function are ignored when setting the
    * property.
    */
  var Subtotals: SafeArray[GeneralFunction]
  /**
    * specifies the functions used to calculate subtotals for this field.
    *
    * This property is supported by column and row fields only.
    *
    * An empty sequence means no subtotals. The same effect can be achieved by setting the property {@link Function2} to the value GeneralFunction::NONE. If
    * the length of the sequence is greater then 1, then the sequence MUST NOT contain one of the values {@link GeneralFunction2.NONE} or {@link
    * GeneralFunction2.AUTO} .
    *
    * The order of the functions in this sequence is reflected in the DataPilot table. Multiple entries of the same function are ignored when setting the
    * property.
    * @since LibreOffice 5.3
    */
  var Subtotals2: SafeArray[Double]
  /** specifies whether to use the selected page to filter the data pilot or show all. */
  var UseSelectedPage: Boolean
  /**
    * specifies which hierarchy of the dimension is used.
    * @see com.sun.star.sheet.DataPilotSourceHierarchies
    */
  var UsedHierarchy: String
}

object DataPilotField {
  @scala.inline
  def apply(
    AutoShowInfo: DataPilotFieldAutoShowInfo,
    Function: GeneralFunction,
    Function2: Double,
    GroupInfo: DataPilotFieldGroupInfo,
    HasAutoShowInfo: Boolean,
    HasLayoutInfo: Boolean,
    HasReference: Boolean,
    HasSortInfo: Boolean,
    IsGroupField: Boolean,
    Items: XIndexAccess,
    LayoutInfo: DataPilotFieldLayoutInfo,
    Name: String,
    Orientation: DataPilotFieldOrientation,
    PropertySetInfo: XPropertySetInfo,
    Reference: DataPilotFieldReference,
    SelectedPage: String,
    ShowEmpty: Boolean,
    SortInfo: DataPilotFieldSortInfo,
    Subtotals: SafeArray[GeneralFunction],
    Subtotals2: SafeArray[Double],
    UseSelectedPage: Boolean,
    UsedHierarchy: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createDateGroup: DataPilotFieldGroupInfo => XDataPilotField,
    createNameGroup: SeqEquiv[String] => XDataPilotField,
    getItems: () => XIndexAccess,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataPilotField = {
    val __obj = js.Dynamic.literal(AutoShowInfo = AutoShowInfo.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], Function2 = Function2.asInstanceOf[js.Any], GroupInfo = GroupInfo.asInstanceOf[js.Any], HasAutoShowInfo = HasAutoShowInfo.asInstanceOf[js.Any], HasLayoutInfo = HasLayoutInfo.asInstanceOf[js.Any], HasReference = HasReference.asInstanceOf[js.Any], HasSortInfo = HasSortInfo.asInstanceOf[js.Any], IsGroupField = IsGroupField.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], LayoutInfo = LayoutInfo.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], SelectedPage = SelectedPage.asInstanceOf[js.Any], ShowEmpty = ShowEmpty.asInstanceOf[js.Any], SortInfo = SortInfo.asInstanceOf[js.Any], Subtotals = Subtotals.asInstanceOf[js.Any], Subtotals2 = Subtotals2.asInstanceOf[js.Any], UseSelectedPage = UseSelectedPage.asInstanceOf[js.Any], UsedHierarchy = UsedHierarchy.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createDateGroup = js.Any.fromFunction1(createDateGroup), createNameGroup = js.Any.fromFunction1(createNameGroup), getItems = js.Any.fromFunction0(getItems), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataPilotField]
  }
}

