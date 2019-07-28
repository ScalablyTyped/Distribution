package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoRollbackConfiguration extends js.Object {
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The event type or types that trigger a rollback.
    */
  var events: js.UndefOr[AutoRollbackEventsList] = js.undefined
}

object AutoRollbackConfiguration {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, events: AutoRollbackEventsList = null): AutoRollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (events != null) __obj.updateDynamic("events")(events)
    __obj.asInstanceOf[AutoRollbackConfiguration]
  }
}

