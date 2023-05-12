package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisRule extends StObject {
  
  /**
    * The unique ID for the associated collaboration.
    */
  var collaborationId: CollaborationIdentifier
  
  /**
    * The time the analysis rule was created.
    */
  var createTime: js.Date
  
  /**
    * The name for the analysis rule.
    */
  var name: TableAlias
  
  /**
    * A policy that describes the associated data usage limitations.
    */
  var policy: AnalysisRulePolicy
  
  /**
    * The type of analysis rule. Valid values are `AGGREGATION` and `LIST`.
    */
  var `type`: AnalysisRuleType
  
  /**
    * The time the analysis rule was last updated.
    */
  var updateTime: js.Date
}
object AnalysisRule {
  
  inline def apply(
    collaborationId: CollaborationIdentifier,
    createTime: js.Date,
    name: TableAlias,
    policy: AnalysisRulePolicy,
    `type`: AnalysisRuleType,
    updateTime: js.Date
  ): AnalysisRule = {
    val __obj = js.Dynamic.literal(collaborationId = collaborationId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisRule] (val x: Self) extends AnyVal {
    
    inline def setCollaborationId(value: CollaborationIdentifier): Self = StObject.set(x, "collaborationId", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: AnalysisRulePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setType(value: AnalysisRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
