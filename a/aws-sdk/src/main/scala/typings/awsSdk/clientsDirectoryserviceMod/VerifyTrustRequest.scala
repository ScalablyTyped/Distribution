package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyTrustRequest extends StObject {
  
  /**
    * The unique Trust ID of the trust relationship to verify.
    */
  var TrustId: typings.awsSdk.clientsDirectoryserviceMod.TrustId
}
object VerifyTrustRequest {
  
  inline def apply(TrustId: TrustId): VerifyTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyTrustRequest]
  }
  
  extension [Self <: VerifyTrustRequest](x: Self) {
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
