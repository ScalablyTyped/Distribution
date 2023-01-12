package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetScreenDataRequest extends StObject {
  
  /**
    * The ID of the app that contains the screen.
    */
  var appId: ResourceId
  
  /**
    *  The number of results to be returned on a single page. Specify a number between 1 and 100. The maximum value is 100.   This parameter is optional. If you don't specify this parameter, the default page size is 100. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    *  This parameter is optional. If a nextToken is not specified, the API returns the first page of data.   Pagination tokens expire after 1 hour. If you use a token that was returned more than an hour back, the API will throw ValidationException. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the screen.
    */
  var screenId: ResourceId
  
  /**
    *  Variables are optional and are needed only if the screen requires them to render correctly. Variables are specified as a map where the key is the name of the variable as defined on the screen. The value is an object which currently has only one property, rawValue, which holds the value of the variable to be passed to the screen. 
    */
  var variables: js.UndefOr[VariableValueMap] = js.undefined
  
  /**
    * The ID of the workbook that contains the screen.
    */
  var workbookId: ResourceId
}
object GetScreenDataRequest {
  
  inline def apply(appId: ResourceId, screenId: ResourceId, workbookId: ResourceId): GetScreenDataRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], screenId = screenId.asInstanceOf[js.Any], workbookId = workbookId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetScreenDataRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: ResourceId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setScreenId(value: ResourceId): Self = StObject.set(x, "screenId", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: VariableValueMap): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setWorkbookId(value: ResourceId): Self = StObject.set(x, "workbookId", value.asInstanceOf[js.Any])
  }
}
