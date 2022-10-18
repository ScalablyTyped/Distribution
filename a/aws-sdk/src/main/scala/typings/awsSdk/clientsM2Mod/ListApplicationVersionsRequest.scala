package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationVersionsRequest extends StObject {
  
  /**
    * The unique identifier of the application.
    */
  var applicationId: Identifier
  
  /**
    * The maximum number of application versions to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A pagination token returned from a previous call to this operation. This specifies the next item to return. To return to the beginning of the list, exclude this parameter.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationVersionsRequest {
  
  inline def apply(applicationId: Identifier): ListApplicationVersionsRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationVersionsRequest]
  }
  
  extension [Self <: ListApplicationVersionsRequest](x: Self) {
    
    inline def setApplicationId(value: Identifier): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
