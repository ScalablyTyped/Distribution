package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeToDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to subcribe to.
    */
  var DatasetName: typings.awsSdk.clientsCognitosyncMod.DatasetName
  
  /**
    * The unique ID generated for this device by Cognito.
    */
  var DeviceId: typings.awsSdk.clientsCognitosyncMod.DeviceId
  
  /**
    * Unique ID for this identity.
    */
  var IdentityId: typings.awsSdk.clientsCognitosyncMod.IdentityId
  
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. The ID of the pool to which the identity belongs.
    */
  var IdentityPoolId: typings.awsSdk.clientsCognitosyncMod.IdentityPoolId
}
object SubscribeToDatasetRequest {
  
  inline def apply(
    DatasetName: DatasetName,
    DeviceId: DeviceId,
    IdentityId: IdentityId,
    IdentityPoolId: IdentityPoolId
  ): SubscribeToDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], IdentityId = IdentityId.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscribeToDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
