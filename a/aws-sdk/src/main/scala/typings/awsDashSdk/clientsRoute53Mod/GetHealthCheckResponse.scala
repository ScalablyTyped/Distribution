package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains information about one health check that is associated with the current AWS account.
    */
  var HealthCheck: typings.awsDashSdk.clientsRoute53Mod.HealthCheck = js.native
}

object GetHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck): GetHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetHealthCheckResponse]
  }
}

