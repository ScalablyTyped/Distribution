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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartBlueprintRunResponse] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
  }
}
