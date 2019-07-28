package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XChartTypeContainer extends XInterface {
  /** retrieve all chart types */
  var ChartTypes: SafeArray[XChartType]
  /**
    * add a chart type to the chart type container
    * @throws IllegalArgumentException If the given chart type is already contained in the chart type container.
    */
  def addChartType(aChartType: XChartType): Unit
  /** retrieve all chart types */
  def getChartTypes(): SafeArray[XChartType]
  /** removes one data series from the chart type container. */
  def removeChartType(aChartType: XChartType): Unit
  /** set all chart types */
  def setChartTypes(aChartTypes: SeqEquiv[XChartType]): Unit
}

object XChartTypeContainer {
  @scala.inline
  def apply(
    ChartTypes: SafeArray[XChartType],
    acquire: () => Unit,
    addChartType: XChartType => Unit,
    getChartTypes: () => SafeArray[XChartType],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartType: XChartType => Unit,
    setChartTypes: SeqEquiv[XChartType] => Unit
  ): XChartTypeContainer = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes, acquire = js.Any.fromFunction0(acquire), addChartType = js.Any.fromFunction1(addChartType), getChartTypes = js.Any.fromFunction0(getChartTypes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartType = js.Any.fromFunction1(removeChartType), setChartTypes = js.Any.fromFunction1(setChartTypes))
  
    __obj.asInstanceOf[XChartTypeContainer]
  }
}

