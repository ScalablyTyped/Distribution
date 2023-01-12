package typings.awsSdk.clientsApprunnerMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKmsKey(value: KmsKeyArn): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
  }
}
