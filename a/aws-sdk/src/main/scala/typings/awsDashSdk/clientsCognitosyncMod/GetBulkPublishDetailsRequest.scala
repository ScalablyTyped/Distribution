package typings.awsDashSdk.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBulkPublishDetailsRequest extends js.Object {
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: typings.awsDashSdk.clientsCognitosyncMod.IdentityPoolId
}

object GetBulkPublishDetailsRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): GetBulkPublishDetailsRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[GetBulkPublishDetailsRequest]
  }
}

