package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReserveContactRequest extends StObject {
  
  /**
    * End time of a contact.
    */
  var endTime: js.Date
  
  /**
    * Name of a ground station.
    */
  var groundStation: String
  
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: MissionProfileArn
  
  /**
    * ARN of a satellite
    */
  var satelliteArn: typings.awsSdk.clientsGroundstationMod.satelliteArn
  
  /**
    * Start time of a contact.
    */
  var startTime: js.Date
  
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object ReserveContactRequest {
  
  inline def apply(
    endTime: js.Date,
    groundStation: String,
    missionProfileArn: MissionProfileArn,
    satelliteArn: satelliteArn,
    startTime: js.Date
  ): ReserveContactRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], groundStation = groundStation.asInstanceOf[js.Any], missionProfileArn = missionProfileArn.asInstanceOf[js.Any], satelliteArn = satelliteArn.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReserveContactRequest]
  }
  
  extension [Self <: ReserveContactRequest](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setGroundStation(value: String): Self = StObject.set(x, "groundStation", value.asInstanceOf[js.Any])
    
    inline def setMissionProfileArn(value: MissionProfileArn): Self = StObject.set(x, "missionProfileArn", value.asInstanceOf[js.Any])
    
    inline def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
