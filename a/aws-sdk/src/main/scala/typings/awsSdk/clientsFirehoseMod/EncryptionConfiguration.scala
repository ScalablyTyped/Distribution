package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * The encryption key.
    */
  var KMSEncryptionConfig: js.UndefOr[typings.awsSdk.clientsFirehoseMod.KMSEncryptionConfig] = js.undefined
  
  /**
    * Specifically override existing encryption information to ensure that no encryption is used.
    */
  var NoEncryptionConfig: js.UndefOr[typings.awsSdk.clientsFirehoseMod.NoEncryptionConfig] = js.undefined
}
object EncryptionConfiguration {
  
  inline def apply(): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setKMSEncryptionConfig(value: KMSEncryptionConfig): Self = StObject.set(x, "KMSEncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setKMSEncryptionConfigUndefined: Self = StObject.set(x, "KMSEncryptionConfig", js.undefined)
    
    inline def setNoEncryptionConfig(value: NoEncryptionConfig): Self = StObject.set(x, "NoEncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setNoEncryptionConfigUndefined: Self = StObject.set(x, "NoEncryptionConfig", js.undefined)
  }
}
