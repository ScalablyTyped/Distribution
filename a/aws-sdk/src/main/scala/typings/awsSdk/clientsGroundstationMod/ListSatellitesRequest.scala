package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSatellitesRequest extends StObject {
  
  /**
    * Maximum number of satellites returned.
    */
  var maxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSatellitesRequest {
  
  inline def apply(): ListSatellitesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSatellitesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSatellitesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
