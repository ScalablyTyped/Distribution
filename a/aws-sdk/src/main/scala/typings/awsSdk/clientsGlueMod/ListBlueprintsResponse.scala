package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBlueprintsResponse extends StObject {
  
  /**
    * List of names of blueprints in the account.
    */
  var Blueprints: js.UndefOr[BlueprintNames] = js.undefined
  
  /**
    * A continuation token, if not all blueprint names have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListBlueprintsResponse {
  
  inline def apply(): ListBlueprintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBlueprintsResponse]
  }
  
  extension [Self <: ListBlueprintsResponse](x: Self) {
    
    inline def setBlueprints(value: BlueprintNames): Self = StObject.set(x, "Blueprints", value.asInstanceOf[js.Any])
    
    inline def setBlueprintsUndefined: Self = StObject.set(x, "Blueprints", js.undefined)
    
    inline def setBlueprintsVarargs(value: OrchestrationNameString*): Self = StObject.set(x, "Blueprints", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
