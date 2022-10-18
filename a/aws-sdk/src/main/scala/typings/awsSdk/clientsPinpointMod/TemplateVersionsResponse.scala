package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateVersionsResponse extends StObject {
  
  /**
    * An array of responses, one for each version of the message template.
    */
  var Item: ListOfTemplateVersionResponse
  
  /**
    * The message that's returned from the API for the request to retrieve information about all the versions of the message template.
    */
  var Message: js.UndefOr[string] = js.undefined
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the request to retrieve information about all the versions of the message template.
    */
  var RequestID: js.UndefOr[string] = js.undefined
}
object TemplateVersionsResponse {
  
  inline def apply(Item: ListOfTemplateVersionResponse): TemplateVersionsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateVersionsResponse]
  }
  
  extension [Self <: TemplateVersionsResponse](x: Self) {
    
    inline def setItem(value: ListOfTemplateVersionResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: TemplateVersionResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRequestID(value: string): Self = StObject.set(x, "RequestID", value.asInstanceOf[js.Any])
    
    inline def setRequestIDUndefined: Self = StObject.set(x, "RequestID", js.undefined)
  }
}
