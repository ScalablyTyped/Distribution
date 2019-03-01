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

object XStatisticDisplay {
  @scala.inline
  def apply(
    DownBar: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    MinMaxLine: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    UpBar: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getDownBar: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getMinMaxLine: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getUpBar: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XStatisticDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DownBar")(DownBar)
    __obj.updateDynamic("MinMaxLine")(MinMaxLine)
    __obj.updateDynamic("UpBar")(UpBar)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDownBar")(getDownBar)
    __obj.updateDynamic("getMinMaxLine")(getMinMaxLine)
    __obj.updateDynamic("getUpBar")(getUpBar)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XStatisticDisplay]
  }
}

