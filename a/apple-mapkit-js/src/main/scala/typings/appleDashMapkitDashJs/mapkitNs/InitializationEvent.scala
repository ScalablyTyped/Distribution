package typings.appleDashMapkitDashJs.mapkitNs

import typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.Initialized
import typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.Refreshed
import typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.Unauthorized
import typings.appleDashMapkitDashJs.appleDashMapkitDashJsStrings.`Too Many Requests`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializationEvent extends js.Object {
  var status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)
}

object InitializationEvent {
  @scala.inline
  def apply(status: Initialized | Refreshed | Unauthorized | (`Too Many Requests`)): InitializationEvent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InitializationEvent]
  }
}

