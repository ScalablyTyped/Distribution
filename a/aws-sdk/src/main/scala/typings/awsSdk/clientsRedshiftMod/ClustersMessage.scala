package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClustersMessage extends StObject {
  
  /**
    * A list of Cluster objects, where each object describes one cluster. 
    */
  var Clusters: js.UndefOr[ClusterList] = js.undefined
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ClustersMessage {
  
  inline def apply(): ClustersMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClustersMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClustersMessage] (val x: Self) extends AnyVal {
    
    inline def setClusters(value: ClusterList): Self = StObject.set(x, "Clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "Clusters", js.undefined)
    
    inline def setClustersVarargs(value: Cluster*): Self = StObject.set(x, "Clusters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
