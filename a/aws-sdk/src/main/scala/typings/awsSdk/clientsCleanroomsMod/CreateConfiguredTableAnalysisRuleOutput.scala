package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfiguredTableAnalysisRuleOutput extends StObject {
  
  /**
    * The entire created analysis rule.
    */
  var analysisRule: ConfiguredTableAnalysisRule
}
object CreateConfiguredTableAnalysisRuleOutput {
  
  inline def apply(analysisRule: ConfiguredTableAnalysisRule): CreateConfiguredTableAnalysisRuleOutput = {
    val __obj = js.Dynamic.literal(analysisRule = analysisRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfiguredTableAnalysisRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConfiguredTableAnalysisRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRule(value: ConfiguredTableAnalysisRule): Self = StObject.set(x, "analysisRule", value.asInstanceOf[js.Any])
  }
}
