package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (SSE-S3), server-side encryption with KMS-managed keys (SSE-KMS), or client-side encryption with KMS-managed keys (CSE-KMS) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup. 
    */
  var EncryptionOption: typings.awsSdk.athenaMod.EncryptionOption
  
  /**
    * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
    */
  var KmsKey: js.UndefOr[String] = js.undefined
}
object EncryptionConfiguration {
  
  inline def apply(EncryptionOption: EncryptionOption): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(EncryptionOption = EncryptionOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  extension [Self <: EncryptionConfiguration](x: Self) {
    
    inline def setEncryptionOption(value: EncryptionOption): Self = StObject.set(x, "EncryptionOption", value.asInstanceOf[js.Any])
    
    inline def setKmsKey(value: String): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
  }
}
