package typings.awsSdk.clientsCloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRequestStatusFilter extends StObject {
  
  /**
    * The operation statuses to include in the filter.    PENDING: The operation has been requested, but not yet initiated.    IN_PROGRESS: The operation is in progress.    SUCCESS: The operation completed.    FAILED: The operation failed.    CANCEL_IN_PROGRESS: The operation is in the process of being canceled.    CANCEL_COMPLETE: The operation has been canceled.  
    */
  var OperationStatuses: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.OperationStatuses] = js.undefined
  
  /**
    * The operation types to include in the filter.
    */
  var Operations: js.UndefOr[typings.awsSdk.clientsCloudcontrolMod.Operations] = js.undefined
}
object ResourceRequestStatusFilter {
  
  inline def apply(): ResourceRequestStatusFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRequestStatusFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceRequestStatusFilter] (val x: Self) extends AnyVal {
    
    inline def setOperationStatuses(value: OperationStatuses): Self = StObject.set(x, "OperationStatuses", value.asInstanceOf[js.Any])
    
    inline def setOperationStatusesUndefined: Self = StObject.set(x, "OperationStatuses", js.undefined)
    
    inline def setOperationStatusesVarargs(value: OperationStatus*): Self = StObject.set(x, "OperationStatuses", js.Array(value*))
    
    inline def setOperations(value: Operations): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "Operations", js.Array(value*))
  }
}
