package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWorkersRequest extends StObject {
  
  var fleet: js.UndefOr[WorkerFleetGenericIdentifier] = js.undefined
  
  var maxResults: js.UndefOr[ListWorkersPageSize] = js.undefined
  
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  var site: SiteGenericIdentifier
}
object ListWorkersRequest {
  
  inline def apply(site: SiteGenericIdentifier): ListWorkersRequest = {
    val __obj = js.Dynamic.literal(site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWorkersRequest] (val x: Self) extends AnyVal {
    
    inline def setFleet(value: WorkerFleetGenericIdentifier): Self = StObject.set(x, "fleet", value.asInstanceOf[js.Any])
    
    inline def setFleetUndefined: Self = StObject.set(x, "fleet", js.undefined)
    
    inline def setMaxResults(value: ListWorkersPageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSite(value: SiteGenericIdentifier): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
  }
}
