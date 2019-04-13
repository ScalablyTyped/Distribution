package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInvalidationRequest extends js.Object {
  /**
    * The distribution's id.
    */
  var DistributionId: java.lang.String
  /**
    * The batch information for the invalidation.
    */
  var InvalidationBatch: awsDashSdkLib.clientsCloudfrontMod.InvalidationBatch
}

object CreateInvalidationRequest {
  @scala.inline
  def apply(DistributionId: java.lang.String, InvalidationBatch: InvalidationBatch): CreateInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId, InvalidationBatch = InvalidationBatch)
  
    __obj.asInstanceOf[CreateInvalidationRequest]
  }
}

