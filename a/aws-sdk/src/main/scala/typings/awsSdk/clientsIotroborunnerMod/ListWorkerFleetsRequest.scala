package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkerFleetsRequest extends StObject {
  
  var maxResults: js.UndefOr[ListWorkerFleetsPageSize] = js.undefined
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  var site: SiteGenericIdentifier
}
object ListWorkerFleetsRequest {
  
  inline def apply(site: SiteGenericIdentifier): ListWorkerFleetsRequest = {
    val __obj = js.Dynamic.literal(site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkerFleetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkerFleetsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ListWorkerFleetsPageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSite(value: SiteGenericIdentifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
  }
}
