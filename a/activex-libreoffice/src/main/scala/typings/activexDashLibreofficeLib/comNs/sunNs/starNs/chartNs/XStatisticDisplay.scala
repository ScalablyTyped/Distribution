package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to statistical elements for the chart.
  *
  * Statistical elements are used by a {@link StockDiagram} .
  * @see XChartDocument
  * @see StockDiagram
  */
trait XStatisticDisplay
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the properties of the down bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **DownBar** is the box that is drawn
    * @see ChartArea
    */
  val DownBar: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the lines that are drawn between the lowest and highest stock value during a day.
    * @see ChartLine
    */
  val MinMaxLine: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the up bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **UpBar** is the box that is drawn betw
    * @see ChartArea
    */
  val UpBar: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the down bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **DownBar** is the box that is drawn
    * @see ChartArea
    */
  def getDownBar(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the lines that are drawn between the lowest and highest stock value during a day.
    * @see ChartLine
    */
  def getMinMaxLine(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the up bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **UpBar** is the box that is drawn betw
    * @see ChartArea
    */
  def getUpBar(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

