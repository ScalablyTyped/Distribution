package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PercentPair extends js.Object {
  /**
    * The percentile.
    */
  var percent: js.UndefOr[Percent] = js.native
  /**
    * The value of the percentile.
    */
  var value: js.UndefOr[PercentValue] = js.native
}

object PercentPair {
  @scala.inline
  def apply(percent: Int | Double = null, value: Int | Double = null): PercentPair = {
    val __obj = js.Dynamic.literal()
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentPair]
  }
}

