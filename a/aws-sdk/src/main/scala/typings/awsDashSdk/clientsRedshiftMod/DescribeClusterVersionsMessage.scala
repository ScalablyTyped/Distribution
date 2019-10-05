package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterVersionsMessage extends js.Object {
  /**
    * The name of a specific cluster parameter group family to return details for. Constraints:   Must be 1 to 255 alphanumeric characters   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens  
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * The specific cluster version to return. Example: 1.0 
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterVersions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeClusterVersionsMessage {
  @scala.inline
  def apply(
    ClusterParameterGroupFamily: String = null,
    ClusterVersion: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null
  ): DescribeClusterVersionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterParameterGroupFamily != null) __obj.updateDynamic("ClusterParameterGroupFamily")(ClusterParameterGroupFamily)
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterVersionsMessage]
  }
}

