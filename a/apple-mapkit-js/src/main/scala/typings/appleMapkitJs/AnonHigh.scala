package typings.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHigh extends js.Object {
  val High: Double
  val Low: Double
  val Required: Double
}

object AnonHigh {
  @scala.inline
  def apply(High: Double, Low: Double, Required: Double): AnonHigh = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHigh]
  }
}

