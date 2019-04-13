package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvalidationRequest extends js.Object {
  /**
    * The distribution's ID.
    */
  var DistributionId: java.lang.String
  /**
    * The identifier for the invalidation request, for example, IDFDVBD632BHDS5.
    */
  var Id: java.lang.String
}

object GetInvalidationRequest {
  @scala.inline
  def apply(DistributionId: java.lang.String, Id: java.lang.String): GetInvalidationRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId, Id = Id)
  
    __obj.asInstanceOf[GetInvalidationRequest]
  }
}

