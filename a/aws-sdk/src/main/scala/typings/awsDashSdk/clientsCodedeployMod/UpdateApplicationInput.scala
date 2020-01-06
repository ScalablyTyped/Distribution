package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationInput extends js.Object {
  /**
    * The current name of the application you want to change.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.native
  /**
    * The new name to give the application.
    */
  var newApplicationName: js.UndefOr[ApplicationName] = js.native
}

object UpdateApplicationInput {
  @scala.inline
  def apply(applicationName: ApplicationName = null, newApplicationName: ApplicationName = null): UpdateApplicationInput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName.asInstanceOf[js.Any])
    if (newApplicationName != null) __obj.updateDynamic("newApplicationName")(newApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationInput]
  }
}

