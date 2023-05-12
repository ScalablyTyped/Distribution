package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDestinationsRequest extends StObject {
  
  var maxResults: js.UndefOr[PageSize] = js.undefined
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  var site: SiteGenericIdentifier
  
  var state: js.UndefOr[DestinationState] = js.undefined
}
object ListDestinationsRequest {
  
  inline def apply(site: SiteGenericIdentifier): ListDestinationsRequest = {
    val __obj = js.Dynamic.literal(site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDestinationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDestinationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSite(value: SiteGenericIdentifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setState(value: DestinationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
