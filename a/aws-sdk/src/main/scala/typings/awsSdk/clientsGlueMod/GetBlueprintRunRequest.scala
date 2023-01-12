package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintRunRequest extends StObject {
  
  /**
    * The name of the blueprint.
    */
  var BlueprintName: OrchestrationNameString
  
  /**
    * The run ID for the blueprint run you want to retrieve.
    */
  var RunId: IdString
}
object GetBlueprintRunRequest {
  
  inline def apply(BlueprintName: OrchestrationNameString, RunId: IdString): GetBlueprintRunRequest = {
    val __obj = js.Dynamic.literal(BlueprintName = BlueprintName.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlueprintRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBlueprintRunRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueprintName(value: OrchestrationNameString): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
