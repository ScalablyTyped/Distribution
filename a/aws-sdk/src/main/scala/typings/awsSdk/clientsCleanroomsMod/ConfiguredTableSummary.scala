package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfiguredTableSummary extends StObject {
  
  /**
    * The analysis method for the configured tables. The only valid value is currently `DIRECT_QUERY`.
    */
  var analysisMethod: AnalysisMethod
  
  /**
    * The types of analysis rules associated with this configured table.
    */
  var analysisRuleTypes: ConfiguredTableAnalysisRuleTypeList
  
  /**
    * The unique ARN of the configured table.
    */
  var arn: ConfiguredTableArn
  
  /**
    * The time the configured table was created.
    */
  var createTime: js.Date
  
  /**
    * The unique ID of the configured table.
    */
  var id: ConfiguredTableIdentifier
  
  /**
    * The name of the configured table.
    */
  var name: DisplayName
  
  /**
    * The time the configured table was last updated.
    */
  var updateTime: js.Date
}
object ConfiguredTableSummary {
  
  inline def apply(
    analysisMethod: AnalysisMethod,
    analysisRuleTypes: ConfiguredTableAnalysisRuleTypeList,
    arn: ConfiguredTableArn,
    createTime: js.Date,
    id: ConfiguredTableIdentifier,
    name: DisplayName,
    updateTime: js.Date
  ): ConfiguredTableSummary = {
    val __obj = js.Dynamic.literal(analysisMethod = analysisMethod.asInstanceOf[js.Any], analysisRuleTypes = analysisRuleTypes.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfiguredTableSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfiguredTableSummary] (val x: Self) extends AnyVal {
    
    inline def setAnalysisMethod(value: AnalysisMethod): Self = StObject.set(x, "analysisMethod", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleTypes(value: ConfiguredTableAnalysisRuleTypeList): Self = StObject.set(x, "analysisRuleTypes", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleTypesVarargs(value: ConfiguredTableAnalysisRuleType*): Self = StObject.set(x, "analysisRuleTypes", js.Array(value*))
    
    inline def setArn(value: ConfiguredTableArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: ConfiguredTableIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: DisplayName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
