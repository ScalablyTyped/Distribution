package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeToLiveDescription extends js.Object {
  /**
    *  The name of the TTL attribute for items in the table.
    */
  var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.undefined
  /**
    *  The TTL status for the table.
    */
  var TimeToLiveStatus: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TimeToLiveStatus
  ] = js.undefined
}

object TimeToLiveDescription {
  @scala.inline
  def apply(AttributeName: TimeToLiveAttributeName = null, TimeToLiveStatus: TimeToLiveStatus = null): TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (TimeToLiveStatus != null) __obj.updateDynamic("TimeToLiveStatus")(TimeToLiveStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLiveDescription]
  }
}

