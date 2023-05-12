package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreClusterFromSnapshotOutput extends StObject {
  
  /**
    * Returns information about a the restored Elastic DocumentDB cluster.
    */
  var cluster: Cluster
}
object RestoreClusterFromSnapshotOutput {
  
  inline def apply(cluster: Cluster): RestoreClusterFromSnapshotOutput = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreClusterFromSnapshotOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreClusterFromSnapshotOutput] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
  }
}
