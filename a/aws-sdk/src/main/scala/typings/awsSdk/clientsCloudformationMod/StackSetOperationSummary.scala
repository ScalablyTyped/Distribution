package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetOperationSummary extends StObject {
  
  /**
    * The type of operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack instances that are associated with the specified stack set. Update operations affect both the stack set itself and all associated stack set instances.
    */
  var Action: js.UndefOr[StackSetOperationAction] = js.undefined
  
  /**
    * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested Regions, before actually creating the first stacks.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which the stack set operation ended, across all accounts and Regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or Region.
    */
  var EndTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique ID of the stack set operation.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The overall status of the operation.    FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each Region during stack create and update operations. If the number of failed stacks within a Region exceeds the failure tolerance, the status of the operation in the Region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and CloudFormation cancels the operation in any remaining Regions.    QUEUED: [Service-managed permissions] For automatic deployments that require a sequence of operations, the operation is queued to be performed. For more information, see the stack set operation status codes in the CloudFormation User Guide.    RUNNING: The operation is currently being performed.    STOPPED: The user has canceled the operation.    STOPPING: The operation is in the process of stopping, at user request.    SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
    */
  var Status: js.UndefOr[StackSetOperationStatus] = js.undefined
  
  /**
    * The status of the operation in details.
    */
  var StatusReason: js.UndefOr[StackSetOperationStatusReason] = js.undefined
}
object StackSetOperationSummary {
  
  inline def apply(): StackSetOperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationSummary]
  }
  
  extension [Self <: StackSetOperationSummary](x: Self) {
    
    inline def setAction(value: StackSetOperationAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setEndTimestamp(value: js.Date): Self = StObject.set(x, "EndTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampUndefined: Self = StObject.set(x, "EndTimestamp", js.undefined)
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setStatus(value: StackSetOperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StackSetOperationStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
