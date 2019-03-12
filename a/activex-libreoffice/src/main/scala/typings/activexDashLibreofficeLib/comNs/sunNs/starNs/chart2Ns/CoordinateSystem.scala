package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoordinateSystem
  extends XCoordinateSystem
     with XChartTypeContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable {
  var SwapXAndYAxis: scala.Boolean
}

object CoordinateSystem {
  @scala.inline
  def apply(
    ChartTypes: stdLib.SafeArray[XChartType],
    CoordinateSystemType: java.lang.String,
    Dimension: scala.Double,
    SwapXAndYAxis: scala.Boolean,
    ViewServiceName: java.lang.String,
    acquire: () => scala.Unit,
    addChartType: XChartType => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    getAxisByDimension: (scala.Double, scala.Double) => XAxis,
    getChartTypes: () => stdLib.SafeArray[XChartType],
    getCoordinateSystemType: () => java.lang.String,
    getDimension: () => scala.Double,
    getMaximumAxisIndexByDimension: scala.Double => scala.Double,
    getViewServiceName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChartType: XChartType => scala.Unit,
    setAxisByDimension: (scala.Double, XAxis, scala.Double) => scala.Unit,
    setChartTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType] => scala.Unit
  ): CoordinateSystem = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes, CoordinateSystemType = CoordinateSystemType, Dimension = Dimension, SwapXAndYAxis = SwapXAndYAxis, ViewServiceName = ViewServiceName, acquire = js.Any.fromFunction0(acquire), addChartType = js.Any.fromFunction1(addChartType), createClone = js.Any.fromFunction0(createClone), getAxisByDimension = js.Any.fromFunction2(getAxisByDimension), getChartTypes = js.Any.fromFunction0(getChartTypes), getCoordinateSystemType = js.Any.fromFunction0(getCoordinateSystemType), getDimension = js.Any.fromFunction0(getDimension), getMaximumAxisIndexByDimension = js.Any.fromFunction1(getMaximumAxisIndexByDimension), getViewServiceName = js.Any.fromFunction0(getViewServiceName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartType = js.Any.fromFunction1(removeChartType), setAxisByDimension = js.Any.fromFunction3(setAxisByDimension), setChartTypes = js.Any.fromFunction1(setChartTypes))
  
    __obj.asInstanceOf[CoordinateSystem]
  }
}

