package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodeConfigurationOptionsMessage extends js.Object {
  /**
    * The action type to evaluate for possible node configurations. Specify "restore-cluster" to get configuration combinations based on an existing snapshot. Specify "recommend-node-config" to get configuration recommendations based on an existing cluster or snapshot. 
    */
  var ActionType: typings.awsDashSdk.clientsRedshiftMod.ActionType = js.native
  /**
    * The identifier of the cluster to evaluate for possible node configurations.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * A set of name, operator, and value items to filter the results.
    */
  var Filters: js.UndefOr[NodeConfigurationOptionsFilterList] = js.native
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeNodeConfigurationOptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 500  Constraints: minimum 100, maximum 500.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  var OwnerAccount: js.UndefOr[String] = js.native
  /**
    * The identifier of the snapshot to evaluate for possible node configurations.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.native
}

object DescribeNodeConfigurationOptionsMessage {
  @scala.inline
  def apply(
    ActionType: ActionType,
    ClusterIdentifier: String = null,
    Filters: NodeConfigurationOptionsFilterList = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    OwnerAccount: String = null,
    SnapshotIdentifier: String = null
  ): DescribeNodeConfigurationOptionsMessage = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any])
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (OwnerAccount != null) __obj.updateDynamic("OwnerAccount")(OwnerAccount.asInstanceOf[js.Any])
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeConfigurationOptionsMessage]
  }
}

