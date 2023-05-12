package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryption extends StObject {
  
  /**
    * The server-side encryption algorithm that's used when storing data in the bucket or object. If default encryption settings aren't configured for the bucket or the object isn't encrypted using server-side encryption, this value is NONE.
    */
  var encryptionType: js.UndefOr[EncryptionType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) or unique identifier (key ID) for the KMS key that's used to encrypt data in the bucket or the object. This value is null if an KMS key isn't used to encrypt the data.
    */
  var kmsMasterKeyId: js.UndefOr[string] = js.undefined
}
object ServerSideEncryption {
  
  inline def apply(): ServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerSideEncryption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerSideEncryption] (val x: Self) extends AnyVal {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
    
    inline def setKmsMasterKeyId(value: string): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
  }
}
