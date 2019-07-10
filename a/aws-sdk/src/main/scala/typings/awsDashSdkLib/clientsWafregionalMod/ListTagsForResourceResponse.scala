package typings
package awsDashSdkLib.clientsWafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  var NextMarker: js.UndefOr[NextMarker] = js.undefined
  var TagInfoForResource: js.UndefOr[TagInfoForResource] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, TagInfoForResource: TagInfoForResource = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (TagInfoForResource != null) __obj.updateDynamic("TagInfoForResource")(TagInfoForResource)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

