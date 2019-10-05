package typings.awsDashSdk.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafregionalMod.NextMarker] = js.undefined
  var ResourceARN: ResourceArn
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(ResourceARN: ResourceArn, Limit: Int | Double = null, NextMarker: NextMarker = null): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

