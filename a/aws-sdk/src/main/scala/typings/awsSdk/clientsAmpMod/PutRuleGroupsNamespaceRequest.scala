package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRuleGroupsNamespaceRequest extends StObject {
  
  /**
    * Optional, unique, case-sensitive, user-provided identifier to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The namespace data that define the rule groups.
    */
  var data: RuleGroupsNamespaceData
  
  /**
    * The rule groups namespace name.
    */
  var name: RuleGroupsNamespaceName
  
  /**
    * The ID of the workspace in which to update the rule group namespace.
    */
  var workspaceId: WorkspaceId
}
object PutRuleGroupsNamespaceRequest {
  
  inline def apply(data: RuleGroupsNamespaceData, name: RuleGroupsNamespaceName, workspaceId: WorkspaceId): PutRuleGroupsNamespaceRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRuleGroupsNamespaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRuleGroupsNamespaceRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setData(value: RuleGroupsNamespaceData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleGroupsNamespaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
