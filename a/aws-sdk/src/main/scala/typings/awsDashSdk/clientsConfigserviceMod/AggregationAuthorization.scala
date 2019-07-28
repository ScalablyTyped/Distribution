package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregationAuthorization extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the aggregation object.
    */
  var AggregationAuthorizationArn: js.UndefOr[String] = js.undefined
  /**
    * The 12-digit account ID of the account authorized to aggregate data.
    */
  var AuthorizedAccountId: js.UndefOr[AccountId] = js.undefined
  /**
    * The region authorized to collect aggregated data.
    */
  var AuthorizedAwsRegion: js.UndefOr[AwsRegion] = js.undefined
  /**
    * The time stamp when the aggregation authorization was created.
    */
  var CreationTime: js.UndefOr[_Date] = js.undefined
}

object AggregationAuthorization {
  @scala.inline
  def apply(
    AggregationAuthorizationArn: String = null,
    AuthorizedAccountId: AccountId = null,
    AuthorizedAwsRegion: AwsRegion = null,
    CreationTime: _Date = null
  ): AggregationAuthorization = {
    val __obj = js.Dynamic.literal()
    if (AggregationAuthorizationArn != null) __obj.updateDynamic("AggregationAuthorizationArn")(AggregationAuthorizationArn)
    if (AuthorizedAccountId != null) __obj.updateDynamic("AuthorizedAccountId")(AuthorizedAccountId)
    if (AuthorizedAwsRegion != null) __obj.updateDynamic("AuthorizedAwsRegion")(AuthorizedAwsRegion)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    __obj.asInstanceOf[AggregationAuthorization]
  }
}

