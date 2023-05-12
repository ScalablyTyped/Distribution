package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for the KMS key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric encryption KMS keys. For more information, see Symmetric encryption KMS keys in the Amazon Web Services Key Management Service Developer Guide.
    */
  var ReplicaKmsKeyID: js.UndefOr[typings.awsSdk.clientsS3controlMod.ReplicaKmsKeyID] = js.undefined
}
object EncryptionConfiguration {
  
  inline def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setReplicaKmsKeyID(value: ReplicaKmsKeyID): Self = StObject.set(x, "ReplicaKmsKeyID", value.asInstanceOf[js.Any])
    
    inline def setReplicaKmsKeyIDUndefined: Self = StObject.set(x, "ReplicaKmsKeyID", js.undefined)
  }
}
