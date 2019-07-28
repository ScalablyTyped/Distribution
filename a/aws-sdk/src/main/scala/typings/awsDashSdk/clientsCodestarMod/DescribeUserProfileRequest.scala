package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserProfileRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn
}

object DescribeUserProfileRequest {
  @scala.inline
  def apply(userArn: UserArn): DescribeUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn)
  
    __obj.asInstanceOf[DescribeUserProfileRequest]
  }
}

