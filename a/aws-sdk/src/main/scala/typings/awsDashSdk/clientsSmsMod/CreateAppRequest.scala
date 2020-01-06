package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier you provide to ensure idempotency of application creation.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * Description of the new application
    */
  var description: js.UndefOr[AppDescription] = js.native
  /**
    * Name of the new application.
    */
  var name: js.UndefOr[AppName] = js.native
  /**
    * Name of service role in customer's account to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * List of server groups to include in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  /**
    * List of tags to be associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateAppRequest {
  @scala.inline
  def apply(
    clientToken: ClientToken = null,
    description: AppDescription = null,
    name: AppName = null,
    roleName: RoleName = null,
    serverGroups: ServerGroups = null,
    tags: Tags = null
  ): CreateAppRequest = {
    val __obj = js.Dynamic.literal()
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppRequest]
  }
}

