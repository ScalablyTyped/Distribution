package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectCountByEncryptionType extends StObject {
  
  /**
    * The total number of objects that are encrypted with a customer-provided key. The objects use customer-provided server-side encryption (SSE-C).
    */
  var customerManaged: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that are encrypted with an KMS key, either an Amazon Web Services managed key or a customer managed key. The objects use KMS encryption (SSE-KMS).
    */
  var kmsManaged: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that are encrypted with an Amazon S3 managed key. The objects use Amazon S3 managed encryption (SSE-S3).
    */
  var s3Managed: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that aren't encrypted or use client-side encryption.
    */
  var unencrypted: js.UndefOr[long] = js.undefined
  
  /**
    * The total number of objects that Amazon Macie doesn't have current encryption metadata for. Macie can't provide current data about the encryption settings for these objects.
    */
  var unknown: js.UndefOr[long] = js.undefined
}
object ObjectCountByEncryptionType {
  
  inline def apply(): ObjectCountByEncryptionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectCountByEncryptionType]
  }
  
  extension [Self <: ObjectCountByEncryptionType](x: Self) {
    
    inline def setCustomerManaged(value: long): Self = StObject.set(x, "customerManaged", value.asInstanceOf[js.Any])
    
    inline def setCustomerManagedUndefined: Self = StObject.set(x, "customerManaged", js.undefined)
    
    inline def setKmsManaged(value: long): Self = StObject.set(x, "kmsManaged", value.asInstanceOf[js.Any])
    
    inline def setKmsManagedUndefined: Self = StObject.set(x, "kmsManaged", js.undefined)
    
    inline def setS3Managed(value: long): Self = StObject.set(x, "s3Managed", value.asInstanceOf[js.Any])
    
    inline def setS3ManagedUndefined: Self = StObject.set(x, "s3Managed", js.undefined)
    
    inline def setUnencrypted(value: long): Self = StObject.set(x, "unencrypted", value.asInstanceOf[js.Any])
    
    inline def setUnencryptedUndefined: Self = StObject.set(x, "unencrypted", js.undefined)
    
    inline def setUnknown(value: long): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
