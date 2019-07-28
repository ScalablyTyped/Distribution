package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResult extends js.Object {
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  /**
    * List of tags returned by the ListTagsForResource operation.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Tags] = js.undefined
}

object ListTagsForResourceResult {
  @scala.inline
  def apply(NextToken: NextToken = null, Tags: Tags = null): ListTagsForResourceResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResult]
  }
}

