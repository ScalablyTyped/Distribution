package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartTypeContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all chart types */
  var ChartTypes: activexDashInteropLib.SafeArray[XChartType]
  /**
    * add a chart type to the chart type container
    * @throws IllegalArgumentException If the given chart type is already contained in the chart type container.
    */
  def addChartType(aChartType: XChartType): scala.Unit
  /** retrieve all chart types */
  def getChartTypes(): activexDashInteropLib.SafeArray[XChartType]
  /** removes one data series from the chart type container. */
  def removeChartType(aChartType: XChartType): scala.Unit
  /** set all chart types */
  def setChartTypes(aChartTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType]): scala.Unit
}

object XChartTypeContainer {
  @scala.inline
  def apply(
    ChartTypes: activexDashInteropLib.SafeArray[XChartType],
    acquire: js.Function0[scala.Unit],
    addChartType: js.Function1[XChartType, scala.Unit],
    getChartTypes: js.Function0[activexDashInteropLib.SafeArray[XChartType]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChartType: js.Function1[XChartType, scala.Unit],
    setChartTypes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType], scala.Unit]
  ): XChartTypeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChartTypes")(ChartTypes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addChartType")(addChartType)
    __obj.updateDynamic("getChartTypes")(getChartTypes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChartType")(removeChartType)
    __obj.updateDynamic("setChartTypes")(setChartTypes)
    __obj.asInstanceOf[XChartTypeContainer]
  }
}

