package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackListMessage extends js.Object {
  /**
    * A list of maintenance tracks output by the DescribeClusterTracks operation. 
    */
  var MaintenanceTracks: js.UndefOr[TrackList] = js.undefined
  /**
    * The starting point to return a set of response tracklist records. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object TrackListMessage {
  @scala.inline
  def apply(MaintenanceTracks: TrackList = null, Marker: String = null): TrackListMessage = {
    val __obj = js.Dynamic.literal()
    if (MaintenanceTracks != null) __obj.updateDynamic("MaintenanceTracks")(MaintenanceTracks)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[TrackListMessage]
  }
}

