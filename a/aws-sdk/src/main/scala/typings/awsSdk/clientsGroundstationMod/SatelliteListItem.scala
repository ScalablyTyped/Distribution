package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SatelliteListItem extends StObject {
  
  /**
    * The current ephemeris being used to compute the trajectory of the satellite.
    */
  var currentEphemeris: js.UndefOr[EphemerisMetaData] = js.undefined
  
  /**
    * A list of ground stations to which the satellite is on-boarded.
    */
  var groundStations: js.UndefOr[GroundStationIdList] = js.undefined
  
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[typings.awsSdk.clientsGroundstationMod.noradSatelliteID] = js.undefined
  
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsSdk.clientsGroundstationMod.satelliteArn] = js.undefined
  
  /**
    * UUID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.undefined
}
object SatelliteListItem {
  
  inline def apply(): SatelliteListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SatelliteListItem]
  }
  
  extension [Self <: SatelliteListItem](x: Self) {
    
    inline def setCurrentEphemeris(value: EphemerisMetaData): Self = StObject.set(x, "currentEphemeris", value.asInstanceOf[js.Any])
    
    inline def setCurrentEphemerisUndefined: Self = StObject.set(x, "currentEphemeris", js.undefined)
    
    inline def setGroundStations(value: GroundStationIdList): Self = StObject.set(x, "groundStations", value.asInstanceOf[js.Any])
    
    inline def setGroundStationsUndefined: Self = StObject.set(x, "groundStations", js.undefined)
    
    inline def setGroundStationsVarargs(value: GroundStationName*): Self = StObject.set(x, "groundStations", js.Array(value*))
    
    inline def setNoradSatelliteID(value: noradSatelliteID): Self = StObject.set(x, "noradSatelliteID", value.asInstanceOf[js.Any])
    
    inline def setNoradSatelliteIDUndefined: Self = StObject.set(x, "noradSatelliteID", js.undefined)
    
    inline def setSatelliteArn(value: satelliteArn): Self = StObject.set(x, "satelliteArn", value.asInstanceOf[js.Any])
    
    inline def setSatelliteArnUndefined: Self = StObject.set(x, "satelliteArn", js.undefined)
    
    inline def setSatelliteId(value: Uuid): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
    
    inline def setSatelliteIdUndefined: Self = StObject.set(x, "satelliteId", js.undefined)
  }
}
