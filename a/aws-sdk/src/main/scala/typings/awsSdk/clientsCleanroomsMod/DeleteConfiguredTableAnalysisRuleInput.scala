package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfiguredTableAnalysisRuleInput extends StObject {
  
  /**
    * The analysis rule type to be deleted. Configured table analysis rules are uniquely identified by their configured table identifier and analysis rule type.
    */
  var analysisRuleType: ConfiguredTableAnalysisRuleType
  
  /**
    * The unique identifier for the configured table that the analysis rule applies to. Currently accepts the configured table ID.
    */
  var configuredTableIdentifier: ConfiguredTableIdentifier
}
object DeleteConfiguredTableAnalysisRuleInput {
  
  inline def apply(
    analysisRuleType: ConfiguredTableAnalysisRuleType,
    configuredTableIdentifier: ConfiguredTableIdentifier
  ): DeleteConfiguredTableAnalysisRuleInput = {
    val __obj = js.Dynamic.literal(analysisRuleType = analysisRuleType.asInstanceOf[js.Any], configuredTableIdentifier = configuredTableIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConfiguredTableAnalysisRuleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteConfiguredTableAnalysisRuleInput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRuleType(value: ConfiguredTableAnalysisRuleType): Self = StObject.set(x, "analysisRuleType", value.asInstanceOf[js.Any])
    
    inline def setConfiguredTableIdentifier(value: ConfiguredTableIdentifier): Self = StObject.set(x, "configuredTableIdentifier", value.asInstanceOf[js.Any])
  }
}
