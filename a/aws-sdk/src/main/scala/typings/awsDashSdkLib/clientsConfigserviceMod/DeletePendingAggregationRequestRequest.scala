package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePendingAggregationRequestRequest extends js.Object {
  /**
    * The 12-digit account ID of the account requesting to aggregate data.
    */
  var RequesterAccountId: AccountId
  /**
    * The region requesting to aggregate data.
    */
  var RequesterAwsRegion: AwsRegion
}

object DeletePendingAggregationRequestRequest {
  @scala.inline
  def apply(RequesterAccountId: AccountId, RequesterAwsRegion: AwsRegion): DeletePendingAggregationRequestRequest = {
    val __obj = js.Dynamic.literal(RequesterAccountId = RequesterAccountId, RequesterAwsRegion = RequesterAwsRegion)
  
    __obj.asInstanceOf[DeletePendingAggregationRequestRequest]
  }
}

