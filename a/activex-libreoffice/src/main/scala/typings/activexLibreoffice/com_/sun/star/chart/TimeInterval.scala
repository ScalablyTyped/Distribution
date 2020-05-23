package typings.activexLibreoffice.com_.sun.star.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes an interval on a date-axis
  * @since OOo 3.4
  */
trait TimeInterval extends js.Object {
  /** specifies the number of units */
  var Number: Double
  /**
    * specifies a unit for the interval
    *
    * is a value out of the constant group {@link com.sun.star.chart.TimeUnit} .
    */
  var TimeUnit: Double
}

object TimeInterval {
  @scala.inline
  def apply(Number: Double, TimeUnit: Double): TimeInterval = {
    val __obj = js.Dynamic.literal(Number = Number.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval]
  }
}

