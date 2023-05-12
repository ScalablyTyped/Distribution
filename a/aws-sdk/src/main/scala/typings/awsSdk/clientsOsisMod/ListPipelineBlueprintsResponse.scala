package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelineBlueprintsResponse extends StObject {
  
  /**
    * A list of available blueprints for Data Prepper.
    */
  var Blueprints: js.UndefOr[PipelineBlueprintsSummaryList] = js.undefined
}
object ListPipelineBlueprintsResponse {
  
  inline def apply(): ListPipelineBlueprintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelineBlueprintsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPipelineBlueprintsResponse] (val x: Self) extends AnyVal {
    
    inline def setBlueprints(value: PipelineBlueprintsSummaryList): Self = StObject.set(x, "Blueprints", value.asInstanceOf[js.Any])
    
    inline def setBlueprintsUndefined: Self = StObject.set(x, "Blueprints", js.undefined)
    
    inline def setBlueprintsVarargs(value: PipelineBlueprintSummary*): Self = StObject.set(x, "Blueprints", js.Array(value*))
  }
}
