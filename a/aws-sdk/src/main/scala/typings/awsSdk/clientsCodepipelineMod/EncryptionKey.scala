package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionKey extends StObject {
  
  /**
    * The ID used to identify the key. For an AWS KMS key, you can use the key ID, the key ARN, or the alias ARN.  Aliases are recognized only in the account that created the customer master key (CMK). For cross-account actions, you can only use the key ID or key ARN to identify the key. 
    */
  var id: EncryptionKeyId
  
  /**
    * The type of encryption key, such as an AWS Key Management Service (AWS KMS) key. When creating or updating a pipeline, the value must be set to 'KMS'.
    */
  var `type`: EncryptionKeyType
}
object EncryptionKey {
  
  inline def apply(id: EncryptionKeyId, `type`: EncryptionKeyType): EncryptionKey = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionKey]
  }
  
  extension [Self <: EncryptionKey](x: Self) {
    
    inline def setId(value: EncryptionKeyId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: EncryptionKeyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
