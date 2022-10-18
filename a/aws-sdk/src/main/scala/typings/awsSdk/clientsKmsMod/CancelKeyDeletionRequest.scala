package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelKeyDeletionRequest extends StObject {
  
  /**
    * Identifies the KMS key whose deletion is being canceled. Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
}
object CancelKeyDeletionRequest {
  
  inline def apply(KeyId: KeyIdType): CancelKeyDeletionRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelKeyDeletionRequest]
  }
  
  extension [Self <: CancelKeyDeletionRequest](x: Self) {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
