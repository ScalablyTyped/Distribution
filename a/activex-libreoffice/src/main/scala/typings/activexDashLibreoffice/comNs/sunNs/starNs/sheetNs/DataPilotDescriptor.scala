package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the description of the layout of a data pilot table.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait DataPilotDescriptor
  extends XDataPilotDescriptor
     with XPropertySet
     with XDataPilotDataLayoutFieldSupplier {
  /** specifies if columns for grand total results are created. */
  var ColumnGrand: Boolean
  /** specifies whether to drill down to details or go into edit mode. */
  var DrillDownOnDoubleClick: Boolean
  /**
    * specifies a label for grand total results.
    * @since OOo 3.4
    */
  var GrandTotalName: String
  /** specifies if empty rows in the source data are ignored. */
  var IgnoreEmptyRows: Boolean
  /**
    * specifies parameters to create the data pilot table from a database.
    * @see DatabaseImportDescriptor
    * @since OOo 3.3
    */
  var ImportDescriptor: SafeArray[PropertyValue]
  /** specifies if empty category cells in the source data should be treated as repetition of the content from the previous row. */
  var RepeatIfEmpty: Boolean
  /** specifies if rows for grand total results are created. */
  var RowGrand: Boolean
  /**
    * specifies arguments that are passed to the implementation named by {@link SourceServiceName} .
    * @since OOo 3.3
    */
  var ServiceArguments: SafeArray[PropertyValue]
  /** specifies whether the filter button is shown. */
  var ShowFilterButton: Boolean
  /**
    * specifies the name of a {@link DataPilotSource} implementation for the data pilot table.
    * @since OOo 3.3
    */
  var SourceServiceName: String
}

object DataPilotDescriptor {
  @scala.inline
  def apply(
    ColumnFields: XIndexAccess,
    ColumnGrand: Boolean,
    DataFields: XIndexAccess,
    DataLayoutField: XDataPilotField,
    DataPilotFields: XIndexAccess,
    DrillDownOnDoubleClick: Boolean,
    FilterDescriptor: XSheetFilterDescriptor,
    GrandTotalName: String,
    HiddenFields: XIndexAccess,
    IgnoreEmptyRows: Boolean,
    ImportDescriptor: SafeArray[PropertyValue],
    Name: String,
    PageFields: XIndexAccess,
    PropertySetInfo: XPropertySetInfo,
    RepeatIfEmpty: Boolean,
    RowFields: XIndexAccess,
    RowGrand: Boolean,
    ServiceArguments: SafeArray[PropertyValue],
    ShowFilterButton: Boolean,
    SourceRange: CellRangeAddress,
    SourceServiceName: String,
    Tag: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getColumnFields: () => XIndexAccess,
    getDataFields: () => XIndexAccess,
    getDataLayoutField: () => XDataPilotField,
    getDataPilotFields: () => XIndexAccess,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getHiddenFields: () => XIndexAccess,
    getName: () => String,
    getPageFields: () => XIndexAccess,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getRowFields: () => XIndexAccess,
    getSourceRange: () => CellRangeAddress,
    getTag: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSourceRange: CellRangeAddress => Unit,
    setTag: String => Unit
  ): DataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields, ColumnGrand = ColumnGrand, DataFields = DataFields, DataLayoutField = DataLayoutField, DataPilotFields = DataPilotFields, DrillDownOnDoubleClick = DrillDownOnDoubleClick, FilterDescriptor = FilterDescriptor, GrandTotalName = GrandTotalName, HiddenFields = HiddenFields, IgnoreEmptyRows = IgnoreEmptyRows, ImportDescriptor = ImportDescriptor, Name = Name, PageFields = PageFields, PropertySetInfo = PropertySetInfo, RepeatIfEmpty = RepeatIfEmpty, RowFields = RowFields, RowGrand = RowGrand, ServiceArguments = ServiceArguments, ShowFilterButton = ShowFilterButton, SourceRange = SourceRange, SourceServiceName = SourceServiceName, Tag = Tag, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getColumnFields = js.Any.fromFunction0(getColumnFields), getDataFields = js.Any.fromFunction0(getDataFields), getDataLayoutField = js.Any.fromFunction0(getDataLayoutField), getDataPilotFields = js.Any.fromFunction0(getDataPilotFields), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getHiddenFields = js.Any.fromFunction0(getHiddenFields), getName = js.Any.fromFunction0(getName), getPageFields = js.Any.fromFunction0(getPageFields), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRowFields = js.Any.fromFunction0(getRowFields), getSourceRange = js.Any.fromFunction0(getSourceRange), getTag = js.Any.fromFunction0(getTag), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourceRange = js.Any.fromFunction1(setSourceRange), setTag = js.Any.fromFunction1(setTag))
  
    __obj.asInstanceOf[DataPilotDescriptor]
  }
}

