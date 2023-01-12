package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningConfigurationOverrides extends StObject {
  
  /**
    * A specified override of the default encryption algorithm that is used in a code signing job.
    */
  var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.undefined
  
  /**
    * A specified override of the default hash algorithm that is used in a code signing job.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
}
object SigningConfigurationOverrides {
  
  inline def apply(): SigningConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningConfigurationOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SigningConfigurationOverrides] (val x: Self) extends AnyVal {
    
    inline def setEncryptionAlgorithm(value: EncryptionAlgorithm): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
    
    inline def setHashAlgorithm(value: HashAlgorithm): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
  }
}
