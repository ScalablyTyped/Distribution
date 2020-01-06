package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppRequest extends js.Object {
  /**
    * The name of the app.
    */
  var AppName: typings.awsDashSdk.clientsSagemakerMod.AppName = js.native
  /**
    * The type of app.
    */
  var AppType: typings.awsDashSdk.clientsSagemakerMod.AppType = js.native
  /**
    * The domain ID.
    */
  var DomainId: typings.awsDashSdk.clientsSagemakerMod.DomainId = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsDashSdk.clientsSagemakerMod.UserProfileName = js.native
}

object DescribeAppRequest {
  @scala.inline
  def apply(AppName: AppName, AppType: AppType, DomainId: DomainId, UserProfileName: UserProfileName): DescribeAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAppRequest]
  }
}

