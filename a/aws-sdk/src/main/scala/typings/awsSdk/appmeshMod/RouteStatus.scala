package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteStatus extends js.Object {
  /**
    * The current status for the route.
    */
  var status: RouteStatusCode = js.native
}

object RouteStatus {
  @scala.inline
  def apply(status: RouteStatusCode): RouteStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RouteStatus]
  }
}

