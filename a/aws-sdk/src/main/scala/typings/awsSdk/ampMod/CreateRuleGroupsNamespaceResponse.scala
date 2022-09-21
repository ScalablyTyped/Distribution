package typings.awsSdk.ampMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleGroupsNamespaceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this rule groups namespace.
    */
  var arn: RuleGroupsNamespaceArn
  
  /**
    * The rule groups namespace name.
    */
  var name: RuleGroupsNamespaceName
  
  /**
    * The status of rule groups namespace.
    */
  var status: RuleGroupsNamespaceStatus
  
  /**
    * The tags of this rule groups namespace.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRuleGroupsNamespaceResponse {
  
  inline def apply(arn: RuleGroupsNamespaceArn, name: RuleGroupsNamespaceName, status: RuleGroupsNamespaceStatus): CreateRuleGroupsNamespaceResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleGroupsNamespaceResponse]
  }
  
  extension [Self <: CreateRuleGroupsNamespaceResponse](x: Self) {
    
    inline def setArn(value: RuleGroupsNamespaceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleGroupsNamespaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RuleGroupsNamespaceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
