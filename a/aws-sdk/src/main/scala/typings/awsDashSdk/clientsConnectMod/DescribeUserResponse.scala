package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserResponse extends js.Object {
  /**
    * A User object that contains information about the user account and configuration settings.
    */
  var User: js.UndefOr[typings.awsDashSdk.clientsConnectMod.User] = js.undefined
}

object DescribeUserResponse {
  @scala.inline
  def apply(User: User = null): DescribeUserResponse = {
    val __obj = js.Dynamic.literal()
    if (User != null) __obj.updateDynamic("User")(User)
    __obj.asInstanceOf[DescribeUserResponse]
  }
}

