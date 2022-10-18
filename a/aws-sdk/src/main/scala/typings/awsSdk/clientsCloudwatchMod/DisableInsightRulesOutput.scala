package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableInsightRulesOutput extends StObject {
  
  /**
    * An array listing the rules that could not be disabled. You cannot disable built-in rules.
    */
  var Failures: js.UndefOr[BatchFailures] = js.undefined
}
object DisableInsightRulesOutput {
  
  inline def apply(): DisableInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableInsightRulesOutput]
  }
  
  extension [Self <: DisableInsightRulesOutput](x: Self) {
    
    inline def setFailures(value: BatchFailures): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: PartialFailure*): Self = StObject.set(x, "Failures", js.Array(value*))
  }
}
