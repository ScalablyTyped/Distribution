package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTableRestoreStatusMessage extends js.Object {
  /**
    * The Amazon Redshift cluster that the table is being restored to.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * An optional pagination token provided by a previous DescribeTableRestoreStatus request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by the MaxRecords parameter.
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The identifier of the table restore request to return status for. If you don't specify a TableRestoreRequestId value, then DescribeTableRestoreStatus returns the status of all in-progress table restore requests.
    */
  var TableRestoreRequestId: js.UndefOr[String] = js.undefined
}

object DescribeTableRestoreStatusMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String = null,
    Marker: String = null,
    MaxRecords: Int | scala.Double = null,
    TableRestoreRequestId: String = null
  ): DescribeTableRestoreStatusMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (TableRestoreRequestId != null) __obj.updateDynamic("TableRestoreRequestId")(TableRestoreRequestId)
    __obj.asInstanceOf[DescribeTableRestoreStatusMessage]
  }
}

