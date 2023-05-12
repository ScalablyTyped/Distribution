package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfiguredTableAnalysisRulePolicy extends StObject {
  
  /**
    * Controls on the query specifications that can be run on a configured table.
    */
  var v1: js.UndefOr[ConfiguredTableAnalysisRulePolicyV1] = js.undefined
}
object ConfiguredTableAnalysisRulePolicy {
  
  inline def apply(): ConfiguredTableAnalysisRulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfiguredTableAnalysisRulePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfiguredTableAnalysisRulePolicy] (val x: Self) extends AnyVal {
    
    inline def setV1(value: ConfiguredTableAnalysisRulePolicyV1): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
    
    inline def setV1Undefined: Self = StObject.set(x, "v1", js.undefined)
  }
}
