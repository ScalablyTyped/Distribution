package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceChangeDetail extends StObject {
  
  /**
    * The ID of the entity that caused the change.
    */
  var CausingEntity: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.CausingEntity] = js.undefined
  
  /**
    * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic evaluations, the value might change, and any new value will be determined when the plan is updated.
    */
  var Evaluation: js.UndefOr[EvaluationType] = js.undefined
  
  /**
    * Information about the resource attribute to be modified.
    */
  var Target: js.UndefOr[ResourceTargetDefinition] = js.undefined
}
object ResourceChangeDetail {
  
  inline def apply(): ResourceChangeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceChangeDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceChangeDetail] (val x: Self) extends AnyVal {
    
    inline def setCausingEntity(value: CausingEntity): Self = StObject.set(x, "CausingEntity", value.asInstanceOf[js.Any])
    
    inline def setCausingEntityUndefined: Self = StObject.set(x, "CausingEntity", js.undefined)
    
    inline def setEvaluation(value: EvaluationType): Self = StObject.set(x, "Evaluation", value.asInstanceOf[js.Any])
    
    inline def setEvaluationUndefined: Self = StObject.set(x, "Evaluation", js.undefined)
    
    inline def setTarget(value: ResourceTargetDefinition): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
