package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmsGrantConstraints extends StObject {
  
  /**
    * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint.
    */
  var encryptionContextEquals: js.UndefOr[KmsConstraintsMap] = js.undefined
  
  /**
    * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs.
    */
  var encryptionContextSubset: js.UndefOr[KmsConstraintsMap] = js.undefined
}
object KmsGrantConstraints {
  
  inline def apply(): KmsGrantConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KmsGrantConstraints]
  }
  
  extension [Self <: KmsGrantConstraints](x: Self) {
    
    inline def setEncryptionContextEquals(value: KmsConstraintsMap): Self = StObject.set(x, "encryptionContextEquals", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextEqualsUndefined: Self = StObject.set(x, "encryptionContextEquals", js.undefined)
    
    inline def setEncryptionContextSubset(value: KmsConstraintsMap): Self = StObject.set(x, "encryptionContextSubset", value.asInstanceOf[js.Any])
    
    inline def setEncryptionContextSubsetUndefined: Self = StObject.set(x, "encryptionContextSubset", js.undefined)
  }
}
