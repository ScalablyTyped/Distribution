package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyPairRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The format of the key pair. Default: pem 
    */
  var KeyFormat: js.UndefOr[typings.awsSdk.clientsEc2Mod.KeyFormat] = js.undefined
  
  /**
    * A unique name for the key pair. Constraints: Up to 255 ASCII characters
    */
  var KeyName: String
  
  /**
    * The type of key pair. Note that ED25519 keys are not supported for Windows instances. Default: rsa 
    */
  var KeyType: js.UndefOr[typings.awsSdk.clientsEc2Mod.KeyType] = js.undefined
  
  /**
    * The tags to apply to the new key pair.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateKeyPairRequest {
  
  inline def apply(KeyName: String): CreateKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyPairRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyPairRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setKeyFormat(value: KeyFormat): Self = StObject.set(x, "KeyFormat", value.asInstanceOf[js.Any])
    
    inline def setKeyFormatUndefined: Self = StObject.set(x, "KeyFormat", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
