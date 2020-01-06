package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForResourceResponse extends js.Object {
  /**
    * This is present if there are more tags than returned in the response (String). You can use the NextToken value in the later request to fetch the tags. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.NextToken] = js.native
  /**
    * A list of tags on the resource.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsFsxMod.Tags] = js.native
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: Tags = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

