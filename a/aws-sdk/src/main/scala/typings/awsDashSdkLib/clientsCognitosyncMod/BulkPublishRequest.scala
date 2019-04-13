package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkPublishRequest extends js.Object {
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitosyncMod.IdentityPoolId
}

object BulkPublishRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): BulkPublishRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[BulkPublishRequest]
  }
}

