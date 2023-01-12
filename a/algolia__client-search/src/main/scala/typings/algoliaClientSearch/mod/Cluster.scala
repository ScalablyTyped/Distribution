package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The cluster name
    */
  val clusterName: String
  
  /**
    * Data size taken by all the users assigned to the cluster.
    */
  val dataSize: Double
  
  /**
    * Number of records in the cluster.
    */
  val nbRecords: Double
  
  /**
    * Number of users assign to the cluster.
    */
  val nbUserIDs: Double
}
object Cluster {
  
  inline def apply(clusterName: String, dataSize: Double, nbRecords: Double, nbUserIDs: Double): Cluster = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], nbRecords = nbRecords.asInstanceOf[js.Any], nbUserIDs = nbUserIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
    
    inline def setNbRecords(value: Double): Self = StObject.set(x, "nbRecords", value.asInstanceOf[js.Any])
    
    inline def setNbUserIDs(value: Double): Self = StObject.set(x, "nbUserIDs", value.asInstanceOf[js.Any])
  }
}
