package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxis
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** the returned property set must support the service {@link GridProperties} */
  val GridProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  var ScaleData: ScaleData
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  val SubGridProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  /** the returned property sets must support the service TickProperties */
  val SubTickProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  /** the returned property set must support the service {@link GridProperties} */
  def getGridProperties(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  def getScaleData(): ScaleData
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  def getSubGridProperties(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  /** the returned property sets must support the service TickProperties */
  def getSubTickProperties(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  def setScaleData(aScale: ScaleData): scala.Unit
}

object XAxis {
  @scala.inline
  def apply(
    GridProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ScaleData: ScaleData,
    SubGridProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    SubTickProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    acquire: js.Function0[scala.Unit],
    getGridProperties: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getScaleData: js.Function0[ScaleData],
    getSubGridProperties: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
    ],
    getSubTickProperties: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setScaleData: js.Function1[ScaleData, scala.Unit]
  ): XAxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GridProperties")(GridProperties)
    __obj.updateDynamic("ScaleData")(ScaleData)
    __obj.updateDynamic("SubGridProperties")(SubGridProperties)
    __obj.updateDynamic("SubTickProperties")(SubTickProperties)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getGridProperties")(getGridProperties)
    __obj.updateDynamic("getScaleData")(getScaleData)
    __obj.updateDynamic("getSubGridProperties")(getSubGridProperties)
    __obj.updateDynamic("getSubTickProperties")(getSubTickProperties)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setScaleData")(setScaleData)
    __obj.asInstanceOf[XAxis]
  }
}

