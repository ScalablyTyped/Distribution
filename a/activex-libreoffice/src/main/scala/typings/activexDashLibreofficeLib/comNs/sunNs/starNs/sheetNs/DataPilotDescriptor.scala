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

