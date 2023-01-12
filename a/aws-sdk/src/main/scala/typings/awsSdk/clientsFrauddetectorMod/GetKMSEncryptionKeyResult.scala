package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKMSEncryptionKeyResult extends StObject {
  
  /**
    * The KMS encryption key.
    */
  var kmsKey: js.UndefOr[KMSKey] = js.undefined
}
object GetKMSEncryptionKeyResult {
  
  inline def apply(): GetKMSEncryptionKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKMSEncryptionKeyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetKMSEncryptionKeyResult] (val x: Self) extends AnyVal {
    
    inline def setKmsKey(value: KMSKey): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
  }
}
