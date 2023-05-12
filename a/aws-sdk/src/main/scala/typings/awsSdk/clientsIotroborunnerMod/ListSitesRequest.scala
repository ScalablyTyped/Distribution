package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSitesRequest extends StObject {
  
  var maxResults: js.UndefOr[ListSitesPageSize] = js.undefined
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSitesRequest {
  
  inline def apply(): ListSitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSitesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListSitesPageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
