package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSubnetGroupMessage extends StObject {
  
  /**
    * A list of ClusterSubnetGroup instances. 
    */
  var ClusterSubnetGroups: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClusterSubnetGroups] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ClusterSubnetGroupMessage {
  
  inline def apply(): ClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSubnetGroupMessage]
  }
  
  extension [Self <: ClusterSubnetGroupMessage](x: Self) {
    
    inline def setClusterSubnetGroups(value: ClusterSubnetGroups): Self = StObject.set(x, "ClusterSubnetGroups", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupsUndefined: Self = StObject.set(x, "ClusterSubnetGroups", js.undefined)
    
    inline def setClusterSubnetGroupsVarargs(value: ClusterSubnetGroup*): Self = StObject.set(x, "ClusterSubnetGroups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
