package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEphemeridesRequest extends StObject {
  
  /**
    * The end time to list in UTC. The operation will return an ephemeris if its expiration time is within the time range defined by the startTime and endTime.
    */
  var endTime: js.Date
  
  /**
    * Maximum number of ephemerides to return.
    */
  var maxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The AWS Ground Station satellite ID to list ephemeris for.
    */
  var satelliteId: Uuid
  
  /**
    * The start time to list in UTC. The operation will return an ephemeris if its expiration time is within the time range defined by the startTime and endTime.
    */
  var startTime: js.Date
  
  /**
    * The list of ephemeris status to return.
    */
  var statusList: js.UndefOr[EphemerisStatusList] = js.undefined
}
object ListEphemeridesRequest {
  
  inline def apply(endTime: js.Date, satelliteId: Uuid, startTime: js.Date): ListEphemeridesRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], satelliteId = satelliteId.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEphemeridesRequest]
  }
  
  extension [Self <: ListEphemeridesRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatusList(value: EphemerisStatusList): Self = StObject.set(x, "statusList", value.asInstanceOf[js.Any])
    
    inline def setStatusListUndefined: Self = StObject.set(x, "statusList", js.undefined)
    
    inline def setStatusListVarargs(value: EphemerisStatus*): Self = StObject.set(x, "statusList", js.Array(value*))
  }
}
