package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagOptionOutput extends js.Object {
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.TagOptionDetail] = js.undefined
}

object DescribeTagOptionOutput {
  @scala.inline
  def apply(TagOptionDetail: TagOptionDetail = null): DescribeTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    if (TagOptionDetail != null) __obj.updateDynamic("TagOptionDetail")(TagOptionDetail)
    __obj.asInstanceOf[DescribeTagOptionOutput]
  }
}

