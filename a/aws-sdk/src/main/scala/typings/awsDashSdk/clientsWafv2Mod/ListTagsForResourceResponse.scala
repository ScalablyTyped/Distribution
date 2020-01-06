package typings.awsDashSdk.clientsWafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.NextMarker] = js.native
  /**
    * The collection of tagging definitions for the resource. 
    */
  var TagInfoForResource: js.UndefOr[typings.awsDashSdk.clientsWafv2Mod.TagInfoForResource] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, TagInfoForResource: TagInfoForResource = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (TagInfoForResource != null) __obj.updateDynamic("TagInfoForResource")(TagInfoForResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

