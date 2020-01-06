package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
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
    * The instance type and quantity.
    */
  var ResourceSpec: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ResourceSpec] = js.native
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsDashSdk.clientsSagemakerMod.UserProfileName = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(
    AppName: AppName,
    AppType: AppType,
    DomainId: DomainId,
    UserProfileName: UserProfileName,
    ResourceSpec: ResourceSpec = null,
    Tags: TagList = null
  ): CreateAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    if (ResourceSpec != null) __obj.updateDynamic("ResourceSpec")(ResourceSpec.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
}

