package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeOrPosition extends js.Object {
  var size: Double | String
  var units: js.UndefOr[String] = js.undefined
}

object SizeOrPosition {
  @scala.inline
  def apply(size: Double | String, units: String = null): SizeOrPosition = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeOrPosition]
  }
}

