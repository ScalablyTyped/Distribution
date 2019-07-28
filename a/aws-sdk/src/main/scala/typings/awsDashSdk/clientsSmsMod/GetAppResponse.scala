package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAppResponse extends js.Object {
  /**
    * Information about the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.undefined
  /**
    * List of server groups belonging to the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  /**
    * List of tags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object GetAppResponse {
  @scala.inline
  def apply(appSummary: AppSummary = null, serverGroups: ServerGroups = null, tags: Tags = null): GetAppResponse = {
    val __obj = js.Dynamic.literal()
    if (appSummary != null) __obj.updateDynamic("appSummary")(appSummary)
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetAppResponse]
  }
}

