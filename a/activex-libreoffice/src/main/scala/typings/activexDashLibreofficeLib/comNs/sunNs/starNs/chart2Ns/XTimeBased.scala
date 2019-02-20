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

