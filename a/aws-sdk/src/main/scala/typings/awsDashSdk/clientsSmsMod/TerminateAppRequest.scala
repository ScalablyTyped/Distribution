package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateAppRequest extends js.Object {
  /**
    * ID of the application to terminate.
    */
  var appId: js.UndefOr[AppId] = js.native
}

object TerminateAppRequest {
  @scala.inline
  def apply(appId: AppId = null): TerminateAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateAppRequest]
  }
}

