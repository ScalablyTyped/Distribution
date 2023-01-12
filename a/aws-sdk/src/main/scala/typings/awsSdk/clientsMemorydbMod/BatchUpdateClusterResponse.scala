package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateClusterResponse extends StObject {
  
  /**
    * The list of clusters that have been updated.
    */
  var ProcessedClusters: js.UndefOr[ClusterList] = js.undefined
  
  /**
    * The list of clusters where updates have not been applied.
    */
  var UnprocessedClusters: js.UndefOr[UnprocessedClusterList] = js.undefined
}
object BatchUpdateClusterResponse {
  
  inline def apply(): BatchUpdateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateClusterResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateClusterResponse] (val x: Self) extends AnyVal {
    
    inline def setProcessedClusters(value: ClusterList): Self = StObject.set(x, "ProcessedClusters", value.asInstanceOf[js.Any])
    
    inline def setProcessedClustersUndefined: Self = StObject.set(x, "ProcessedClusters", js.undefined)
    
    inline def setProcessedClustersVarargs(value: Cluster*): Self = StObject.set(x, "ProcessedClusters", js.Array(value*))
    
    inline def setUnprocessedClusters(value: UnprocessedClusterList): Self = StObject.set(x, "UnprocessedClusters", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedClustersUndefined: Self = StObject.set(x, "UnprocessedClusters", js.undefined)
    
    inline def setUnprocessedClustersVarargs(value: UnprocessedCluster*): Self = StObject.set(x, "UnprocessedClusters", js.Array(value*))
  }
}
