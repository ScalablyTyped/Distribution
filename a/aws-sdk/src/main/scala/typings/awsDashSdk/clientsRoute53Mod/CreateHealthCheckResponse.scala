package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHealthCheckResponse extends js.Object {
  /**
    * A complex type that contains identifying information about the health check.
    */
  var HealthCheck: typings.awsDashSdk.clientsRoute53Mod.HealthCheck
  /**
    * The unique URL representing the new health check.
    */
  var Location: ResourceURI
}

object CreateHealthCheckResponse {
  @scala.inline
  def apply(HealthCheck: HealthCheck, Location: ResourceURI): CreateHealthCheckResponse = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck, Location = Location)
  
    __obj.asInstanceOf[CreateHealthCheckResponse]
  }
}

