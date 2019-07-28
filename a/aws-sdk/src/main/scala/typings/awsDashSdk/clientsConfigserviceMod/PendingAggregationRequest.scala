package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingAggregationRequest extends js.Object {
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The region requesting to aggregate data. 
    */
  var RequesterAwsRegion: js.UndefOr[AwsRegion] = js.undefined
}

object PendingAggregationRequest {
  @scala.inline
  def apply(RequesterAccountId: AccountId = null, RequesterAwsRegion: AwsRegion = null): PendingAggregationRequest = {
    val __obj = js.Dynamic.literal()
    if (RequesterAccountId != null) __obj.updateDynamic("RequesterAccountId")(RequesterAccountId)
    if (RequesterAwsRegion != null) __obj.updateDynamic("RequesterAwsRegion")(RequesterAwsRegion)
    __obj.asInstanceOf[PendingAggregationRequest]
  }
}

