package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroundStationsRequest extends StObject {
  
  /**
    * Maximum number of ground stations returned.
    */
  var maxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Satellite ID to retrieve on-boarded ground stations.
    */
  var satelliteId: js.UndefOr[Uuid] = js.undefined
}
object ListGroundStationsRequest {
  
  inline def apply(): ListGroundStationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGroundStationsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    inline def setSatelliteIdUndefined: Self = StObject.set(x, "satelliteId", js.undefined)
  }
}
