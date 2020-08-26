package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XTimeBased extends XInterface {
  def setRange(start: Double, end: Double): Unit = js.native
  /**
    * point is the zero based index into the time based array
    * @returns FALSE if the point is outside of the supported array
    */
  def setToPointInTime(point: Double): Boolean = js.native
  /** @returns FALSE if the data wrapped around */
  def switchToNext(wrap: Boolean): Boolean = js.native
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
  @scala.inline
  implicit class XTimeBasedOps[Self <: XTimeBased] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetRange(value: (Double, Double) => Unit): Self = this.set("setRange", js.Any.fromFunction2(value))
    @scala.inline
    def setSetToPointInTime(value: Double => Boolean): Self = this.set("setToPointInTime", js.Any.fromFunction1(value))
    @scala.inline
    def setSwitchToNext(value: Boolean => Boolean): Self = this.set("switchToNext", js.Any.fromFunction1(value))
  }
  
}

