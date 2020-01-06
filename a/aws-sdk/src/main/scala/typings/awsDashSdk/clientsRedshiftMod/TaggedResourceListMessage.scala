package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaggedResourceListMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of tags with their associated resources.
    */
  var TaggedResources: js.UndefOr[TaggedResourceList] = js.native
}

object TaggedResourceListMessage {
  @scala.inline
  def apply(Marker: String = null, TaggedResources: TaggedResourceList = null): TaggedResourceListMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (TaggedResources != null) __obj.updateDynamic("TaggedResources")(TaggedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaggedResourceListMessage]
  }
}

