package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMLModelOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelId in the request. 
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
}
object CreateMLModelOutput {
  
  inline def apply(): CreateMLModelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMLModelOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMLModelOutput] (val x: Self) extends AnyVal {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
  }
}
