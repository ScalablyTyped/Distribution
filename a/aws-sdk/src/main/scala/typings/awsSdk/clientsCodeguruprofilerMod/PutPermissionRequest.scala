package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPermissionRequest extends StObject {
  
  /**
    *  Specifies an action group that contains permissions to add to a profiling group resource. One action group is supported, agentPermissions, which grants permission to perform actions required by the profiling agent, ConfigureAgent and PostAgentProfile permissions. 
    */
  var actionGroup: ActionGroup
  
  /**
    *  A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are supported in the ARNs. 
    */
  var principals: Principals
  
  /**
    * The name of the profiling group to grant access to.
    */
  var profilingGroupName: ProfilingGroupName
  
  /**
    *  A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling group. Do not specify this when you add permissions to a profiling group for the first time. If a policy already exists on the profiling group, you must specify the revisionId. 
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
}
object PutPermissionRequest {
  
  inline def apply(actionGroup: ActionGroup, principals: Principals, profilingGroupName: ProfilingGroupName): PutPermissionRequest = {
    val __obj = js.Dynamic.literal(actionGroup = actionGroup.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionGroup(value: ActionGroup): Self = StObject.set(x, "actionGroup", value.asInstanceOf[js.Any])
    
    inline def setPrincipals(value: Principals): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsVarargs(value: Principal*): Self = StObject.set(x, "principals", js.Array(value*))
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
