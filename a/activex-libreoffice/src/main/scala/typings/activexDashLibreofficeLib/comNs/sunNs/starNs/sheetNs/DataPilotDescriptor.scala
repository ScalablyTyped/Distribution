package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents the description of the layout of a data pilot table.
  * @see com.sun.star.sheet.DataPilotTable
  */
trait DataPilotDescriptor
  extends XDataPilotDescriptor
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XDataPilotDataLayoutFieldSupplier {
  /** specifies if columns for grand total results are created. */
  var ColumnGrand: scala.Boolean
  /** specifies whether to drill down to details or go into edit mode. */
  var DrillDownOnDoubleClick: scala.Boolean
  /**
    * specifies a label for grand total results.
    * @since OOo 3.4
    */
  var GrandTotalName: java.lang.String
  /** specifies if empty rows in the source data are ignored. */
  var IgnoreEmptyRows: scala.Boolean
  /**
    * specifies parameters to create the data pilot table from a database.
    * @see DatabaseImportDescriptor
    * @since OOo 3.3
    */
  var ImportDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** specifies if empty category cells in the source data should be treated as repetition of the content from the previous row. */
  var RepeatIfEmpty: scala.Boolean
  /** specifies if rows for grand total results are created. */
  var RowGrand: scala.Boolean
  /**
    * specifies arguments that are passed to the implementation named by {@link SourceServiceName} .
    * @since OOo 3.3
    */
  var ServiceArguments: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** specifies whether the filter button is shown. */
  var ShowFilterButton: scala.Boolean
  /**
    * specifies the name of a {@link DataPilotSource} implementation for the data pilot table.
    * @since OOo 3.3
    */
  var SourceServiceName: java.lang.String
}

object DataPilotDescriptor {
  @scala.inline
  def apply(
    ColumnFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    ColumnGrand: scala.Boolean,
    DataFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DataLayoutField: XDataPilotField,
    DataPilotFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DrillDownOnDoubleClick: scala.Boolean,
    FilterDescriptor: XSheetFilterDescriptor,
    GrandTotalName: java.lang.String,
    HiddenFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    IgnoreEmptyRows: scala.Boolean,
    ImportDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Name: java.lang.String,
    PageFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RepeatIfEmpty: scala.Boolean,
    RowFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    RowGrand: scala.Boolean,
    ServiceArguments: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    ShowFilterButton: scala.Boolean,
    SourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    SourceServiceName: java.lang.String,
    Tag: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getColumnFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getDataFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getDataLayoutField: js.Function0[XDataPilotField],
    getDataPilotFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getFilterDescriptor: js.Function0[XSheetFilterDescriptor],
    getHiddenFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getName: js.Function0[java.lang.String],
    getPageFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRowFields: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    getSourceRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getTag: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setName: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setSourceRange: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    setTag: js.Function1[java.lang.String, scala.Unit]
  ): DataPilotDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ColumnFields")(ColumnFields)
    __obj.updateDynamic("ColumnGrand")(ColumnGrand)
    __obj.updateDynamic("DataFields")(DataFields)
    __obj.updateDynamic("DataLayoutField")(DataLayoutField)
    __obj.updateDynamic("DataPilotFields")(DataPilotFields)
    __obj.updateDynamic("DrillDownOnDoubleClick")(DrillDownOnDoubleClick)
    __obj.updateDynamic("FilterDescriptor")(FilterDescriptor)
    __obj.updateDynamic("GrandTotalName")(GrandTotalName)
    __obj.updateDynamic("HiddenFields")(HiddenFields)
    __obj.updateDynamic("IgnoreEmptyRows")(IgnoreEmptyRows)
    __obj.updateDynamic("ImportDescriptor")(ImportDescriptor)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PageFields")(PageFields)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RepeatIfEmpty")(RepeatIfEmpty)
    __obj.updateDynamic("RowFields")(RowFields)
    __obj.updateDynamic("RowGrand")(RowGrand)
    __obj.updateDynamic("ServiceArguments")(ServiceArguments)
    __obj.updateDynamic("ShowFilterButton")(ShowFilterButton)
    __obj.updateDynamic("SourceRange")(SourceRange)
    __obj.updateDynamic("SourceServiceName")(SourceServiceName)
    __obj.updateDynamic("Tag")(Tag)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getColumnFields")(getColumnFields)
    __obj.updateDynamic("getDataFields")(getDataFields)
    __obj.updateDynamic("getDataLayoutField")(getDataLayoutField)
    __obj.updateDynamic("getDataPilotFields")(getDataPilotFields)
    __obj.updateDynamic("getFilterDescriptor")(getFilterDescriptor)
    __obj.updateDynamic("getHiddenFields")(getHiddenFields)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getPageFields")(getPageFields)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getRowFields")(getRowFields)
    __obj.updateDynamic("getSourceRange")(getSourceRange)
    __obj.updateDynamic("getTag")(getTag)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setSourceRange")(setSourceRange)
    __obj.updateDynamic("setTag")(setTag)
    __obj.asInstanceOf[DataPilotDescriptor]
  }
}

