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
    ChartTypes: activexDashInteropLib.SafeArray[XChartType],
    CoordinateSystemType: java.lang.String,
    Dimension: scala.Double,
    SwapXAndYAxis: scala.Boolean,
    ViewServiceName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addChartType: js.Function1[XChartType, scala.Unit],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    getAxisByDimension: js.Function2[scala.Double, scala.Double, XAxis],
    getChartTypes: js.Function0[activexDashInteropLib.SafeArray[XChartType]],
    getCoordinateSystemType: js.Function0[java.lang.String],
    getDimension: js.Function0[scala.Double],
    getMaximumAxisIndexByDimension: js.Function1[scala.Double, scala.Double],
    getViewServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChartType: js.Function1[XChartType, scala.Unit],
    setAxisByDimension: js.Function3[scala.Double, XAxis, scala.Double, scala.Unit],
    setChartTypes: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XChartType], scala.Unit]
  ): CoordinateSystem = {
    val __obj = js.Dynamic.literal(ChartTypes = ChartTypes, CoordinateSystemType = CoordinateSystemType, Dimension = Dimension, SwapXAndYAxis = SwapXAndYAxis, ViewServiceName = ViewServiceName, acquire = acquire, addChartType = addChartType, createClone = createClone, getAxisByDimension = getAxisByDimension, getChartTypes = getChartTypes, getCoordinateSystemType = getCoordinateSystemType, getDimension = getDimension, getMaximumAxisIndexByDimension = getMaximumAxisIndexByDimension, getViewServiceName = getViewServiceName, queryInterface = queryInterface, release = release, removeChartType = removeChartType, setAxisByDimension = setAxisByDimension, setChartTypes = setChartTypes)
  
    __obj.asInstanceOf[CoordinateSystem]
  }
}

