package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingImageEncryptionConfiguration extends StObject {
  
  /**
    * The ARN for a KMS key that is used to encrypt studio data.
    */
  var keyArn: js.UndefOr[StreamingImageEncryptionConfigurationKeyArn] = js.undefined
  
  /**
    * The type of KMS key that is used to encrypt studio data.
    */
  var keyType: StreamingImageEncryptionConfigurationKeyType
}
object StreamingImageEncryptionConfiguration {
  
  inline def apply(keyType: StreamingImageEncryptionConfigurationKeyType): StreamingImageEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingImageEncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamingImageEncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKeyArn(value: StreamingImageEncryptionConfigurationKeyArn): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
    
    inline def setKeyType(value: StreamingImageEncryptionConfigurationKeyType): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
  }
}
