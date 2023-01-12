package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterListEntry extends StObject {
  
  /**
    * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of this cluster. For information about the state of a specific node, see JobListEntry$JobState.
    */
  var ClusterState: js.UndefOr[typings.awsSdk.clientsSnowballMod.ClusterState] = js.undefined
  
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Defines an optional description of the cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.undefined
}
object ClusterListEntry {
  
  inline def apply(): ClusterListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterListEntry] (val x: Self) extends AnyVal {
    
    inline def setClusterId(value: String): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setClusterState(value: ClusterState): Self = StObject.set(x, "ClusterState", value.asInstanceOf[js.Any])
    
    inline def setClusterStateUndefined: Self = StObject.set(x, "ClusterState", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
