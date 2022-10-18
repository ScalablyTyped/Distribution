package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMLModelOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelID in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
}
object DeleteMLModelOutput {
  
  inline def apply(): DeleteMLModelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMLModelOutput]
  }
  
  extension [Self <: DeleteMLModelOutput](x: Self) {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
  }
}
