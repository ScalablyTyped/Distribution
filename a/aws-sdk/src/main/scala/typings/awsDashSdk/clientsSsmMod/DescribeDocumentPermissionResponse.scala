package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentPermissionResponse extends js.Object {
  /**
    * The account IDs that have permission to use this document. The ID can be either an AWS account or All.
    */
  var AccountIds: js.UndefOr[AccountIdList] = js.undefined
}

object DescribeDocumentPermissionResponse {
  @scala.inline
  def apply(AccountIds: AccountIdList = null): DescribeDocumentPermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountIds != null) __obj.updateDynamic("AccountIds")(AccountIds)
    __obj.asInstanceOf[DescribeDocumentPermissionResponse]
  }
}

