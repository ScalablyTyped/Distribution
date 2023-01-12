package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSecurityGroupMessage extends StObject {
  
  /**
    * A list of ClusterSecurityGroup instances. 
    */
  var ClusterSecurityGroups: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClusterSecurityGroups] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ClusterSecurityGroupMessage {
  
  inline def apply(): ClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setClusterSecurityGroups(value: ClusterSecurityGroups): Self = StObject.set(x, "ClusterSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupsUndefined: Self = StObject.set(x, "ClusterSecurityGroups", js.undefined)
    
    inline def setClusterSecurityGroupsVarargs(value: ClusterSecurityGroup*): Self = StObject.set(x, "ClusterSecurityGroups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
