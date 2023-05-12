package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetListsMetadataRequest extends StObject {
  
  /**
    *  The maximum number of objects to return for the request. 
    */
  var maxResults: js.UndefOr[ListsMetadataMaxResults] = js.undefined
  
  /**
    *  The name of the list. 
    */
  var name: js.UndefOr[noDashIdentifier] = js.undefined
  
  /**
    *  The next token for the subsequent request. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.nextToken] = js.undefined
}
object GetListsMetadataRequest {
  
  inline def apply(): GetListsMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetListsMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetListsMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListsMetadataMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: noDashIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
