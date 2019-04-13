package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetRequest extends js.Object {
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: awsDashSdkLib.clientsCognitosyncMod.DatasetName
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: awsDashSdkLib.clientsCognitosyncMod.IdentityId
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitosyncMod.IdentityPoolId
}

object DeleteDatasetRequest {
  @scala.inline
  def apply(DatasetName: DatasetName, IdentityId: IdentityId, IdentityPoolId: IdentityPoolId): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName, IdentityId = IdentityId, IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
}

