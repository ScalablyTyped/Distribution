package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckRequest extends js.Object {
  /**
    * The identifier that Amazon Route 53 assigned to the health check when you created it. When you add or update a resource record set, you use this value to specify which health check to use. The value can be up to 64 characters long.
    */
  var HealthCheckId: typings.awsDashSdk.clientsRoute53Mod.HealthCheckId = js.native
}

object GetHealthCheckRequest {
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): GetHealthCheckRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHealthCheckRequest]
  }
}

