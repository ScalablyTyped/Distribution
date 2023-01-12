package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelMetadataRequest extends StObject {
  
  /**
    * The maximum number of models to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * If the response to a previous ListModelMetadataResponse request was truncated, the response includes a NextToken. To retrieve the next set of model metadata, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * One or more filters that searches for the specified resource or resources in a search. All resource objects that satisfy the expression's condition are included in the search results. Specify the Framework, FrameworkVersion, Domain or Task to filter supported. Filter names and values are case-sensitive.
    */
  var SearchExpression: js.UndefOr[ModelMetadataSearchExpression] = js.undefined
}
object ListModelMetadataRequest {
  
  inline def apply(): ListModelMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSearchExpression(value: ModelMetadataSearchExpression): Self = StObject.set(x, "SearchExpression", value.asInstanceOf[js.Any])
    
    inline def setSearchExpressionUndefined: Self = StObject.set(x, "SearchExpression", js.undefined)
  }
}
