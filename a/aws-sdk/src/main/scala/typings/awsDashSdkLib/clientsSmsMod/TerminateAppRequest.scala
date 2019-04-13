package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateAppRequest extends js.Object {
  /**
    * ID of the application to terminate.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}

object TerminateAppRequest {
  @scala.inline
  def apply(appId: AppId = null): TerminateAppRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    __obj.asInstanceOf[TerminateAppRequest]
  }
}

