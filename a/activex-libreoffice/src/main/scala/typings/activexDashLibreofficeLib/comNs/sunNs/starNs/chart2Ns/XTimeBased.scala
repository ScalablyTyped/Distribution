package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTimeBased
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def setRange(start: scala.Double, end: scala.Double): scala.Unit
  /**
    * point is the zero based index into the time based array
    * @returns FALSE if the point is outside of the supported array
    */
  def setToPointInTime(point: scala.Double): scala.Boolean
  /** @returns FALSE if the data wrapped around */
  def switchToNext(wrap: scala.Boolean): scala.Boolean
}

object XTimeBased {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setRange: js.Function2[scala.Double, scala.Double, scala.Unit],
    setToPointInTime: js.Function1[scala.Double, scala.Boolean],
    switchToNext: js.Function1[scala.Boolean, scala.Boolean]
  ): XTimeBased = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setRange")(setRange)
    __obj.updateDynamic("setToPointInTime")(setToPointInTime)
    __obj.updateDynamic("switchToNext")(switchToNext)
    __obj.asInstanceOf[XTimeBased]
  }
}

