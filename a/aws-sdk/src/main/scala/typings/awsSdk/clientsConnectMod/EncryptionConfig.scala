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
    * The full ARN of the encryption key.   Be sure to provide the full ARN of the encryption key, not just the ID. 
    */
  var KeyId: typings.awsSdk.clientsConnectMod.KeyId
}
object EncryptionConfig {
  
  inline def apply(EncryptionType: EncryptionType, KeyId: KeyId): EncryptionConfig = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfig]
  }
  
  extension [Self <: EncryptionConfig](x: Self) {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
