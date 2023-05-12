package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisRulePolicyV1 extends StObject {
  
  /**
    * Analysis rule type that enables only aggregation queries on a configured table.
    */
  var aggregation: js.UndefOr[AnalysisRuleAggregation] = js.undefined
  
  /**
    * Analysis rule type that enables only list queries on a configured table.
    */
  var list: js.UndefOr[AnalysisRuleList] = js.undefined
}
object AnalysisRulePolicyV1 {
  
  inline def apply(): AnalysisRulePolicyV1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisRulePolicyV1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnalysisRulePolicyV1] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: AnalysisRuleAggregation): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setList(value: AnalysisRuleList): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
  }
}
