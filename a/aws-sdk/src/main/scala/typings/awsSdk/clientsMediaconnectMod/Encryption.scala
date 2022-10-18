package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encryption extends StObject {
  
  /**
    * The type of algorithm that is used for the encryption (such as aes128, aes192, or aes256).
    */
  var Algorithm: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.Algorithm] = js.undefined
  
  /**
    * A 128-bit, 16-byte hex value represented by a 32-character string, to be used with the key for encrypting content. This parameter is not valid for static key encryption.
    */
  var ConstantInitializationVector: js.UndefOr[string] = js.undefined
  
  /**
    * The value of one of the devices that you configured with your digital rights management (DRM) platform key provider. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var DeviceId: js.UndefOr[string] = js.undefined
  
  /**
    * The type of key that is used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var KeyType: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.KeyType] = js.undefined
  
  /**
    * The AWS Region that the API Gateway proxy endpoint was created in. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Region: js.UndefOr[string] = js.undefined
  
  /**
    * An identifier for the content. The service sends this value to the key server to identify the current endpoint. The resource ID is also known as the content ID. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var ResourceId: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the role that you created during setup (when you set up AWS Elemental MediaConnect as a trusted entity).
    */
  var RoleArn: string
  
  /**
    * The ARN of the secret that you created in AWS Secrets Manager to store the encryption key. This parameter is required for static key encryption and is not valid for SPEKE encryption.
    */
  var SecretArn: js.UndefOr[string] = js.undefined
  
  /**
    * The URL from the API Gateway proxy that you set up to talk to your key server. This parameter is required for SPEKE encryption and is not valid for static key encryption.
    */
  var Url: js.UndefOr[string] = js.undefined
}
object Encryption {
  
  inline def apply(RoleArn: string): Encryption = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryption]
  }
  
  extension [Self <: Encryption](x: Self) {
    
    inline def setAlgorithm(value: Algorithm): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    inline def setConstantInitializationVector(value: string): Self = StObject.set(x, "ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    inline def setConstantInitializationVectorUndefined: Self = StObject.set(x, "ConstantInitializationVector", js.undefined)
    
    inline def setDeviceId(value: string): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
    
    inline def setRegion(value: string): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArn(value: string): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
