package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster extends StObject {
  
  /**
    * The cluster name
    */
  val clusterName: String = js.native
  
  /**
    * Data size taken by all the users assigned to the cluster.
    */
  val dataSize: Double = js.native
  
  /**
    * Number of records in the cluster.
    */
  val nbRecords: Double = js.native
  
  /**
    * Number of users assign to the cluster.
    */
  val nbUserIDs: Double = js.native
}
object Cluster {
  
  @scala.inline
  def apply(clusterName: String, dataSize: Double, nbRecords: Double, nbUserIDs: Double): Cluster = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], nbRecords = nbRecords.asInstanceOf[js.Any], nbUserIDs = nbUserIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit class ClusterMutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbRecords(value: Double): Self = StObject.set(x, "nbRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbUserIDs(value: Double): Self = StObject.set(x, "nbUserIDs", value.asInstanceOf[js.Any])
  }
}
