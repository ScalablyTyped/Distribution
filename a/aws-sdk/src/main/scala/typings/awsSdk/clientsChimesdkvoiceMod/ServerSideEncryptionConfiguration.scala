package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerSideEncryptionConfiguration extends StObject {
  
  /**
    * The ARN of the KMS key used to encrypt the enrollment data in a voice profile domain. Asymmetric customer managed keys are not supported.
    */
  var KmsKeyArn: Arn
}
object ServerSideEncryptionConfiguration {
  
  inline def apply(KmsKeyArn: Arn): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(KmsKeyArn = KmsKeyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerSideEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyArn(value: Arn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
  }
}
