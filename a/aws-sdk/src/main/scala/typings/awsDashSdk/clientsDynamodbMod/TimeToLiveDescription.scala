package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeToLiveDescription extends js.Object {
  /**
    *  The name of the TTL attribute for items in the table.
    */
  var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.native
  /**
    *  The TTL status for the table.
    */
  var TimeToLiveStatus: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TimeToLiveStatus] = js.native
}

object TimeToLiveDescription {
  @scala.inline
  def apply(AttributeName: TimeToLiveAttributeName = null, TimeToLiveStatus: TimeToLiveStatus = null): TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (TimeToLiveStatus != null) __obj.updateDynamic("TimeToLiveStatus")(TimeToLiveStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLiveDescription]
  }
}

