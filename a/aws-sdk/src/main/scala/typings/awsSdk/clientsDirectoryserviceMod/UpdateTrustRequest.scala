package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTrustRequest extends StObject {
  
  /**
    * Updates selective authentication for the trust.
    */
  var SelectiveAuth: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.SelectiveAuth] = js.undefined
  
  /**
    * Identifier of the trust relationship.
    */
  var TrustId: typings.awsSdk.clientsDirectoryserviceMod.TrustId
}
object UpdateTrustRequest {
  
  inline def apply(TrustId: TrustId): UpdateTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrustRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTrustRequest] (val x: Self) extends AnyVal {
    
    inline def setSelectiveAuth(value: SelectiveAuth): Self = StObject.set(x, "SelectiveAuth", value.asInstanceOf[js.Any])
    
    inline def setSelectiveAuthUndefined: Self = StObject.set(x, "SelectiveAuth", js.undefined)
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
