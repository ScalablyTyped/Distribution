package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartTypeContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all chart types */
  var ChartTypes: stdLib.SafeArray[XChartType]
  /**
    * add a chart type to the chart type container
    * @throws IllegalArgumentException If the given chart type is already contained in the chart type container.
    */
  def addChartType(aChartType: XChartType): scala.Unit
  /** retrieve all chart types */
  def getChartTypes(): stdLib.SafeArray[XChartType]
  /** removes one data series from the chart type container. */
  def removeChartType(aChartType: XChartType): scala.Unit
  /** set all chart types */
  def setChartTypes(aChartTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType]): scala.Unit
}

object XChartTypeContainer {
  @scala.inline
  def apply(
    ChartTypes: stdLib.SafeArray[XChartType],
    acquire: () => scala.Unit,
    addChartType: XChartType => scala.Unit,
    getChartTypes: () => stdLib.SafeArray[XChartType],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChartType: XChartType => scala.Unit,
    setChartTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType] => scala.Unit
  ): XChartTypeContainer = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes, acquire = js.Any.fromFunction0(acquire), addChartType = js.Any.fromFunction1(addChartType), getChartTypes = js.Any.fromFunction0(getChartTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartType = js.Any.fromFunction1(removeChartType), setChartTypes = js.Any.fromFunction1(setChartTypes))
  
    __obj.asInstanceOf[XChartTypeContainer]
  }
}

