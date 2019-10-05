package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceInput extends js.Object {
  /**
    * Specifies that the list of tags returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin returning the list of tags.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the resource for which you want to list tags.
    */
  var ResourceARN: typings.awsDashSdk.clientsStoragegatewayMod.ResourceARN
}

object ListTagsForResourceInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN, Limit: Int | Double = null, Marker: Marker = null): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
}

