package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHealthCheckCountResponse extends js.Object {
  /**
    * The number of health checks associated with the current AWS account.
    */
  var HealthCheckCount: typings.awsDashSdk.clientsRoute53Mod.HealthCheckCount
}

object GetHealthCheckCountResponse {
  @scala.inline
  def apply(HealthCheckCount: HealthCheckCount): GetHealthCheckCountResponse = {
    val __obj = js.Dynamic.literal(HealthCheckCount = HealthCheckCount)
  
    __obj.asInstanceOf[GetHealthCheckCountResponse]
  }
}

