package typings.awsSdk.anon

import typings.awsSdk.rdsMod.Boolean
import typings.awsSdk.rdsMod.Filter
import typings.awsSdk.rdsMod.FilterList
import typings.awsSdk.rdsMod.IntegerOptional
import typings.awsSdk.rdsMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/rds.DescribeDBClusterSnapshotsMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeDBClusterSnapshot extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The ID of the DB cluster to retrieve the list of DB cluster snapshots for. This parameter can't be used in conjunction with the DBClusterSnapshotIdentifier parameter. This parameter isn't case-sensitive.  Constraints:   If supplied, must match the identifier of an existing DBCluster.  
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A specific DB cluster snapshot identifier to describe. This parameter can't be used in conjunction with the DBClusterIdentifier parameter. This value is stored as a lowercase string.  Constraints:   If supplied, must match the identifier of an existing DBClusterSnapshot.   If this identifier is for an automated snapshot, the SnapshotType parameter must also be specified.  
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
  /**
    * A filter that specifies one or more DB cluster snapshots to describe. Supported filters:    db-cluster-id - Accepts DB cluster identifiers and DB cluster Amazon Resource Names (ARNs).    db-cluster-snapshot-id - Accepts DB cluster snapshot identifiers.    snapshot-type - Accepts types of DB cluster snapshots.    engine - Accepts names of database engines.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * A value that indicates whether to include manual DB cluster snapshots that are public and can be copied or restored by any AWS account. By default, the public snapshots are not included. You can share a manual DB cluster snapshot as public by using the ModifyDBClusterSnapshotAttribute API action.
    */
  var IncludePublic: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether to include shared manual DB cluster snapshots from other AWS accounts that this AWS account has been given permission to copy or restore. By default, these snapshots are not included. You can give an AWS account permission to restore a manual DB cluster snapshot from another AWS account by the ModifyDBClusterSnapshotAttribute API action.
    */
  var IncludeShared: js.UndefOr[Boolean] = js.native
  /**
    * An optional pagination token provided by a previous DescribeDBClusterSnapshots request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The type of DB cluster snapshots to be returned. You can specify one of the following values:    automated - Return all DB cluster snapshots that have been automatically taken by Amazon RDS for my AWS account.    manual - Return all DB cluster snapshots that have been taken by my AWS account.    shared - Return all manual DB cluster snapshots that have been shared to my AWS account.    public - Return all DB cluster snapshots that have been marked as public.   If you don't specify a SnapshotType value, then both automated and manual DB cluster snapshots are returned. You can include shared DB cluster snapshots with these results by enabling the IncludeShared parameter. You can include public DB cluster snapshots with these results by enabling the IncludePublic parameter. The IncludeShared and IncludePublic parameters don't apply for SnapshotType values of manual or automated. The IncludePublic parameter doesn't apply when SnapshotType is set to shared. The IncludeShared parameter doesn't apply when SnapshotType is set to public.
    */
  var SnapshotType: js.UndefOr[String] = js.native
}

object DescribeDBClusterSnapshot {
  @scala.inline
  def apply(): DescribeDBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBClusterSnapshot]
  }
  @scala.inline
  implicit class DescribeDBClusterSnapshotOps[Self <: DescribeDBClusterSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = this.set("DBClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterIdentifier: Self = this.set("DBClusterIdentifier", js.undefined)
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = this.set("DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBClusterSnapshotIdentifier: Self = this.set("DBClusterSnapshotIdentifier", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setIncludePublic(value: Boolean): Self = this.set("IncludePublic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePublic: Self = this.set("IncludePublic", js.undefined)
    @scala.inline
    def setIncludeShared(value: Boolean): Self = this.set("IncludeShared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeShared: Self = this.set("IncludeShared", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setSnapshotType(value: String): Self = this.set("SnapshotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotType: Self = this.set("SnapshotType", js.undefined)
  }
  
}

