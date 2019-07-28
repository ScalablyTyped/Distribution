package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserProfilesRequest extends js.Object {
  /**
    * An array of IAM or federated user ARNs that identify the users to be described.
    */
  var IamUserArns: js.UndefOr[Strings] = js.undefined
}

object DescribeUserProfilesRequest {
  @scala.inline
  def apply(IamUserArns: Strings = null): DescribeUserProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (IamUserArns != null) __obj.updateDynamic("IamUserArns")(IamUserArns)
    __obj.asInstanceOf[DescribeUserProfilesRequest]
  }
}

