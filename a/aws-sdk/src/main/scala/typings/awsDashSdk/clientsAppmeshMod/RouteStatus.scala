package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteStatus extends js.Object {
  /**
    * The current status for the route.
    */
  var status: RouteStatusCode
}

object RouteStatus {
  @scala.inline
  def apply(status: RouteStatusCode): RouteStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteStatus]
  }
}

