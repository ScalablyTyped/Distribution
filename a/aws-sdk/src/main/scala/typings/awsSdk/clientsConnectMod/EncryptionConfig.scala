package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfig extends StObject {
  
  /**
    * The type of encryption.
    */
  var EncryptionType: typings.awsSdk.clientsConnectMod.EncryptionType
  
  /**
    * The full ARN of the encryption key.   Be sure to provide the full ARN of the encryption key, not just the ID. Amazon Connect supports only KMS keys with the default key spec of  SYMMETRIC_DEFAULT .  
    */
  var KeyId: typings.awsSdk.clientsConnectMod.KeyId
}
object EncryptionConfig {
  
  inline def apply(EncryptionType: EncryptionType, KeyId: KeyId): EncryptionConfig = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfig] (val x: Self) extends AnyVal {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
