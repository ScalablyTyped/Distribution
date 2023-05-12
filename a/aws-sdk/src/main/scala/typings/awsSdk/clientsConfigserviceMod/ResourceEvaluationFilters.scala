package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceEvaluationFilters extends StObject {
  
  /**
    * Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
    */
  var EvaluationContextIdentifier: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationContextIdentifier] = js.undefined
  
  /**
    * Filters all resource evaluations results based on an evaluation mode. the valid value for this API is Proactive.
    */
  var EvaluationMode: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationMode] = js.undefined
  
  /**
    * Returns a TimeWindow object.
    */
  var TimeWindow: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.TimeWindow] = js.undefined
}
object ResourceEvaluationFilters {
  
  inline def apply(): ResourceEvaluationFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceEvaluationFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceEvaluationFilters] (val x: Self) extends AnyVal {
    
    inline def setEvaluationContextIdentifier(value: EvaluationContextIdentifier): Self = StObject.set(x, "EvaluationContextIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEvaluationContextIdentifierUndefined: Self = StObject.set(x, "EvaluationContextIdentifier", js.undefined)
    
    inline def setEvaluationMode(value: EvaluationMode): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "EvaluationMode", js.undefined)
    
    inline def setTimeWindow(value: TimeWindow): Self = StObject.set(x, "TimeWindow", value.asInstanceOf[js.Any])
    
    inline def setTimeWindowUndefined: Self = StObject.set(x, "TimeWindow", js.undefined)
  }
}
