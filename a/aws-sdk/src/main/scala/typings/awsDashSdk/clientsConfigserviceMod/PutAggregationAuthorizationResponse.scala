package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAggregationAuthorizationResponse extends js.Object {
  /**
    * Returns an AggregationAuthorization object. 
    */
  var AggregationAuthorization: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AggregationAuthorization] = js.undefined
}

object PutAggregationAuthorizationResponse {
  @scala.inline
  def apply(AggregationAuthorization: AggregationAuthorization = null): PutAggregationAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    if (AggregationAuthorization != null) __obj.updateDynamic("AggregationAuthorization")(AggregationAuthorization)
    __obj.asInstanceOf[PutAggregationAuthorizationResponse]
  }
}

