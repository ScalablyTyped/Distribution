package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encryption extends StObject {
  
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3, for example AES256 or aws:kms.
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.clientsGlacierMod.EncryptionType] = js.undefined
  
  /**
    * Optional. If the encryption type is aws:kms, you can use this value to specify the encryption context for the job results.
    */
  var KMSContext: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4. 
    */
  var KMSKeyId: js.UndefOr[String] = js.undefined
}
object Encryption {
  
  inline def apply(): Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encryption]
  }
  
  extension [Self <: Encryption](x: Self) {
    
    inline def setEncryptionType(value: EncryptionType): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setKMSContext(value: String): Self = StObject.set(x, "KMSContext", value.asInstanceOf[js.Any])
    
    inline def setKMSContextUndefined: Self = StObject.set(x, "KMSContext", js.undefined)
    
    inline def setKMSKeyId(value: String): Self = StObject.set(x, "KMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyIdUndefined: Self = StObject.set(x, "KMSKeyId", js.undefined)
  }
}
