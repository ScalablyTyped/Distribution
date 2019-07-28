package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsOutput extends js.Object {
  /**
    * Information about the tags.
    */
  var TagDescriptions: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.TagDescriptions] = js.undefined
}

object DescribeTagsOutput {
  @scala.inline
  def apply(TagDescriptions: TagDescriptions = null): DescribeTagsOutput = {
    val __obj = js.Dynamic.literal()
    if (TagDescriptions != null) __obj.updateDynamic("TagDescriptions")(TagDescriptions)
    __obj.asInstanceOf[DescribeTagsOutput]
  }
}

