package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typings.awsDashSdk.clientsSagemakerMod.DomainId = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsDashSdk.clientsSagemakerMod.UserProfileName = js.native
}

object DescribeUserProfileRequest {
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): DescribeUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUserProfileRequest]
  }
}

