package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPublicKeysRequest extends js.Object {
  /**
    * Optionally specifies, in UTC, the end of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used.
    */
  var EndTime: js.UndefOr[_Date] = js.undefined
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Optionally specifies, in UTC, the start of the time range to look up public keys for CloudTrail digest files. If not specified, the current time is used, and the current public key is returned.
    */
  var StartTime: js.UndefOr[_Date] = js.undefined
}

object ListPublicKeysRequest {
  @scala.inline
  def apply(EndTime: _Date = null, NextToken: String = null, StartTime: _Date = null): ListPublicKeysRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[ListPublicKeysRequest]
  }
}

