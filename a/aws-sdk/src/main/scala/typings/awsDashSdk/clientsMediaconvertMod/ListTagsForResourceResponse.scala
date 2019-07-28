package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) and tags for an AWS Elemental MediaConvert resource.
    */
  var ResourceTags: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.ResourceTags] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(ResourceTags: ResourceTags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (ResourceTags != null) __obj.updateDynamic("ResourceTags")(ResourceTags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

