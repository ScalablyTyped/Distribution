package typings.activexLibreoffice.com_.sun.star.chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single data value, including the error
  *
  * This struct is currently used nowhere.
  * @deprecated Deprecated
  */
trait ChartDataValue extends js.Object {
  /** highest possible error value. */
  var HighError: Double
  /** lowest possible error value. */
  var LowError: Double
  /** value by itself. */
  var Value: Double
}

object ChartDataValue {
  @scala.inline
  def apply(HighError: Double, LowError: Double, Value: Double): ChartDataValue = {
    val __obj = js.Dynamic.literal(HighError = HighError.asInstanceOf[js.Any], LowError = LowError.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataValue]
  }
}

