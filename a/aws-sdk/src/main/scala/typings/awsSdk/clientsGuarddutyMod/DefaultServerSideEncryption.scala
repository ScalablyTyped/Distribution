package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultServerSideEncryption extends StObject {
  
  /**
    * The type of encryption used for objects within the S3 bucket.
    */
  var EncryptionType: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket EncryptionType is aws:kms.
    */
  var KmsMasterKeyArn: js.UndefOr[String] = js.undefined
}
object DefaultServerSideEncryption {
  
  inline def apply(): DefaultServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultServerSideEncryption]
  }
  
  extension [Self <: DefaultServerSideEncryption](x: Self) {
    
    inline def setEncryptionType(value: String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setKmsMasterKeyArn(value: String): Self = StObject.set(x, "KmsMasterKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyArnUndefined: Self = StObject.set(x, "KmsMasterKeyArn", js.undefined)
  }
}
