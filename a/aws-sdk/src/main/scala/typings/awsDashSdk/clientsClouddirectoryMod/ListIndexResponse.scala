package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndexResponse extends js.Object {
  /**
    * The objects and indexed values attached to the index.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
}

object ListIndexResponse {
  @scala.inline
  def apply(IndexAttachments: IndexAttachmentList = null, NextToken: NextToken = null): ListIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (IndexAttachments != null) __obj.updateDynamic("IndexAttachments")(IndexAttachments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIndexResponse]
  }
}

