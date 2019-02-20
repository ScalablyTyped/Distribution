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

