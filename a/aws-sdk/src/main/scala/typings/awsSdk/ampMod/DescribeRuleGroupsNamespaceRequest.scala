package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuleGroupsNamespaceRequest extends StObject {
  
  /**
    * The rule groups namespace.
    */
  var name: RuleGroupsNamespaceName
  
  /**
    * The ID of the workspace to describe.
    */
  var workspaceId: WorkspaceId
}
object DescribeRuleGroupsNamespaceRequest {
  
  inline def apply(name: RuleGroupsNamespaceName, workspaceId: WorkspaceId): DescribeRuleGroupsNamespaceRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuleGroupsNamespaceRequest]
  }
  
  extension [Self <: DescribeRuleGroupsNamespaceRequest](x: Self) {
    
    inline def setName(value: RuleGroupsNamespaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
