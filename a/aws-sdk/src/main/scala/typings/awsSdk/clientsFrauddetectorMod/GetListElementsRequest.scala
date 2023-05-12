package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListElementsRequest extends StObject {
  
  /**
    *  The maximum number of objects to return for the request. 
    */
  var maxResults: js.UndefOr[ListsElementsMaxResults] = js.undefined
  
  /**
    *  The name of the list. 
    */
  var name: noDashIdentifier
  
  /**
    *  The next token for the subsequent request. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.nextToken] = js.undefined
}
object GetListElementsRequest {
  
  inline def apply(name: noDashIdentifier): GetListElementsRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetListElementsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetListElementsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListsElementsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: noDashIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
