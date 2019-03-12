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
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setRange: (scala.Double, scala.Double) => scala.Unit,
    setToPointInTime: scala.Double => scala.Boolean,
    switchToNext: scala.Boolean => scala.Boolean
  ): XTimeBased = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRange = js.Any.fromFunction2(setRange), setToPointInTime = js.Any.fromFunction1(setToPointInTime), switchToNext = js.Any.fromFunction1(switchToNext))
  
    __obj.asInstanceOf[XTimeBased]
  }
}

