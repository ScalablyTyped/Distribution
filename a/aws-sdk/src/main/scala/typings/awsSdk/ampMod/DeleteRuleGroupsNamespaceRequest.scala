package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRuleGroupsNamespaceRequest extends StObject {
  
  /**
    * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The rule groups namespace name.
    */
  var name: RuleGroupsNamespaceName
  
  /**
    * The ID of the workspace to delete rule group definition.
    */
  var workspaceId: WorkspaceId
}
object DeleteRuleGroupsNamespaceRequest {
  
  inline def apply(name: RuleGroupsNamespaceName, workspaceId: WorkspaceId): DeleteRuleGroupsNamespaceRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleGroupsNamespaceRequest]
  }
  
  extension [Self <: DeleteRuleGroupsNamespaceRequest](x: Self) {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setName(value: RuleGroupsNamespaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
