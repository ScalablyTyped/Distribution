package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppResponse extends js.Object {
  /**
    * Summary description of the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.native
  /**
    * List of server groups included in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  /**
    * List of taags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}

object CreateAppResponse {
  @scala.inline
  def apply(appSummary: AppSummary = null, serverGroups: ServerGroups = null, tags: Tags = null): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    if (appSummary != null) __obj.updateDynamic("appSummary")(appSummary.asInstanceOf[js.Any])
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResponse]
  }
}

