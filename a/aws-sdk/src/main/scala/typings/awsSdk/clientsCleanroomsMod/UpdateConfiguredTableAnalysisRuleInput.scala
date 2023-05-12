package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfiguredTableAnalysisRuleInput extends StObject {
  
  /**
    * The new analysis rule policy for the configured table analysis rule.
    */
  var analysisRulePolicy: ConfiguredTableAnalysisRulePolicy
  
  /**
    * The analysis rule type to be updated. Configured table analysis rules are uniquely identified by their configured table identifier and analysis rule type.
    */
  var analysisRuleType: ConfiguredTableAnalysisRuleType
  
  /**
    * The unique identifier for the configured table that the analysis rule applies to. Currently accepts the configured table ID.
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
}
object UpdateConfiguredTableAnalysisRuleInput {
  
  inline def apply(
    analysisRulePolicy: ConfiguredTableAnalysisRulePolicy,
    analysisRuleType: ConfiguredTableAnalysisRuleType,
    configuredTableIdentifier: ConfiguredTableIdentifier
  ): UpdateConfiguredTableAnalysisRuleInput = {
    val __obj = js.Dynamic.literal(analysisRulePolicy = analysisRulePolicy.asInstanceOf[js.Any], analysisRuleType = analysisRuleType.asInstanceOf[js.Any], configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfiguredTableAnalysisRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfiguredTableAnalysisRuleInput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRulePolicy(value: ConfiguredTableAnalysisRulePolicy): Self = StObject.set(x, "analysisRulePolicy", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleType(value: ConfiguredTableAnalysisRuleType): Self = StObject.set(x, "analysisRuleType", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
  }
}
