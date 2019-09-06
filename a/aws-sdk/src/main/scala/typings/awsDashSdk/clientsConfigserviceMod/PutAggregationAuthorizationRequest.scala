package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAggregationAuthorizationRequest extends js.Object {
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: AccountId
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: AwsRegion
  /**
    * An array of tag object.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
}

object PutAggregationAuthorizationRequest {
  @scala.inline
  def apply(AuthorizedAccountId: AccountId, AuthorizedAwsRegion: AwsRegion, Tags: TagsList = null): PutAggregationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(AuthorizedAccountId = AuthorizedAccountId, AuthorizedAwsRegion = AuthorizedAwsRegion)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[PutAggregationAuthorizationRequest]
  }
}

