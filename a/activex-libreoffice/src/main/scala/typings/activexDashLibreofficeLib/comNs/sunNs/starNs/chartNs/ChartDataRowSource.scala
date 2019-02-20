package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartDataRowSource extends js.Object

/**
  * specifies if the data rows (aka data series) displayed in the chart, take their values from the row or the column in the underlying data source (
  * {@link ChartDataArray} ).
  */
@JSGlobal("com.sun.star.chart.ChartDataRowSource")
@js.native
object ChartDataRowSource extends js.Object {
  /** values displayed as data rows are taken from the columns of the data source. */
  @js.native
  sealed trait COLUMNS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataRowSource
  
  /** values displayed as data rows are taken from the rows of the data source. */
  @js.native
  sealed trait ROWS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataRowSource
  
  /* 1 */ val COLUMNS: COLUMNS with scala.Double = js.native
  /* 0 */ val ROWS: ROWS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.ChartDataRowSource with scala.Double
  ] = js.native
}

