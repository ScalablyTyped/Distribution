package typings.awsSdk.clientsMarketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterUsageResult extends StObject {
  
  /**
    * (Optional) Only included when public key version has expired
    */
  var PublicKeyRotationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * JWT Token
    */
  var Signature: js.UndefOr[NonEmptyString] = js.undefined
}
object RegisterUsageResult {
  
  inline def apply(): RegisterUsageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterUsageResult]
  }
  
  extension [Self <: RegisterUsageResult](x: Self) {
    
    inline def setPublicKeyRotationTimestamp(value: js.Date): Self = StObject.set(x, "PublicKeyRotationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyRotationTimestampUndefined: Self = StObject.set(x, "PublicKeyRotationTimestamp", js.undefined)
    
    inline def setSignature(value: NonEmptyString): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
  }
}
