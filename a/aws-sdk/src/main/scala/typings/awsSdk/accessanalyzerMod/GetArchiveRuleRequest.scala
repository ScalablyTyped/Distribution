package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArchiveRuleRequest extends StObject {
  
  /**
    * The name of the analyzer to retrieve rules from.
    */
  var analyzerName: Name
  
  /**
    * The name of the rule to retrieve.
    */
  var ruleName: Name
}
object GetArchiveRuleRequest {
  
  inline def apply(analyzerName: Name, ruleName: Name): GetArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArchiveRuleRequest]
  }
  
  extension [Self <: GetArchiveRuleRequest](x: Self) {
    
    inline def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: Name): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
