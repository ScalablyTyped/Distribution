package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyTimestamp extends js.Object {
  /**
    * Optional. A string that contains the nanosecond time offset. Accepts substitution templates.
    */
  var offsetInNanos: js.UndefOr[AssetPropertyOffsetInNanos] = js.native
  /**
    * A string that contains the time in seconds since epoch. Accepts substitution templates.
    */
  var timeInSeconds: AssetPropertyTimeInSeconds = js.native
}

object AssetPropertyTimestamp {
  @scala.inline
  def apply(timeInSeconds: AssetPropertyTimeInSeconds, offsetInNanos: AssetPropertyOffsetInNanos = null): AssetPropertyTimestamp = {
    val __obj = js.Dynamic.literal(timeInSeconds = timeInSeconds.asInstanceOf[js.Any])
    if (offsetInNanos != null) __obj.updateDynamic("offsetInNanos")(offsetInNanos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetPropertyTimestamp]
  }
}

