package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantConstraints extends StObject {
  
  /**
    * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint.
    */
  var EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.undefined
  
  /**
    * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs.
    */
  var EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.undefined
}
object GrantConstraints {
  
  inline def apply(): GrantConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrantConstraints] (val x: Self) extends AnyVal {
    
    inline def setEncryptionContextEquals(value: EncryptionContextType): Self = StObject.set(x, "EncryptionContextEquals", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "EncryptionContextEquals", js.undefined)
    
    inline def setEncryptionContextSubset(value: EncryptionContextType): Self = StObject.set(x, "EncryptionContextSubset", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "EncryptionContextSubset", js.undefined)
  }
}
