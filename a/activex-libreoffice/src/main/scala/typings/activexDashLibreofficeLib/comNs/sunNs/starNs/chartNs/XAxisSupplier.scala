package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Easier access to the different axes within a chart.
  * @since OOo 3.4
  */
trait XAxisSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the primary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getAxis(nDimensionIndex: scala.Double): XAxis
  /**
    * @param nDimensionIndex Parameter nDimensionIndex says whether it is a x, y or z-axis (0 for x).
    * @returns the secondary axis of the specified dimension. The returned object supports service {@link ChartAxis} .
    */
  def getSecondaryAxis(nDimensionIndex: scala.Double): XAxis
}

object XAxisSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getAxis: js.Function1[scala.Double, XAxis],
    getSecondaryAxis: js.Function1[scala.Double, XAxis],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAxisSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAxis")(getAxis)
    __obj.updateDynamic("getSecondaryAxis")(getSecondaryAxis)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAxisSupplier]
  }
}

