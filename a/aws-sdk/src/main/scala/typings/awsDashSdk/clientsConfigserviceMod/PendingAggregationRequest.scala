package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingAggregationRequest extends js.Object {
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: js.UndefOr[AccountId] = js.native
  /**
    * The region requesting to aggregate data. 
    */
  var RequesterAwsRegion: js.UndefOr[AwsRegion] = js.native
}

object PendingAggregationRequest {
  @scala.inline
  def apply(RequesterAccountId: AccountId = null, RequesterAwsRegion: AwsRegion = null): PendingAggregationRequest = {
    val __obj = js.Dynamic.literal()
    if (RequesterAccountId != null) __obj.updateDynamic("RequesterAccountId")(RequesterAccountId.asInstanceOf[js.Any])
    if (RequesterAwsRegion != null) __obj.updateDynamic("RequesterAwsRegion")(RequesterAwsRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingAggregationRequest]
  }
}

