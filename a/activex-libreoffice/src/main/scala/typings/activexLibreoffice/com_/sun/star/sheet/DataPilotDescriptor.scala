package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the description of the layout of a data pilot table.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait DataPilotDescriptor
  extends StObject
     with XDataPilotDescriptor
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
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields.asInstanceOf[js.Any], ColumnGrand = ColumnGrand.asInstanceOf[js.Any], DataFields = DataFields.asInstanceOf[js.Any], DataLayoutField = DataLayoutField.asInstanceOf[js.Any], DataPilotFields = DataPilotFields.asInstanceOf[js.Any], DrillDownOnDoubleClick = DrillDownOnDoubleClick.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], GrandTotalName = GrandTotalName.asInstanceOf[js.Any], HiddenFields = HiddenFields.asInstanceOf[js.Any], IgnoreEmptyRows = IgnoreEmptyRows.asInstanceOf[js.Any], ImportDescriptor = ImportDescriptor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PageFields = PageFields.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RepeatIfEmpty = RepeatIfEmpty.asInstanceOf[js.Any], RowFields = RowFields.asInstanceOf[js.Any], RowGrand = RowGrand.asInstanceOf[js.Any], ServiceArguments = ServiceArguments.asInstanceOf[js.Any], ShowFilterButton = ShowFilterButton.asInstanceOf[js.Any], SourceRange = SourceRange.asInstanceOf[js.Any], SourceServiceName = SourceServiceName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getColumnFields = js.Any.fromFunction0(getColumnFields), getDataFields = js.Any.fromFunction0(getDataFields), getDataLayoutField = js.Any.fromFunction0(getDataLayoutField), getDataPilotFields = js.Any.fromFunction0(getDataPilotFields), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getHiddenFields = js.Any.fromFunction0(getHiddenFields), getName = js.Any.fromFunction0(getName), getPageFields = js.Any.fromFunction0(getPageFields), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getRowFields = js.Any.fromFunction0(getRowFields), getSourceRange = js.Any.fromFunction0(getSourceRange), getTag = js.Any.fromFunction0(getTag), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourceRange = js.Any.fromFunction1(setSourceRange), setTag = js.Any.fromFunction1(setTag))
    __obj.asInstanceOf[DataPilotDescriptor]
  }
  
  @scala.inline
  implicit class DataPilotDescriptorMutableBuilder[Self <: DataPilotDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnGrand(value: Boolean): Self = StObject.set(x, "ColumnGrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrillDownOnDoubleClick(value: Boolean): Self = StObject.set(x, "DrillDownOnDoubleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrandTotalName(value: String): Self = StObject.set(x, "GrandTotalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreEmptyRows(value: Boolean): Self = StObject.set(x, "IgnoreEmptyRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ImportDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatIfEmpty(value: Boolean): Self = StObject.set(x, "RepeatIfEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowGrand(value: Boolean): Self = StObject.set(x, "RowGrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceArguments(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ServiceArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFilterButton(value: Boolean): Self = StObject.set(x, "ShowFilterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceServiceName(value: String): Self = StObject.set(x, "SourceServiceName", value.asInstanceOf[js.Any])
  }
}
