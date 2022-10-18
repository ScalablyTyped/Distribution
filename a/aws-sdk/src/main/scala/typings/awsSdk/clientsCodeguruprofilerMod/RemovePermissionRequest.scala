package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemovePermissionRequest extends StObject {
  
  /**
    *  Specifies an action group that contains the permissions to remove from a profiling group's resource-based policy. One action group is supported, agentPermissions, which grants ConfigureAgent and PostAgentProfile permissions. 
    */
  var actionGroup: ActionGroup
  
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName
  
  /**
    *  A universally unique identifier (UUID) for the revision of the resource-based policy from which you want to remove permissions. 
    */
  var revisionId: RevisionId
}
object RemovePermissionRequest {
  
  inline def apply(actionGroup: ActionGroup, profilingGroupName: ProfilingGroupName, revisionId: RevisionId): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(actionGroup = actionGroup.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionRequest]
  }
  
  extension [Self <: RemovePermissionRequest](x: Self) {
    
    inline def setActionGroup(value: ActionGroup): Self = StObject.set(x, "actionGroup", value.asInstanceOf[js.Any])
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
  }
}
