package typings.awsDashSdk.clientsIotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutConfig extends js.Object {
  /**
    * The maximum amount of time (in minutes) a tunnel can remain open. If not specified, maxLifetimeTimeoutMinutes defaults to 720 minutes. Valid values are from 1 minute to 12 hours (720 minutes) 
    */
  var maxLifetimeTimeoutMinutes: js.UndefOr[TimeoutInMin] = js.native
}

object TimeoutConfig {
  @scala.inline
  def apply(maxLifetimeTimeoutMinutes: Int | Double = null): TimeoutConfig = {
    val __obj = js.Dynamic.literal()
    if (maxLifetimeTimeoutMinutes != null) __obj.updateDynamic("maxLifetimeTimeoutMinutes")(maxLifetimeTimeoutMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutConfig]
  }
}

