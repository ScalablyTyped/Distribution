package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait High extends js.Object {
  val High: Double
  val Low: Double
  val Required: Double
}

object High {
  @scala.inline
  def apply(High: Double, Low: Double, Required: Double): High = {
    val __obj = js.Dynamic.literal(High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
}

