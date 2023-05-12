package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfiguredTableAnalysisRuleInput extends StObject {
  
  /**
    * The analysis rule to be retrieved. Configured table analysis rules are uniquely identified by their configured table identifier and analysis rule type.
    */
  var analysisRuleType: ConfiguredTableAnalysisRuleType
  
  /**
    * The unique identifier for the configured table to retrieve. Currently accepts the configured table ID.
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
}
object GetConfiguredTableAnalysisRuleInput {
  
  inline def apply(
    analysisRuleType: ConfiguredTableAnalysisRuleType,
    configuredTableIdentifier: ConfiguredTableIdentifier
  ): GetConfiguredTableAnalysisRuleInput = {
    val __obj = js.Dynamic.literal(analysisRuleType = analysisRuleType.asInstanceOf[js.Any], configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfiguredTableAnalysisRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfiguredTableAnalysisRuleInput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRuleType(value: ConfiguredTableAnalysisRuleType): Self = StObject.set(x, "analysisRuleType", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
  }
}
