package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHealthCheckLastFailureReasonResponse extends js.Object {
  /**
    * A list that contains one Observation element for each Amazon Route 53 health checker that is reporting a last failure reason. 
    */
  var HealthCheckObservations: typings.awsDashSdk.clientsRoute53Mod.HealthCheckObservations
}

object GetHealthCheckLastFailureReasonResponse {
  @scala.inline
  def apply(HealthCheckObservations: HealthCheckObservations): GetHealthCheckLastFailureReasonResponse = {
    val __obj = js.Dynamic.literal(HealthCheckObservations = HealthCheckObservations)
  
    __obj.asInstanceOf[GetHealthCheckLastFailureReasonResponse]
  }
}

