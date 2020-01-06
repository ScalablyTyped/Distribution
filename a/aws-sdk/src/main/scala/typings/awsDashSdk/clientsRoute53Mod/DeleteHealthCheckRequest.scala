package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHealthCheckRequest extends js.Object {
  /**
    * The ID of the health check that you want to delete.
    */
  var HealthCheckId: typings.awsDashSdk.clientsRoute53Mod.HealthCheckId = js.native
}

object DeleteHealthCheckRequest {
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): DeleteHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHealthCheckRequest]
  }
}

