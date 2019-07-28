package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApplicationInput extends js.Object {
  /**
    * The current name of the application you want to change.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  /**
    * The new name to give the application.
    */
  var newApplicationName: js.UndefOr[ApplicationName] = js.undefined
}

object UpdateApplicationInput {
  @scala.inline
  def apply(applicationName: ApplicationName = null, newApplicationName: ApplicationName = null): UpdateApplicationInput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (newApplicationName != null) __obj.updateDynamic("newApplicationName")(newApplicationName)
    __obj.asInstanceOf[UpdateApplicationInput]
  }
}

