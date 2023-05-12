package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfiguredTableAnalysisRuleInput extends StObject {
  
  /**
    * The entire created configured table analysis rule object.
    */
  var analysisRulePolicy: ConfiguredTableAnalysisRulePolicy
  
  /**
    * The type of analysis rule. Valid values are AGGREGATION and LIST.
    */
  var analysisRuleType: ConfiguredTableAnalysisRuleType
  
  /**
    * The identifier for the configured table to create the analysis rule for. Currently accepts the configured table ID. 
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
}
object CreateConfiguredTableAnalysisRuleInput {
  
  inline def apply(
    analysisRulePolicy: ConfiguredTableAnalysisRulePolicy,
    analysisRuleType: ConfiguredTableAnalysisRuleType,
    configuredTableIdentifier: ConfiguredTableIdentifier
  ): CreateConfiguredTableAnalysisRuleInput = {
    val __obj = js.Dynamic.literal(analysisRulePolicy = analysisRulePolicy.asInstanceOf[js.Any], analysisRuleType = analysisRuleType.asInstanceOf[js.Any], configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfiguredTableAnalysisRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConfiguredTableAnalysisRuleInput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRulePolicy(value: ConfiguredTableAnalysisRulePolicy): Self = StObject.set(x, "analysisRulePolicy", value.asInstanceOf[js.Any])
    
    inline def setAnalysisRuleType(value: ConfiguredTableAnalysisRuleType): Self = StObject.set(x, "analysisRuleType", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
  }
}
