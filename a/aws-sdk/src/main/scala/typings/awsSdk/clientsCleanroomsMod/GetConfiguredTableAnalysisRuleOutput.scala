package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfiguredTableAnalysisRuleOutput extends StObject {
  
  /**
    * The entire analysis rule output.
    */
  var analysisRule: ConfiguredTableAnalysisRule
}
object GetConfiguredTableAnalysisRuleOutput {
  
  inline def apply(analysisRule: ConfiguredTableAnalysisRule): GetConfiguredTableAnalysisRuleOutput = {
    val __obj = js.Dynamic.literal(analysisRule = analysisRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfiguredTableAnalysisRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfiguredTableAnalysisRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRule(value: ConfiguredTableAnalysisRule): Self = StObject.set(x, "analysisRule", value.asInstanceOf[js.Any])
  }
}
