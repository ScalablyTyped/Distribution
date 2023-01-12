package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivedMetadata extends StObject {
  
  /**
    * Allowed operations.
    */
  var AllowedOperations: js.UndefOr[AllowedOperationList] = js.undefined
  
  /**
    * Received status.
    */
  var ReceivedStatus: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ReceivedStatus] = js.undefined
  
  /**
    * Received status reason.
    */
  var ReceivedStatusReason: js.UndefOr[StatusReasonMessage] = js.undefined
}
object ReceivedMetadata {
  
  inline def apply(): ReceivedMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceivedMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceivedMetadata] (val x: Self) extends AnyVal {
    
    inline def setAllowedOperations(value: AllowedOperationList): Self = StObject.set(x, "AllowedOperations", value.asInstanceOf[js.Any])
    
    inline def setAllowedOperationsUndefined: Self = StObject.set(x, "AllowedOperations", js.undefined)
    
    inline def setAllowedOperationsVarargs(value: AllowedOperation*): Self = StObject.set(x, "AllowedOperations", js.Array(value*))
    
    inline def setReceivedStatus(value: ReceivedStatus): Self = StObject.set(x, "ReceivedStatus", value.asInstanceOf[js.Any])
    
    inline def setReceivedStatusReason(value: StatusReasonMessage): Self = StObject.set(x, "ReceivedStatusReason", value.asInstanceOf[js.Any])
    
    inline def setReceivedStatusReasonUndefined: Self = StObject.set(x, "ReceivedStatusReason", js.undefined)
    
    inline def setReceivedStatusUndefined: Self = StObject.set(x, "ReceivedStatus", js.undefined)
  }
}
