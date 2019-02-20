package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a data pilot source.
  *
  * A component that implements this service can be used as data source for a data pilot table in a spreadsheet document.
  */
trait DataPilotSource
  extends XDimensionsSupplier
     with XDataPilotResults
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XRefreshable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * specifies the number of column fields.
    * @since OOo 3.0
    */
  var ColumnFieldCount: scala.Double
  /** specifies if grand totals for the columns are inserted. */
  var ColumnGrand: scala.Boolean
  /**
    * specifies the number of data fields.
    * @since OOo 3.0
    */
  var DataFieldCount: scala.Double
  /**
    * specifies the number of row fields.
    * @since OOo 3.0
    */
  var RowFieldCount: scala.Double
  /** specifies if grand totals for the rows are inserted. */
  var RowGrand: scala.Boolean
}

