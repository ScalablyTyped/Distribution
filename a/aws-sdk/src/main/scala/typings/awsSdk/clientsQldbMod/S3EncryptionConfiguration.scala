package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3EncryptionConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric encryption key in Key Management Service (KMS). Amazon S3 does not support asymmetric KMS keys. You must provide a KmsKeyArn if you specify SSE_KMS as the ObjectEncryptionType.  KmsKeyArn is not required if you specify SSE_S3 as the ObjectEncryptionType.
    */
  var KmsKeyArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon S3 object encryption type. To learn more about server-side encryption options in Amazon S3, see Protecting Data Using Server-Side Encryption in the Amazon S3 Developer Guide.
    */
  var ObjectEncryptionType: S3ObjectEncryptionType
}
object S3EncryptionConfiguration {
  
  inline def apply(ObjectEncryptionType: S3ObjectEncryptionType): S3EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(ObjectEncryptionType = ObjectEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyArn(value: Arn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setObjectEncryptionType(value: S3ObjectEncryptionType): Self = StObject.set(x, "ObjectEncryptionType", value.asInstanceOf[js.Any])
  }
}
