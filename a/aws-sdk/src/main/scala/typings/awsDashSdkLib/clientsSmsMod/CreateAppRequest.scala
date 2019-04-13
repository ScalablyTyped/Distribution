package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier you provide to ensure idempotency of application creation.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  /**
    * Description of the new application
    */
  var description: js.UndefOr[AppDescription] = js.undefined
  /**
    * Name of the new application.
    */
  var name: js.UndefOr[AppName] = js.undefined
  /**
    * Name of service role in customer's account to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  /**
    * List of server groups to include in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  /**
    * List of tags to be associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
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
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateAppRequest]
  }
}

