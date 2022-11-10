package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGroundStationsResponse extends StObject {
  
  /**
    * List of ground stations.
    */
  var groundStationList: js.UndefOr[GroundStationList] = js.undefined
  
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListGroundStationsResponse {
  
  inline def apply(): ListGroundStationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroundStationsResponse]
  }
  
  extension [Self <: ListGroundStationsResponse](x: Self) {
    
    inline def setGroundStationList(value: GroundStationList): Self = StObject.set(x, "groundStationList", value.asInstanceOf[js.Any])
    
    inline def setGroundStationListUndefined: Self = StObject.set(x, "groundStationList", js.undefined)
    
    inline def setGroundStationListVarargs(value: GroundStationData*): Self = StObject.set(x, "groundStationList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
