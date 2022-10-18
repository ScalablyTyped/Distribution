package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestGridProjectsResult extends StObject {
  
  /**
    * Used for pagination. Pass into ListTestGridProjects to get more results in a paginated request.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of TestGridProjects, based on a ListTestGridProjectsRequest.
    */
  var testGridProjects: js.UndefOr[TestGridProjects] = js.undefined
}
object ListTestGridProjectsResult {
  
  inline def apply(): ListTestGridProjectsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridProjectsResult]
  }
  
  extension [Self <: ListTestGridProjectsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTestGridProjects(value: TestGridProjects): Self = StObject.set(x, "testGridProjects", value.asInstanceOf[js.Any])
    
    inline def setTestGridProjectsUndefined: Self = StObject.set(x, "testGridProjects", js.undefined)
    
    inline def setTestGridProjectsVarargs(value: TestGridProject*): Self = StObject.set(x, "testGridProjects", js.Array(value*))
  }
}
