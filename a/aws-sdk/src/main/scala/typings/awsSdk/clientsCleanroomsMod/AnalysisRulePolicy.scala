package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisRulePolicy extends StObject {
  
  /**
    * Controls on the query specifications that can be run on configured table..
    */
  var v1: js.UndefOr[AnalysisRulePolicyV1] = js.undefined
}
object AnalysisRulePolicy {
  
  inline def apply(): AnalysisRulePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisRulePolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisRulePolicy] (val x: Self) extends AnyVal {
    
    inline def setV1(value: AnalysisRulePolicyV1): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
    
    inline def setV1Undefined: Self = StObject.set(x, "v1", js.undefined)
  }
}
