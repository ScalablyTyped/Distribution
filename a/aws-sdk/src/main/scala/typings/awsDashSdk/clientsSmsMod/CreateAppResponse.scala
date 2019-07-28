package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppResponse extends js.Object {
  /**
    * Summary description of the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.undefined
  /**
    * List of server groups included in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  /**
    * List of taags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object CreateAppResponse {
  @scala.inline
  def apply(appSummary: AppSummary = null, serverGroups: ServerGroups = null, tags: Tags = null): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    if (appSummary != null) __obj.updateDynamic("appSummary")(appSummary)
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateAppResponse]
  }
}

