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

