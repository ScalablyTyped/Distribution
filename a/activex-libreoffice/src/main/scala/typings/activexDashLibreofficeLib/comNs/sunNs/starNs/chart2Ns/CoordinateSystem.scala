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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChartTypes")(ChartTypes)
    __obj.updateDynamic("CoordinateSystemType")(CoordinateSystemType)
    __obj.updateDynamic("Dimension")(Dimension)
    __obj.updateDynamic("SwapXAndYAxis")(SwapXAndYAxis)
    __obj.updateDynamic("ViewServiceName")(ViewServiceName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addChartType")(addChartType)
    __obj.updateDynamic("createClone")(createClone)
    __obj.updateDynamic("getAxisByDimension")(getAxisByDimension)
    __obj.updateDynamic("getChartTypes")(getChartTypes)
    __obj.updateDynamic("getCoordinateSystemType")(getCoordinateSystemType)
    __obj.updateDynamic("getDimension")(getDimension)
    __obj.updateDynamic("getMaximumAxisIndexByDimension")(getMaximumAxisIndexByDimension)
    __obj.updateDynamic("getViewServiceName")(getViewServiceName)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChartType")(removeChartType)
    __obj.updateDynamic("setAxisByDimension")(setAxisByDimension)
    __obj.updateDynamic("setChartTypes")(setChartTypes)
    __obj.asInstanceOf[CoordinateSystem]
  }
}

