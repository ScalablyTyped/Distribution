package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfiguredTableAnalysisRuleOutput extends StObject {
  
  /**
    * The entire updated analysis rule.
    */
  var analysisRule: ConfiguredTableAnalysisRule
}
object UpdateConfiguredTableAnalysisRuleOutput {
  
  inline def apply(analysisRule: ConfiguredTableAnalysisRule): UpdateConfiguredTableAnalysisRuleOutput = {
    val __obj = js.Dynamic.literal(analysisRule = analysisRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfiguredTableAnalysisRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfiguredTableAnalysisRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRule(value: ConfiguredTableAnalysisRule): Self = StObject.set(x, "analysisRule", value.asInstanceOf[js.Any])
  }
}
