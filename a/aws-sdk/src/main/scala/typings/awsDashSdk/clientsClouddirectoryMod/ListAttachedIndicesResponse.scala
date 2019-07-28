package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttachedIndicesResponse extends js.Object {
  /**
    * The indices attached to the specified object.
    */
  var IndexAttachments: js.UndefOr[IndexAttachmentList] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}

object ListAttachedIndicesResponse {
  @scala.inline
  def apply(IndexAttachments: IndexAttachmentList = null, NextToken: NextToken = null): ListAttachedIndicesResponse = {
    val __obj = js.Dynamic.literal()
    if (IndexAttachments != null) __obj.updateDynamic("IndexAttachments")(IndexAttachments)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAttachedIndicesResponse]
  }
}

