package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMLModelOutput extends StObject {
  
  /**
    * The ID assigned to the MLModel during creation. This value should be identical to the value of the MLModelID in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
}
object UpdateMLModelOutput {
  
  inline def apply(): UpdateMLModelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMLModelOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateMLModelOutput] (val x: Self) extends AnyVal {
    
    inline def setMLModelId(value: EntityId): Self = StObject.set(x, "MLModelId", value.asInstanceOf[js.Any])
    
    inline def setMLModelIdUndefined: Self = StObject.set(x, "MLModelId", js.undefined)
  }
}
