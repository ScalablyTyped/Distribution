package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContainerRecipesResponse extends StObject {
  
  /**
    * The list of container recipes returned for the request.
    */
  var containerRecipeSummaryList: js.UndefOr[ContainerRecipeSummaryList] = js.undefined
  
  /**
    * The next token used for paginated responses. When this field isn't empty, there are additional elements that the service has'ot included in this request. Use this token with the next request to retrieve additional objects.
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object ListContainerRecipesResponse {
  
  inline def apply(): ListContainerRecipesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContainerRecipesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContainerRecipesResponse] (val x: Self) extends AnyVal {
    
    inline def setContainerRecipeSummaryList(value: ContainerRecipeSummaryList): Self = StObject.set(x, "containerRecipeSummaryList", value.asInstanceOf[js.Any])
    
    inline def setContainerRecipeSummaryListUndefined: Self = StObject.set(x, "containerRecipeSummaryList", js.undefined)
    
    inline def setContainerRecipeSummaryListVarargs(value: ContainerRecipeSummary*): Self = StObject.set(x, "containerRecipeSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NonEmptyString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
