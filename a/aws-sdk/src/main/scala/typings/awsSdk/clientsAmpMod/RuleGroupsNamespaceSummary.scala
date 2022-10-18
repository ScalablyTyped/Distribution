package typings.awsSdk.clientsAmpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupsNamespaceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of this rule groups namespace.
    */
  var arn: RuleGroupsNamespaceArn
  
  /**
    * The time when the rule groups namespace was created.
    */
  var createdAt: js.Date
  
  /**
    * The time when the rule groups namespace was modified.
    */
  var modifiedAt: js.Date
  
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
object RuleGroupsNamespaceSummary {
  
  inline def apply(
    arn: RuleGroupsNamespaceArn,
    createdAt: js.Date,
    modifiedAt: js.Date,
    name: RuleGroupsNamespaceName,
    status: RuleGroupsNamespaceStatus
  ): RuleGroupsNamespaceSummary = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], modifiedAt = modifiedAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupsNamespaceSummary]
  }
  
  extension [Self <: RuleGroupsNamespaceSummary](x: Self) {
    
    inline def setArn(value: RuleGroupsNamespaceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setModifiedAt(value: js.Date): Self = StObject.set(x, "modifiedAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleGroupsNamespaceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RuleGroupsNamespaceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
