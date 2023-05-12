package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineBlueprintResponse extends StObject {
  
  /**
    * The requested blueprint in YAML format.
    */
  var Blueprint: js.UndefOr[PipelineBlueprint] = js.undefined
}
object GetPipelineBlueprintResponse {
  
  inline def apply(): GetPipelineBlueprintResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineBlueprintResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineBlueprintResponse] (val x: Self) extends AnyVal {
    
    inline def setBlueprint(value: PipelineBlueprint): Self = StObject.set(x, "Blueprint", value.asInstanceOf[js.Any])
    
    inline def setBlueprintUndefined: Self = StObject.set(x, "Blueprint", js.undefined)
  }
}
