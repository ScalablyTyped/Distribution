package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestGridProjectsRequest extends StObject {
  
  /**
    * Return no more than this number of results.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.undefined
  
  /**
    * From a response, used to continue a paginated listing. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListTestGridProjectsRequest {
  
  inline def apply(): ListTestGridProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridProjectsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTestGridProjectsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResult(value: MaxPageSize): Self = StObject.set(x, "maxResult", value.asInstanceOf[js.Any])
    
    inline def setMaxResultUndefined: Self = StObject.set(x, "maxResult", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
