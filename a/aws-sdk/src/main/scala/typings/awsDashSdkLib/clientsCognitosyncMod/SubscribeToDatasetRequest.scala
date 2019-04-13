package typings
package awsDashSdkLib.clientsCognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeToDatasetRequest extends js.Object {
  /**
    * The name of the dataset to subcribe to.
    */
  var DatasetName: awsDashSdkLib.clientsCognitosyncMod.DatasetName
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: awsDashSdkLib.clientsCognitosyncMod.DeviceId
  /**
    * Unique ID for this identity.
    */
  var IdentityId: awsDashSdkLib.clientsCognitosyncMod.IdentityId
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which the identity belongs.
    */
  var IdentityPoolId: awsDashSdkLib.clientsCognitosyncMod.IdentityPoolId
}

object SubscribeToDatasetRequest {
  @scala.inline
  def apply(
    DatasetName: DatasetName,
    DeviceId: DeviceId,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): SubscribeToDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName, DeviceId = DeviceId, IdentityId = IdentityId, IdentityPoolId = IdentityPoolId)
  
    __obj.asInstanceOf[SubscribeToDatasetRequest]
  }
}

