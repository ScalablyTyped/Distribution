package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintRunResponse extends StObject {
  
  /**
    * Returns a BlueprintRun object.
    */
  var BlueprintRun: js.UndefOr[typings.awsSdk.clientsGlueMod.BlueprintRun] = js.undefined
}
object GetBlueprintRunResponse {
  
  inline def apply(): GetBlueprintRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlueprintRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBlueprintRunResponse] (val x: Self) extends AnyVal {
    
    inline def setBlueprintRun(value: BlueprintRun): Self = StObject.set(x, "BlueprintRun", value.asInstanceOf[js.Any])
    
    inline def setBlueprintRunUndefined: Self = StObject.set(x, "BlueprintRun", js.undefined)
  }
}
