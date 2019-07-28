package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XStatisticDisplay extends XInterface {
  /**
    * @returns the properties of the down bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **DownBar** is the box that is drawn
    * @see ChartArea
    */
  val DownBar: XPropertySet
  /**
    * @returns the properties of the lines that are drawn between the lowest and highest stock value during a day.
    * @see ChartLine
    */
  val MinMaxLine: XPropertySet
  /**
    * @returns the properties of the up bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **UpBar** is the box that is drawn betw
    * @see ChartArea
    */
  val UpBar: XPropertySet
  /**
    * @returns the properties of the down bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **DownBar** is the box that is drawn
    * @see ChartArea
    */
  def getDownBar(): XPropertySet
  /**
    * @returns the properties of the lines that are drawn between the lowest and highest stock value during a day.
    * @see ChartLine
    */
  def getMinMaxLine(): XPropertySet
  /**
    * @returns the properties of the up bars of a stock chart which has {@link StockDiagram.UpDown} set to `TRUE` .  The **UpBar** is the box that is drawn betw
    * @see ChartArea
    */
  def getUpBar(): XPropertySet
}

object XStatisticDisplay {
  @scala.inline
  def apply(
    DownBar: XPropertySet,
    MinMaxLine: XPropertySet,
    UpBar: XPropertySet,
    acquire: () => Unit,
    getDownBar: () => XPropertySet,
    getMinMaxLine: () => XPropertySet,
    getUpBar: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStatisticDisplay = {
    val __obj = js.Dynamic.literal(DownBar = DownBar, MinMaxLine = MinMaxLine, UpBar = UpBar, acquire = js.Any.fromFunction0(acquire), getDownBar = js.Any.fromFunction0(getDownBar), getMinMaxLine = js.Any.fromFunction0(getMinMaxLine), getUpBar = js.Any.fromFunction0(getUpBar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStatisticDisplay]
  }
}

