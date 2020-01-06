package typings.awsDashSdk.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForStreamOutput extends js.Object {
  /**
    * If you specify this parameter and the result of a ListTags call is truncated, the response includes a token that you can use in the next request to fetch the next set of tags.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoMod.NextToken] = js.native
  /**
    * A map of tag keys and values associated with the specified stream.
    */
  var Tags: js.UndefOr[ResourceTags] = js.native
}

object ListTagsForStreamOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: ResourceTags = null): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
}

