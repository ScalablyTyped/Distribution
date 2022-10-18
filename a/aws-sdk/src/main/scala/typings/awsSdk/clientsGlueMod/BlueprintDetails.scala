package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlueprintDetails extends StObject {
  
  /**
    * The name of the blueprint.
    */
  var BlueprintName: js.UndefOr[OrchestrationNameString] = js.undefined
  
  /**
    * The run ID for this blueprint.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
}
object BlueprintDetails {
  
  inline def apply(): BlueprintDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlueprintDetails]
  }
  
  extension [Self <: BlueprintDetails](x: Self) {
    
    inline def setBlueprintName(value: OrchestrationNameString): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
    
    inline def setBlueprintNameUndefined: Self = StObject.set(x, "BlueprintName", js.undefined)
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
