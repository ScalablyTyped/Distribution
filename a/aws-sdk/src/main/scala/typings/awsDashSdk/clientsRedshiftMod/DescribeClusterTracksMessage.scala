package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterTracksMessage extends js.Object {
  /**
    * The name of the maintenance track. 
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterTracks request exceed the value specified in MaxRecords, Amazon Redshift returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * An integer value for the maximum number of maintenance tracks to return.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
}

object DescribeClusterTracksMessage {
  @scala.inline
  def apply(
    MaintenanceTrackName: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  ): DescribeClusterTracksMessage = {
    val __obj = js.Dynamic.literal()
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    __obj.asInstanceOf[DescribeClusterTracksMessage]
  }
}

