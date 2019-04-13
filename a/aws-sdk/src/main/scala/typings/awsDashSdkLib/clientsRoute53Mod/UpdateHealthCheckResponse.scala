package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains the response to an UpdateHealthCheck request.
    */
  var HealthCheck: awsDashSdkLib.clientsRoute53Mod.HealthCheck
}

object UpdateHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck): UpdateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck)
  
    __obj.asInstanceOf[UpdateHealthCheckResponse]
  }
}

