package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAppRequest extends js.Object {
  /**
    * ID of the application to update.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  /**
    * New description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.undefined
  /**
    * New name of the application.
    */
  var name: js.UndefOr[AppName] = js.undefined
  /**
    * Name of the service role in the customer's account used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  /**
    * List of server groups in the application to update.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  /**
    * List of tags to associate with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
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
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[UpdateAppRequest]
  }
}

