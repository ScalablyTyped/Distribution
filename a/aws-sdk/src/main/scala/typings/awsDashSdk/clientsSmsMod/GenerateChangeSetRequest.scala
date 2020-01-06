package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateChangeSetRequest extends js.Object {
  /**
    * ID of the application associated with the change set.
    */
  var appId: js.UndefOr[AppId] = js.native
  /**
    * Format for the change set.
    */
  var changesetFormat: js.UndefOr[OutputFormat] = js.native
}

object GenerateChangeSetRequest {
  @scala.inline
  def apply(appId: AppId = null, changesetFormat: OutputFormat = null): GenerateChangeSetRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (changesetFormat != null) __obj.updateDynamic("changesetFormat")(changesetFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateChangeSetRequest]
  }
}

