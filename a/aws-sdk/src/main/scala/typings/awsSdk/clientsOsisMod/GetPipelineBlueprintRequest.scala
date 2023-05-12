package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineBlueprintRequest extends StObject {
  
  /**
    * The name of the blueprint to retrieve.
    */
  var BlueprintName: String
}
object GetPipelineBlueprintRequest {
  
  inline def apply(BlueprintName: String): GetPipelineBlueprintRequest = {
    val __obj = js.Dynamic.literal(BlueprintName = BlueprintName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineBlueprintRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineBlueprintRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueprintName(value: String): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
  }
}
