package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAppResponse extends js.Object {
  /**
    * Summary description of the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.undefined
  /**
    * List of updated server groups in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  /**
    * List of tags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}

object UpdateAppResponse {
  @scala.inline
  def apply(appSummary: AppSummary = null, serverGroups: ServerGroups = null, tags: Tags = null): UpdateAppResponse = {
    val __obj = js.Dynamic.literal()
    if (appSummary != null) __obj.updateDynamic("appSummary")(appSummary)
    if (serverGroups != null) __obj.updateDynamic("serverGroups")(serverGroups)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[UpdateAppResponse]
  }
}

