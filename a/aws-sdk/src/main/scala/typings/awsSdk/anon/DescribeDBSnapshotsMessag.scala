package typings.awsSdk.anon

import typings.awsSdk.clientsRdsMod.Boolean
import typings.awsSdk.clientsRdsMod.Filter
import typings.awsSdk.clientsRdsMod.FilterList
import typings.awsSdk.clientsRdsMod.IntegerOptional
import typings.awsSdk.clientsRdsMod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/rds.DescribeDBSnapshotsMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeDBSnapshotsMessag extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The ID of the DB instance to retrieve the list of DB snapshots for. This parameter isn't case-sensitive. Constraints:   If supplied, must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A specific DB snapshot identifier to describe. This value is stored as a lowercase string. Constraints:   If supplied, must match the identifier of an existing DBSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A specific DB resource ID to describe.
    */
  var DbiResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * A filter that specifies one or more DB snapshots to describe. Supported filters:    db-instance-id - Accepts DB instance identifiers and DB instance Amazon Resource Names (ARNs).    db-snapshot-id - Accepts DB snapshot identifiers.    dbi-resource-id - Accepts identifiers of source DB instances.    snapshot-type - Accepts types of DB snapshots.    engine - Accepts names of database engines.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A value that indicates whether to include manual DB cluster snapshots that are public and can be copied or restored by any Amazon Web Services account. By default, the public snapshots are not included. You can share a manual DB snapshot as public by using the ModifyDBSnapshotAttribute API. This setting doesn't apply to RDS Custom.
    */
  var IncludePublic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether to include shared manual DB cluster snapshots from other Amazon Web Services accounts that this Amazon Web Services account has been given permission to copy or restore. By default, these snapshots are not included. You can give an Amazon Web Services account permission to restore a manual DB snapshot from another Amazon Web Services account by using the ModifyDBSnapshotAttribute API action. This setting doesn't apply to RDS Custom.
    */
  var IncludeShared: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeDBSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The type of snapshots to be returned. You can specify one of the following values:    automated - Return all DB snapshots that have been automatically taken by Amazon RDS for my Amazon Web Services account.    manual - Return all DB snapshots that have been taken by my Amazon Web Services account.    shared - Return all manual DB snapshots that have been shared to my Amazon Web Services account.    public - Return all DB snapshots that have been marked as public.    awsbackup - Return the DB snapshots managed by the Amazon Web Services Backup service. For information about Amazon Web Services Backup, see the  Amazon Web Services Backup Developer Guide.   The awsbackup type does not apply to Aurora.   If you don't specify a SnapshotType value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not included in the returned results by default. You can include shared snapshots with these results by enabling the IncludeShared parameter. You can include public snapshots with these results by enabling the IncludePublic parameter. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
}
object DescribeDBSnapshotsMessag {
  
  inline def apply(): DescribeDBSnapshotsMessag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBSnapshotsMessag]
  }
  
  extension [Self <: DescribeDBSnapshotsMessag](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotIdentifierUndefined: Self = StObject.set(x, "DBSnapshotIdentifier", js.undefined)
    
    inline def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
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
