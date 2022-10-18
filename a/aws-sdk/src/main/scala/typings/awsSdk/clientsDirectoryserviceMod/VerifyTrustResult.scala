package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyTrustResult extends StObject {
  
  /**
    * The unique Trust ID of the trust relationship that was verified.
    */
  var TrustId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.TrustId] = js.undefined
}
object VerifyTrustResult {
  
  inline def apply(): VerifyTrustResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyTrustResult]
  }
  
  extension [Self <: VerifyTrustResult](x: Self) {
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
    
    inline def setTrustIdUndefined: Self = StObject.set(x, "TrustId", js.undefined)
  }
}
