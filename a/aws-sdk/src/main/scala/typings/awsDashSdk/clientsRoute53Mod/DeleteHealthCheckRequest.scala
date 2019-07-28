package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHealthCheckRequest extends js.Object {
  /**
    * The ID of the health check that you want to delete.
    */
  var HealthCheckId: typings.awsDashSdk.clientsRoute53Mod.HealthCheckId
}

object DeleteHealthCheckRequest {
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): DeleteHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId)
  
    __obj.asInstanceOf[DeleteHealthCheckRequest]
  }
}

