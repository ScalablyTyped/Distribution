package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterMessage extends StObject {
  
  /**
    * The identifier of the cluster to be deleted. Constraints:   Must contain lowercase characters.   Must contain from 1 to 63 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var ClusterIdentifier: String
  
  /**
    * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this parameter is provided, SkipFinalClusterSnapshot must be false.  Constraints:   Must be 1 to 255 alphanumeric characters.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.  
    */
  var FinalClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely. The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var FinalClusterSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If true, a final cluster snapshot is not created. If false, a final cluster snapshot is created before the cluster is deleted.   The FinalClusterSnapshotIdentifier parameter must be specified if SkipFinalClusterSnapshot is false.  Default: false 
    */
  var SkipFinalClusterSnapshot: js.UndefOr[Boolean] = js.undefined
}
object DeleteClusterMessage {
  
  inline def apply(ClusterIdentifier: String): DeleteClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClusterMessage] (val x: Self) extends AnyVal {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFinalClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "FinalClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setFinalClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "FinalClusterSnapshotIdentifier", js.undefined)
    
    inline def setFinalClusterSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "FinalClusterSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setFinalClusterSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "FinalClusterSnapshotRetentionPeriod", js.undefined)
    
    inline def setSkipFinalClusterSnapshot(value: Boolean): Self = StObject.set(x, "SkipFinalClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setSkipFinalClusterSnapshotUndefined: Self = StObject.set(x, "SkipFinalClusterSnapshot", js.undefined)
  }
}
