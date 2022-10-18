package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSnapshotMessage extends StObject {
  
  /**
    * The cluster identifier for which you want a snapshot.
    */
  var ClusterIdentifier: String
  
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A unique identifier for the snapshot that you are requesting. This identifier must be unique for all snapshots within the Amazon Web Services account. Constraints:   Cannot be null, empty, or blank   Must contain from 1 to 255 alphanumeric characters or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var SnapshotIdentifier: String
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateClusterSnapshotMessage {
  
  inline def apply(ClusterIdentifier: String, SnapshotIdentifier: String): CreateClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSnapshotMessage]
  }
  
  extension [Self <: CreateClusterSnapshotMessage](x: Self) {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    inline def setSnapshotIdentifier(value: String): Self = StObject.set(x, "SnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
