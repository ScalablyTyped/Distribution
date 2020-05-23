package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XTimeBased extends XInterface {
  def setRange(start: Double, end: Double): Unit
  /**
    * point is the zero based index into the time based array
    * @returns FALSE if the point is outside of the supported array
    */
  def setToPointInTime(point: Double): Boolean
  /** @returns FALSE if the data wrapped around */
  def switchToNext(wrap: Boolean): Boolean
}

object XTimeBased {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setRange: (Double, Double) => Unit,
    setToPointInTime: Double => Boolean,
    switchToNext: Boolean => Boolean
  ): XTimeBased = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setRange = js.Any.fromFunction2(setRange), setToPointInTime = js.Any.fromFunction1(setToPointInTime), switchToNext = js.Any.fromFunction1(switchToNext))
    __obj.asInstanceOf[XTimeBased]
  }
}

