package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrustRequest extends StObject {
  
  /**
    * Delete a conditional forwarder as part of a DeleteTrustRequest.
    */
  var DeleteAssociatedConditionalForwarder: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DeleteAssociatedConditionalForwarder] = js.undefined
  
  /**
    * The Trust ID of the trust relationship to be deleted.
    */
  var TrustId: typings.awsSdk.clientsDirectoryserviceMod.TrustId
}
object DeleteTrustRequest {
  
  inline def apply(TrustId: TrustId): DeleteTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTrustRequest] (val x: Self) extends AnyVal {
    
    inline def setDeleteAssociatedConditionalForwarder(value: DeleteAssociatedConditionalForwarder): Self = StObject.set(x, "DeleteAssociatedConditionalForwarder", value.asInstanceOf[js.Any])
    
    inline def setDeleteAssociatedConditionalForwarderUndefined: Self = StObject.set(x, "DeleteAssociatedConditionalForwarder", js.undefined)
    
    inline def setTrustId(value: TrustId): Self = StObject.set(x, "TrustId", value.asInstanceOf[js.Any])
  }
}
