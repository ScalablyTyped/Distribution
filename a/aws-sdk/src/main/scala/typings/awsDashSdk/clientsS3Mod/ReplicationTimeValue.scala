package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTimeValue extends js.Object {
  /**
    *  Contains an integer specifying time in minutes.   Valid values: 15 minutes. 
    */
  var Minutes: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Minutes] = js.native
}

object ReplicationTimeValue {
  @scala.inline
  def apply(Minutes: Int | Double = null): ReplicationTimeValue = {
    val __obj = js.Dynamic.literal()
    if (Minutes != null) __obj.updateDynamic("Minutes")(Minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTimeValue]
  }
}

