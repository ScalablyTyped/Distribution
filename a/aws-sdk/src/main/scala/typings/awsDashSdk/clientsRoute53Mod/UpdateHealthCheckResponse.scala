package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains the response to an UpdateHealthCheck request.
    */
  var HealthCheck: typings.awsDashSdk.clientsRoute53Mod.HealthCheck = js.native
}

object UpdateHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck): UpdateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateHealthCheckResponse]
  }
}

