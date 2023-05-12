package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigRulesFilters extends StObject {
  
  /**
    * The mode of an evaluation. The valid values are Detective or Proactive.
    */
  var EvaluationMode: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationMode] = js.undefined
}
object DescribeConfigRulesFilters {
  
  inline def apply(): DescribeConfigRulesFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRulesFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeConfigRulesFilters] (val x: Self) extends AnyVal {
    
    inline def setEvaluationMode(value: EvaluationMode): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "EvaluationMode", js.undefined)
  }
}
