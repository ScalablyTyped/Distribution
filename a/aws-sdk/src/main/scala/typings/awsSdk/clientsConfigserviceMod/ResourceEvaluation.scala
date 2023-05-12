package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceEvaluation extends StObject {
  
  /**
    * The mode of an evaluation. The valid values are Detective or Proactive.
    */
  var EvaluationMode: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.EvaluationMode] = js.undefined
  
  /**
    * The starting time of an execution.
    */
  var EvaluationStartTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ResourceEvaluationId of a evaluation.
    */
  var ResourceEvaluationId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceEvaluationId] = js.undefined
}
object ResourceEvaluation {
  
  inline def apply(): ResourceEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceEvaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceEvaluation] (val x: Self) extends AnyVal {
    
    inline def setEvaluationMode(value: EvaluationMode): Self = StObject.set(x, "EvaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "EvaluationMode", js.undefined)
    
    inline def setEvaluationStartTimestamp(value: js.Date): Self = StObject.set(x, "EvaluationStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEvaluationStartTimestampUndefined: Self = StObject.set(x, "EvaluationStartTimestamp", js.undefined)
    
    inline def setResourceEvaluationId(value: ResourceEvaluationId): Self = StObject.set(x, "ResourceEvaluationId", value.asInstanceOf[js.Any])
    
    inline def setResourceEvaluationIdUndefined: Self = StObject.set(x, "ResourceEvaluationId", js.undefined)
  }
}
