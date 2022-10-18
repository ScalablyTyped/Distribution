package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackListMessage extends StObject {
  
  /**
    * A list of maintenance tracks output by the DescribeClusterTracks operation. 
    */
  var MaintenanceTracks: js.UndefOr[TrackList] = js.undefined
  
  /**
    * The starting point to return a set of response tracklist records. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object TrackListMessage {
  
  inline def apply(): TrackListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackListMessage]
  }
  
  extension [Self <: TrackListMessage](x: Self) {
    
    inline def setMaintenanceTracks(value: TrackList): Self = StObject.set(x, "MaintenanceTracks", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTracksUndefined: Self = StObject.set(x, "MaintenanceTracks", js.undefined)
    
    inline def setMaintenanceTracksVarargs(value: MaintenanceTrack*): Self = StObject.set(x, "MaintenanceTracks", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
