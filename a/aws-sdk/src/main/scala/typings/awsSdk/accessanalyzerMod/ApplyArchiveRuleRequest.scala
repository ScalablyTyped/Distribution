package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyArchiveRuleRequest extends StObject {
  
  /**
    * The Amazon resource name (ARN) of the analyzer.
    */
  var analyzerArn: AnalyzerArn = js.native
  
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the rule to apply.
    */
  var ruleName: Name = js.native
}
object ApplyArchiveRuleRequest {
  
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, ruleName: Name): ApplyArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyArchiveRuleRequest]
  }
  
  @scala.inline
  implicit class ApplyArchiveRuleRequestMutableBuilder[Self <: ApplyArchiveRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setRuleName(value: Name): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
  }
}
