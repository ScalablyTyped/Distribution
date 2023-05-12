package typings.awsSdk.clientsDocdbelasticMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSnapshotInList extends StObject {
  
  /**
    * The arn of the Elastic DocumentDB cluster.
    */
  var clusterArn: String
  
  /**
    * The arn of the Elastic DocumentDB snapshot
    */
  var snapshotArn: String
  
  /**
    * The time when the Elastic DocumentDB snapshot was created in Universal Coordinated Time (UTC).
    */
  var snapshotCreationTime: String
  
  /**
    * The name of the Elastic DocumentDB snapshot.
    */
  var snapshotName: String
  
  /**
    * The status of the Elastic DocumentDB snapshot.
    */
  var status: Status
}
object ClusterSnapshotInList {
  
  inline def apply(
    clusterArn: String,
    snapshotArn: String,
    snapshotCreationTime: String,
    snapshotName: String,
    status: Status
  ): ClusterSnapshotInList = {
    val __obj = js.Dynamic.literal(clusterArn = clusterArn.asInstanceOf[js.Any], snapshotArn = snapshotArn.asInstanceOf[js.Any], snapshotCreationTime = snapshotCreationTime.asInstanceOf[js.Any], snapshotName = snapshotName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterSnapshotInList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterSnapshotInList] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "snapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreationTime(value: String): Self = StObject.set(x, "snapshotCreationTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
