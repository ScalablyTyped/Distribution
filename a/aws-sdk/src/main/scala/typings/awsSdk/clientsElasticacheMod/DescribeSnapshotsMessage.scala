package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotsMessage extends StObject {
  
  /**
    * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific cluster are described.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 50 Constraints: minimum 20; maximum 50.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that specific replication group are described.
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
    */
  var ShowNodeGroupConfig: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
    */
  var SnapshotName: js.UndefOr[String] = js.undefined
  
  /**
    * If set to system, the output shows snapshots that were automatically created by ElastiCache. If set to user the output shows snapshots that were manually created. If omitted, the output shows both automatically and manually created snapshots.
    */
  var SnapshotSource: js.UndefOr[String] = js.undefined
}
object DescribeSnapshotsMessage {
  
  inline def apply(): DescribeSnapshotsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSnapshotsMessage] (val x: Self) extends AnyVal {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    inline def setShowNodeGroupConfig(value: BooleanOptional): Self = StObject.set(x, "ShowNodeGroupConfig", value.asInstanceOf[js.Any])
    
    inline def setShowNodeGroupConfigUndefined: Self = StObject.set(x, "ShowNodeGroupConfig", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "SnapshotName", js.undefined)
    
    inline def setSnapshotSource(value: String): Self = StObject.set(x, "SnapshotSource", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSourceUndefined: Self = StObject.set(x, "SnapshotSource", js.undefined)
  }
}
