package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinateSystem
  extends XCoordinateSystem
     with XChartTypeContainer
     with XCloneable {
  var SwapXAndYAxis: Boolean
}

object CoordinateSystem {
  @scala.inline
  def apply(
    ChartTypes: SafeArray[XChartType],
    CoordinateSystemType: String,
    Dimension: Double,
    SwapXAndYAxis: Boolean,
    ViewServiceName: String,
    acquire: () => Unit,
    addChartType: XChartType => Unit,
    createClone: () => XCloneable,
    getAxisByDimension: (Double, Double) => XAxis,
    getChartTypes: () => SafeArray[XChartType],
    getCoordinateSystemType: () => String,
    getDimension: () => Double,
    getMaximumAxisIndexByDimension: Double => Double,
    getViewServiceName: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartType: XChartType => Unit,
    setAxisByDimension: (Double, XAxis, Double) => Unit,
    setChartTypes: SeqEquiv[XChartType] => Unit
  ): CoordinateSystem = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes, CoordinateSystemType = CoordinateSystemType, Dimension = Dimension, SwapXAndYAxis = SwapXAndYAxis, ViewServiceName = ViewServiceName, acquire = js.Any.fromFunction0(acquire), addChartType = js.Any.fromFunction1(addChartType), createClone = js.Any.fromFunction0(createClone), getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getChartTypes = js.Any.fromFunction0(getChartTypes), getCoordinateSystemType = js.Any.fromFunction0(getCoordinateSystemType), getDimension = js.Any.fromFunction0(getDimension), getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = js.Any.fromFunction0(getViewServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartType = js.Any.fromFunction1(removeChartType), setAxisByDimension = js.Any.fromFunction3(setAxisByDimension), setChartTypes = js.Any.fromFunction1(setChartTypes))
  
    __obj.asInstanceOf[CoordinateSystem]
  }
}

