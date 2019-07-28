package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInvalidationRequest extends js.Object {
  /**
    * The distribution's id.
    */
  var DistributionId: String
  /**
    * The batch information for the invalidation.
    */
  var InvalidationBatch: typings.awsDashSdk.clientsCloudfrontMod.InvalidationBatch
}

object CreateInvalidationRequest {
  @scala.inline
  def apply(DistributionId: String, InvalidationBatch: InvalidationBatch): CreateInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId, InvalidationBatch = InvalidationBatch)
  
    __obj.asInstanceOf[CreateInvalidationRequest]
  }
}

