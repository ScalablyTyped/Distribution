package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SseConfiguration extends StObject {
  
  /**
    *  The KMS encryption configuration used to provide details for data encryption. 
    */
  var KmsEncryptionConfig: typings.awsSdk.clientsHealthlakeMod.KmsEncryptionConfig
}
object SseConfiguration {
  
  inline def apply(KmsEncryptionConfig: KmsEncryptionConfig): SseConfiguration = {
    val __obj = js.Dynamic.literal(KmsEncryptionConfig = KmsEncryptionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SseConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SseConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKmsEncryptionConfig(value: KmsEncryptionConfig): Self = StObject.set(x, "KmsEncryptionConfig", value.asInstanceOf[js.Any])
  }
}
