package typings.awsDashSdk.clientsWafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafMod.NextMarker] = js.undefined
  var ResourceARN: ResourceArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(
    ResourceARN: ResourceArn,
    Limit: js.UndefOr[PaginationLimit] = js.undefined,
    NextMarker: NextMarker = null
  ): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

