package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of the key identifiers that KMS supports, unless you're using a key that's managed by another account. If you're using a key managed by another account, then specify the key ARN. For more information, see Key ID in the Amazon Web Services KMS Developer Guide.
    */
  var KeyId: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.KeyId] = js.undefined
  
  /**
    * The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
    */
  var Type: EncryptionType
}
object EncryptionConfiguration {
  
  inline def apply(Type: EncryptionType): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: KeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setType(value: EncryptionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
