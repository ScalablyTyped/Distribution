package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBlueprintRunResponse extends StObject {
  
  /**
    * The run ID for this blueprint run.
    */
  var RunId: js.UndefOr[IdString] = js.undefined
}
object StartBlueprintRunResponse {
  
  inline def apply(): StartBlueprintRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBlueprintRunResponse]
  }
  
  extension [Self <: StartBlueprintRunResponse](x: Self) {
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
