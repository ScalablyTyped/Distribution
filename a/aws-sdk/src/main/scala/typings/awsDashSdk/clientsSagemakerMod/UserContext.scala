package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserContext extends js.Object {
  /**
    * The domain associated with the user.
    */
  var DomainId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user's profile.
    */
  var UserProfileArn: js.UndefOr[String] = js.native
  /**
    * The name of the user's profile.
    */
  var UserProfileName: js.UndefOr[String] = js.native
}

object UserContext {
  @scala.inline
  def apply(DomainId: String = null, UserProfileArn: String = null, UserProfileName: String = null): UserContext = {
    val __obj = js.Dynamic.literal()
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (UserProfileArn != null) __obj.updateDynamic("UserProfileArn")(UserProfileArn.asInstanceOf[js.Any])
    if (UserProfileName != null) __obj.updateDynamic("UserProfileName")(UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserContext]
  }
}

