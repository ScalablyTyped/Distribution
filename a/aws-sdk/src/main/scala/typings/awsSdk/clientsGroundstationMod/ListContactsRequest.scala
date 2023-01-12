package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactsRequest extends StObject {
  
  /**
    * End time of a contact in UTC.
    */
  var endTime: js.Date
  
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[GroundStationName] = js.undefined
  
  /**
    * Maximum number of contacts returned.
    */
  var maxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  
  /**
    * Next token returned in the request of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.clientsGroundstationMod.satelliteArn] = js.undefined
  
  /**
    * Start time of a contact in UTC.
    */
  var startTime: js.Date
  
  /**
    * Status of a contact reservation.
    */
  var statusList: StatusList
}
object ListContactsRequest {
  
  inline def apply(endTime: js.Date, startTime: js.Date, statusList: StatusList): ListContactsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusList = statusList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContactsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setGroundStation(value: GroundStationName): Self = StObject.set(x, "groundStation", value.asInstanceOf[js.Any])
    
    inline def setGroundStationUndefined: Self = StObject.set(x, "groundStation", js.undefined)
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileArnUndefined: Self = StObject.set(x, "missionProfileArn", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    inline def setSatelliteArnUndefined: Self = StObject.set(x, "satelliteArn", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatusList(value: StatusList): Self = StObject.set(x, "statusList", value.asInstanceOf[js.Any])
    
    inline def setStatusListVarargs(value: ContactStatus*): Self = StObject.set(x, "statusList", js.Array(value*))
  }
}
