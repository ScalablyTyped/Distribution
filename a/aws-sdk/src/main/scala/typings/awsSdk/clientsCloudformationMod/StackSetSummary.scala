package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetSummary extends StObject {
  
  /**
    * [Service-managed permissions] Describes whether StackSets automatically deploys to Organizations accounts that are added to a target organizational unit (OU).
    */
  var AutoDeployment: js.UndefOr[typings.awsSdk.clientsCloudformationMod.AutoDeployment] = js.undefined
  
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: CloudFormation hasn't checked the stack set for drift.    IN_SYNC: All the stack instances belonging to the stack set stack match from the expected template and parameter configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.undefined
  
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection hasn't yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Describes whether StackSets performs non-conflicting operations concurrently and queues conflicting operations.
    */
  var ManagedExecution: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ManagedExecution] = js.undefined
  
  /**
    * Describes how the IAM roles required for stack set operations are created.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.undefined
  
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackSetId] = js.undefined
  
  /**
    * The name of the stack set.
    */
  var StackSetName: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackSetName] = js.undefined
  
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.undefined
}
object StackSetSummary {
  
  inline def apply(): StackSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetSummary]
  }
  
  extension [Self <: StackSetSummary](x: Self) {
    
    inline def setAutoDeployment(value: AutoDeployment): Self = StObject.set(x, "AutoDeployment", value.asInstanceOf[js.Any])
    
    inline def setAutoDeploymentUndefined: Self = StObject.set(x, "AutoDeployment", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDriftStatus(value: StackDriftStatus): Self = StObject.set(x, "DriftStatus", value.asInstanceOf[js.Any])
    
    inline def setDriftStatusUndefined: Self = StObject.set(x, "DriftStatus", js.undefined)
    
    inline def setLastDriftCheckTimestamp(value: js.Date): Self = StObject.set(x, "LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastDriftCheckTimestampUndefined: Self = StObject.set(x, "LastDriftCheckTimestamp", js.undefined)
    
    inline def setManagedExecution(value: ManagedExecution): Self = StObject.set(x, "ManagedExecution", value.asInstanceOf[js.Any])
    
    inline def setManagedExecutionUndefined: Self = StObject.set(x, "ManagedExecution", js.undefined)
    
    inline def setPermissionModel(value: PermissionModels): Self = StObject.set(x, "PermissionModel", value.asInstanceOf[js.Any])
    
    inline def setPermissionModelUndefined: Self = StObject.set(x, "PermissionModel", js.undefined)
    
    inline def setStackSetId(value: StackSetId): Self = StObject.set(x, "StackSetId", value.asInstanceOf[js.Any])
    
    inline def setStackSetIdUndefined: Self = StObject.set(x, "StackSetId", js.undefined)
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
    
    inline def setStackSetNameUndefined: Self = StObject.set(x, "StackSetName", js.undefined)
    
    inline def setStatus(value: StackSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
