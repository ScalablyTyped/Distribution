package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies if the data rows (aka data series) displayed in the chart, take their values from the row or the column in the underlying data source (
  * {@link ChartDataArray} ).
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait ChartDataRowSource extends js.Object

object ChartDataRowSource {
  /** values displayed as data rows are taken from the columns of the data source. */
  @scala.inline
  def COLUMNS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** values displayed as data rows are taken from the rows of the data source. */
  @scala.inline
  def ROWS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

