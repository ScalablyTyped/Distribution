package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfiguredTableAnalysisRule extends StObject {
  
  /**
    * The unique ARN for the configured table.
    */
  var configuredTableArn: ConfiguredTableArn
  
  /**
    * The unique ID for the configured table.
    */
  var configuredTableId: UUID
  
  /**
    * The time the configured table analysis rule was created.
    */
  var createTime: js.Date
  
  /**
    * The policy that controls SQL query rules.
    */
  var policy: ConfiguredTableAnalysisRulePolicy
  
  /**
    * The type of configured table analysis rule. Valid values are `AGGREGATION` and `LIST`.
    */
  var `type`: ConfiguredTableAnalysisRuleType
  
  /**
    * The time the configured table analysis rule was last updated.
    */
  var updateTime: js.Date
}
object ConfiguredTableAnalysisRule {
  
  inline def apply(
    configuredTableArn: ConfiguredTableArn,
    configuredTableId: UUID,
    createTime: js.Date,
    policy: ConfiguredTableAnalysisRulePolicy,
    `type`: ConfiguredTableAnalysisRuleType,
    updateTime: js.Date
  ): ConfiguredTableAnalysisRule = {
    val __obj = js.Dynamic.literal(configuredTableArn = configuredTableArn.asInstanceOf[js.Any], configuredTableId = configuredTableId.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfiguredTableAnalysisRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfiguredTableAnalysisRule] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTableArn(value: ConfiguredTableArn): Self = StObject.set(x, "configuredTableArn", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableId(value: UUID): Self = StObject.set(x, "configuredTableId", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: ConfiguredTableAnalysisRulePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setType(value: ConfiguredTableAnalysisRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
