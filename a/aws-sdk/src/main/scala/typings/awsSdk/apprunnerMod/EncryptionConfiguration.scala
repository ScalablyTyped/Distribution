package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * The ARN of the KMS key that's used for encryption.
    */
  var KmsKey: KmsKeyArn
}
object EncryptionConfiguration {
  
  inline def apply(KmsKey: KmsKeyArn): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(KmsKey = KmsKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  extension [Self <: EncryptionConfiguration](x: Self) {
    
    inline def setKmsKey(value: KmsKeyArn): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
  }
}
