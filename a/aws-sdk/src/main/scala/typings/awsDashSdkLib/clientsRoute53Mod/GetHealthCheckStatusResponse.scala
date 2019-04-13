package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHealthCheckStatusResponse extends js.Object {
  /**
    * A list that contains one HealthCheckObservation element for each Amazon Route 53 health checker that is reporting a status about the health check endpoint.
    */
  var HealthCheckObservations: awsDashSdkLib.clientsRoute53Mod.HealthCheckObservations
}

object GetHealthCheckStatusResponse {
  @scala.inline
  def apply(HealthCheckObservations: HealthCheckObservations): GetHealthCheckStatusResponse = {
    val __obj = js.Dynamic.literal(HealthCheckObservations = HealthCheckObservations)
  
    __obj.asInstanceOf[GetHealthCheckStatusResponse]
  }
}

