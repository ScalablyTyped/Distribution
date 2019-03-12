package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAxis
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** the returned property set must support the service {@link GridProperties} */
  val GridProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  var ScaleData: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.ScaleData
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  val SubGridProperties: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  /** the returned property sets must support the service TickProperties */
  val SubTickProperties: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  /** the returned property set must support the service {@link GridProperties} */
  def getGridProperties(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  def getScaleData(): ScaleData
  /**
    * the returned property sets must support the service {@link GridProperties}
    *
    * If you do not want to render certain a sub-grid, in the corresponding XPropertySet the property {@link GridProperties.Show} must be `FALSE` .
    */
  def getSubGridProperties(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  /** the returned property sets must support the service TickProperties */
  def getSubTickProperties(): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet]
  def setScaleData(aScale: ScaleData): scala.Unit
}

object XAxis {
  @scala.inline
  def apply(
    GridProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ScaleData: ScaleData,
    SubGridProperties: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    SubTickProperties: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    acquire: () => scala.Unit,
    getGridProperties: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    getScaleData: () => ScaleData,
    getSubGridProperties: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    getSubTickProperties: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setScaleData: ScaleData => scala.Unit
  ): XAxis = {
    val __obj = js.Dynamic.literal(GridProperties = GridProperties, ScaleData = ScaleData, SubGridProperties = SubGridProperties, SubTickProperties = SubTickProperties, acquire = js.Any.fromFunction0(acquire), getGridProperties = js.Any.fromFunction0(getGridProperties), getScaleData = js.Any.fromFunction0(getScaleData), getSubGridProperties = js.Any.fromFunction0(getSubGridProperties), getSubTickProperties = js.Any.fromFunction0(getSubTickProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScaleData = js.Any.fromFunction1(setScaleData))
  
    __obj.asInstanceOf[XAxis]
  }
}

