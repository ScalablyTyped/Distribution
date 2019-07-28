package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResourceTagsResponse extends js.Object {
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request. Do not assume or infer any information from this value.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  /**
    * A list of tags. Each tag consists of a tag key and a tag value.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}

object ListResourceTagsResponse {
  @scala.inline
  def apply(
    NextMarker: MarkerType = null,
    Tags: TagList = null,
    Truncated: js.UndefOr[BooleanType] = js.undefined
  ): ListResourceTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (!js.isUndefined(Truncated)) __obj.updateDynamic("Truncated")(Truncated)
    __obj.asInstanceOf[ListResourceTagsResponse]
  }
}

