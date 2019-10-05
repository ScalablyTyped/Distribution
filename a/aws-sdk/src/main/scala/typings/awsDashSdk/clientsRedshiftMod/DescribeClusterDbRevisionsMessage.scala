package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterDbRevisionsMessage extends js.Object {
  /**
    * A unique identifier for a cluster whose ClusterDbRevisions you are requesting. This parameter is case sensitive. All clusters defined for an account are returned by default.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * An optional parameter that specifies the starting point for returning a set of response records. When the results of a DescribeClusterDbRevisions request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request.  Constraints: You can specify either the ClusterIdentifier parameter, or the marker parameter, but not both.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in the marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the marker parameter and retrying the request.  Default: 100 Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeClusterDbRevisionsMessage {
  @scala.inline
  def apply(ClusterIdentifier: String = null, Marker: String = null, MaxRecords: Int | scala.Double = null): DescribeClusterDbRevisionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterDbRevisionsMessage]
  }
}

