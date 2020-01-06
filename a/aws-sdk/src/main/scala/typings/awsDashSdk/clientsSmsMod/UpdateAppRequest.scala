package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAppRequest extends js.Object {
  /**
    * ID of the application to update.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * New description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.native
  /**
    * New name of the application.
    */
  var name: js.UndefOr[AppName] = js.native
  /**
    * Name of the service role in the customer's account used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * List of server groups in the application to update.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  /**
    * List of tags to associate with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object UpdateAppRequest {
  @scala.inline
  def apply(
    appId: AppId = null,
    description: AppDescription = null,
    name: AppName = null,
    roleName: RoleName = null,
    serverGroups: ServerGroups = null,
    tags: Tags = null
  ): UpdateAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppRequest]
  }
}

