package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintRunsRequest extends StObject {
  
  /**
    * The name of the blueprint.
    */
  var BlueprintName: NameString
  
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetBlueprintRunsRequest {
  
  inline def apply(BlueprintName: NameString): GetBlueprintRunsRequest = {
    val __obj = js.Dynamic.literal(BlueprintName = BlueprintName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlueprintRunsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBlueprintRunsRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueprintName(value: NameString): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
