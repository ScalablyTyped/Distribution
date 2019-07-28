package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppResult extends js.Object {
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[String] = js.undefined
}

object CreateAppResult {
  @scala.inline
  def apply(AppId: String = null): CreateAppResult = {
    val __obj = js.Dynamic.literal()
    if (AppId != null) __obj.updateDynamic("AppId")(AppId)
    __obj.asInstanceOf[CreateAppResult]
  }
}

