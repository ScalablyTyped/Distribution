package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvalidationRequest extends js.Object {
  /**
    * The distribution's ID.
    */
  var DistributionId: String
  /**
    * The identifier for the invalidation request, for example, IDFDVBD632BHDS5.
    */
  var Id: String
}

object GetInvalidationRequest {
  @scala.inline
  def apply(DistributionId: String, Id: String): GetInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId, Id = Id)
  
    __obj.asInstanceOf[GetInvalidationRequest]
  }
}

