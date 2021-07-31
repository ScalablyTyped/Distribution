package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypesRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat
  
  /**
    * The maximum number of results you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListTypesRequest {
  
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat): ListTypesRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypesRequest]
  }
  
  @scala.inline
  implicit class ListTypesRequestMutableBuilder[Self <: ListTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TypeDefinitionFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
