package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTagOptionOutput extends js.Object {
  /**
    * Information about the TagOption.
    */
  var TagOptionDetail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.TagOptionDetail] = js.undefined
}

object UpdateTagOptionOutput {
  @scala.inline
  def apply(TagOptionDetail: TagOptionDetail = null): UpdateTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    if (TagOptionDetail != null) __obj.updateDynamic("TagOptionDetail")(TagOptionDetail)
    __obj.asInstanceOf[UpdateTagOptionOutput]
  }
}

