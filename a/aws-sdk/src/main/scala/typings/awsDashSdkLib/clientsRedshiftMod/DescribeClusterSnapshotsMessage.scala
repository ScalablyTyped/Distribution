package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterSnapshotsMessage extends js.Object {
  /**
    * A value that indicates whether to return snapshots only for an existing cluster. You can perform table-level restore only by using a snapshot of an existing cluster, that is, a cluster that has not been deleted. Values for this parameter work as follows:    If ClusterExists is set to true, ClusterIdentifier is required.   If ClusterExists is set to false and ClusterIdentifier isn't specified, all snapshots associated with deleted clusters (orphaned snapshots) are returned.    If ClusterExists is set to false and ClusterIdentifier is specified for a deleted cluster, snapshots associated with that cluster are returned.   If ClusterExists is set to false and ClusterIdentifier is specified for an existing cluster, no snapshots are returned.   
    */
  var ClusterExists: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The identifier of the cluster which generated the requested snapshots.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * A time value that requests only snapshots created at or before the specified time. The time value is specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2012-07-16T18:00:00Z 
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterSnapshots request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The AWS customer account used to create or copy the snapshot. Use this field to filter the results to snapshots owned by a particular account. To describe snapshots you own, either specify your AWS customer account, or do not specify the parameter.
    */
  var OwnerAccount: js.UndefOr[String] = js.undefined
  /**
    * The snapshot identifier of the snapshot about which to return information.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The type of snapshots for which you are requesting information. By default, snapshots of all types are returned. Valid Values: automated | manual 
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var SortingEntities: js.UndefOr[SnapshotSortingEntityList] = js.undefined
  /**
    * A value that requests only snapshots created at or after the specified time. The time value is specified in ISO 8601 format. For more information about ISO 8601, go to the ISO8601 Wikipedia page.  Example: 2012-07-16T18:00:00Z 
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
  /**
    * A tag key or keys for which you want to return all matching cluster snapshots that are associated with the specified key or keys. For example, suppose that you have snapshots that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the snapshots that have either or both of these tag keys associated with them.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.undefined
  /**
    * A tag value or values for which you want to return all matching cluster snapshots that are associated with the specified tag value or values. For example, suppose that you have snapshots that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the snapshots that have either or both of these tag values associated with them.
    */
  var TagValues: js.UndefOr[TagValueList] = js.undefined
}

object DescribeClusterSnapshotsMessage {
  @scala.inline
  def apply(
    ClusterExists: js.UndefOr[BooleanOptional] = js.undefined,
    ClusterIdentifier: String = null,
    EndTime: TStamp = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    OwnerAccount: String = null,
    SnapshotIdentifier: String = null,
    SnapshotType: String = null,
    SortingEntities: SnapshotSortingEntityList = null,
    StartTime: TStamp = null,
    TagKeys: TagKeyList = null,
    TagValues: TagValueList = null
  ): DescribeClusterSnapshotsMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ClusterExists)) __obj.updateDynamic("ClusterExists")(ClusterExists)
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (OwnerAccount != null) __obj.updateDynamic("OwnerAccount")(OwnerAccount)
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier)
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType)
    if (SortingEntities != null) __obj.updateDynamic("SortingEntities")(SortingEntities)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys)
    if (TagValues != null) __obj.updateDynamic("TagValues")(TagValues)
    __obj.asInstanceOf[DescribeClusterSnapshotsMessage]
  }
}

