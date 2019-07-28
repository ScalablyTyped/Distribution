package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessKeyLastUsedResponse extends js.Object {
  /**
    * Contains information about the last time the access key was used.
    */
  var AccessKeyLastUsed: js.UndefOr[typings.awsDashSdk.clientsIamMod.AccessKeyLastUsed] = js.undefined
  /**
    * The name of the AWS IAM user that owns this access key. 
    */
  var UserName: js.UndefOr[existingUserNameType] = js.undefined
}

object GetAccessKeyLastUsedResponse {
  @scala.inline
  def apply(AccessKeyLastUsed: AccessKeyLastUsed = null, UserName: existingUserNameType = null): GetAccessKeyLastUsedResponse = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyLastUsed != null) __obj.updateDynamic("AccessKeyLastUsed")(AccessKeyLastUsed)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[GetAccessKeyLastUsedResponse]
  }
}

