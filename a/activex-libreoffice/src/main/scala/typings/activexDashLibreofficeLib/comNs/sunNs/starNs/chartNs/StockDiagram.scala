package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a diagram which can be used for presenting stock quotes.
  *
  * Note that the data must have a specific structure for stock diagrams. Let us assume that data is interpreted, such that series are taken from columns
  * (see property {@link Diagram.DataRowSource} ). Then you need tables of the following structures for different types:
  *
  * **StockDiagram::Volume is FALSEStockDiagram::UpDown is FALSE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is TRUEStockDiagram::UpDown is FALSE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is FALSEStockDiagram::UpDown is TRUE**{{table here, see documentation}}
  *
  * **StockDiagram::Volume is TRUEStockDiagram::UpDown is TRUE**{{table here, see documentation}}
  */
trait StockDiagram
  extends Diagram
     with XStatisticDisplay
     with ChartStatistics
     with ChartAxisXSupplier
     with ChartTwoAxisYSupplier {
  /**
    * indicates if a stock chart contains data representing the value of stocks on the opening and closing date.
    *
    * The difference will be indicated by bars. The color of the bar will be significant for positive or negative differences between open and closed data.
    *
    * If this property is `FALSE` , the values of the first series (or second if {@link StockDiagram.Volume} is `TRUE` ) of the chart data are interpreted
    * as the day's lowest value. The next series is interpreted as the day's highest value, and the last series is interpreted as the closing value.
    *
    * If this property is set to `TRUE` , one additional series is needed with the opening value of the stocks. It is assumed as the series before the
    * series with the day's lowest value.
    */
  var UpDown: scala.Boolean
  /**
    * indicates if a stock chart contains data representing the volume of stocks.
    *
    * The values of the volume are represented as columns like those of a {@link BarDiagram} .
    *
    * If this property is set to `TRUE` , the values of the first series of the chart data are interpreted as volume.
    */
  var Volume: scala.Boolean
}

