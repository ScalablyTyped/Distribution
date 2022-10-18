package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBClusterSnapshotsMessage extends StObject {
  
  /**
    * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in conjunction with the DBClusterSnapshotIdentifier parameter. This parameter isn't case-sensitive. Constraints:   If supplied, must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the DBClusterIdentifier parameter. This value is stored as a lowercase string. Constraints:   If supplied, must match the identifier of an existing DBClusterSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A filter that specifies one or more DB cluster snapshots to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs).    db-cluster-snapshot-id - Accepts DB cluster snapshot identifiers.    snapshot-type - Accepts types of DB cluster snapshots.    engine - Accepts names of database engines.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A value that indicates whether to include manual DB cluster snapshots that are public and can be copied or restored by any Amazon Web Services account. By default, the public snapshots are not included. You can share a manual DB cluster snapshot as public by using the ModifyDBClusterSnapshotAttribute API action.
    */
  var IncludePublic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether to include shared manual DB cluster snapshots from other Amazon Web Services accounts that this Amazon Web Services account has been given permission to copy or restore. By default, these snapshots are not included. You can give an Amazon Web Services account permission to restore a manual DB cluster snapshot from another Amazon Web Services account by the ModifyDBClusterSnapshotAttribute API action.
    */
  var IncludeShared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeDBClusterSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The type of DB cluster snapshots to be returned. You can specify one of the following values:    automated - Return all DB cluster snapshots that have been automatically taken by Amazon RDS for my Amazon Web Services account.    manual - Return all DB cluster snapshots that have been taken by my Amazon Web Services account.    shared - Return all manual DB cluster snapshots that have been shared to my Amazon Web Services account.    public - Return all DB cluster snapshots that have been marked as public.   If you don't specify a SnapshotType value, then both automated and manual DB cluster snapshots are returned. You can include shared DB cluster snapshots with these results by enabling the IncludeShared parameter. You can include public DB cluster snapshots with these results by enabling the IncludePublic parameter. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
}
object DescribeDBClusterSnapshotsMessage {
  
  inline def apply(): DescribeDBClusterSnapshotsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBClusterSnapshotsMessage]
  }
  
  extension [Self <: DescribeDBClusterSnapshotsMessage](x: Self) {
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "DBClusterSnapshotIdentifier", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIncludePublic(value: Boolean): Self = StObject.set(x, "IncludePublic", value.asInstanceOf[js.Any])
    
    inline def setIncludePublicUndefined: Self = StObject.set(x, "IncludePublic", js.undefined)
    
    inline def setIncludeShared(value: Boolean): Self = StObject.set(x, "IncludeShared", value.asInstanceOf[js.Any])
    
    inline def setIncludeSharedUndefined: Self = StObject.set(x, "IncludeShared", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setSnapshotType(value: String): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
  }
}
