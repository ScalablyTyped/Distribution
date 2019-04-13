package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains information about one health check that is associated with the current AWS account.
    */
  var HealthCheck: awsDashSdkLib.clientsRoute53Mod.HealthCheck
}

object GetHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck): GetHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck)
  
    __obj.asInstanceOf[GetHealthCheckResponse]
  }
}

