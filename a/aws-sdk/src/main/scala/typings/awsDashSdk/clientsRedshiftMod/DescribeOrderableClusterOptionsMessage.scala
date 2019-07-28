package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeOrderableClusterOptionsMessage extends js.Object {
  /**
    * The version filter value. Specify this parameter to show only the available offerings matching the specified version. Default: All versions. Constraints: Must be one of the version returned from DescribeClusterVersions.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeOrderableClusterOptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The node type filter value. Specify this parameter to show only the available offerings matching the specified node type.
    */
  var NodeType: js.UndefOr[String] = js.undefined
}

object DescribeOrderableClusterOptionsMessage {
  @scala.inline
  def apply(
    ClusterVersion: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    NodeType: String = null
  ): DescribeOrderableClusterOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    __obj.asInstanceOf[DescribeOrderableClusterOptionsMessage]
  }
}

