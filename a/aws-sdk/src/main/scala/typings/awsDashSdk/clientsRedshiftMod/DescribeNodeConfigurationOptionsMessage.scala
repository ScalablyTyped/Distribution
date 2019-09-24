package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNodeConfigurationOptionsMessage extends js.Object {
  /**
    * The action type to evaluate for possible node configurations. Currently, it must be "restore-cluster".
    */
  var ActionType: typings.awsDashSdk.clientsRedshiftMod.ActionType
  /**
    * A set of name, operator, and value items to filter the results.
    */
  var Filters: js.UndefOr[NodeConfigurationOptionsFilterList] = js.undefined
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeNodeConfigurationOptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 500  Constraints: minimum 100, maximum 500.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The AWS customer account used to create or copy the snapshot. Required if you are restoring a snapshot you do not own, optional if you own the snapshot.
    */
  var OwnerAccount: js.UndefOr[String] = js.undefined
  /**
    * The identifier of the snapshot to evaluate for possible node configurations.
    */
  var SnapshotIdentifier: js.UndefOr[String] = js.undefined
}

object DescribeNodeConfigurationOptionsMessage {
  @scala.inline
  def apply(
    ActionType: ActionType,
    Filters: NodeConfigurationOptionsFilterList = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    OwnerAccount: String = null,
    SnapshotIdentifier: String = null
  ): DescribeNodeConfigurationOptionsMessage = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (OwnerAccount != null) __obj.updateDynamic("OwnerAccount")(OwnerAccount)
    if (SnapshotIdentifier != null) __obj.updateDynamic("SnapshotIdentifier")(SnapshotIdentifier)
    __obj.asInstanceOf[DescribeNodeConfigurationOptionsMessage]
  }
}

