package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterVersionsMessage extends StObject {
  
  /**
    * A list of Version elements. 
    */
  var ClusterVersions: js.UndefOr[ClusterVersionList] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ClusterVersionsMessage {
  
  inline def apply(): ClusterVersionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterVersionsMessage]
  }
  
  extension [Self <: ClusterVersionsMessage](x: Self) {
    
    inline def setClusterVersions(value: ClusterVersionList): Self = StObject.set(x, "ClusterVersions", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionsUndefined: Self = StObject.set(x, "ClusterVersions", js.undefined)
    
    inline def setClusterVersionsVarargs(value: ClusterVersion*): Self = StObject.set(x, "ClusterVersions", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
