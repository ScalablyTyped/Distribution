package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaAnalysisRuleOutput extends StObject {
  
  /**
    * A specification about how data from the configured table can be used.
    */
  var analysisRule: AnalysisRule
}
object GetSchemaAnalysisRuleOutput {
  
  inline def apply(analysisRule: AnalysisRule): GetSchemaAnalysisRuleOutput = {
    val __obj = js.Dynamic.literal(analysisRule = analysisRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaAnalysisRuleOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSchemaAnalysisRuleOutput] (val x: Self) extends AnyVal {
    
    inline def setAnalysisRule(value: AnalysisRule): Self = StObject.set(x, "analysisRule", value.asInstanceOf[js.Any])
  }
}
