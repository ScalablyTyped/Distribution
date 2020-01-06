package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn = js.native
}

object DescribeUserProfileRequest {
  @scala.inline
  def apply(userArn: UserArn): DescribeUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUserProfileRequest]
  }
}

