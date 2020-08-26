package typings.activexLibreoffice.com_.sun.star.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an interval on a date-axis
  * @since OOo 3.4
  */
@js.native
trait TimeInterval extends js.Object {
  /** specifies the number of units */
  var Number: Double = js.native
  /**
    * specifies a unit for the interval
    *
    * is a value out of the constant group {@link com.sun.star.chart.TimeUnit} .
    */
  var TimeUnit: Double = js.native
}

object TimeInterval {
  @scala.inline
  def apply(Number: Double, TimeUnit: Double): TimeInterval = {
    val __obj = js.Dynamic.literal(Number = Number.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval]
  }
  @scala.inline
  implicit class TimeIntervalOps[Self <: TimeInterval] (val x: Self) extends AnyVal {
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
    def setNumber(value: Double): Self = this.set("Number", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeUnit(value: Double): Self = this.set("TimeUnit", value.asInstanceOf[js.Any])
  }
  
}

