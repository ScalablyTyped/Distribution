package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHealthCheckRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows you to retry a failed CreateHealthCheck request without the risk of creating two identical health checks:   If you send a CreateHealthCheck request with the same CallerReference and settings as a previous request, and if the health check doesn't exist, Amazon Route 53 creates the health check. If the health check does exist, Route 53 returns the settings for the existing health check.   If you send a CreateHealthCheck request with the same CallerReference as a deleted health check, regardless of the settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with the same CallerReference as an existing health check but with different settings, Route 53 returns a HealthCheckAlreadyExists error.   If you send a CreateHealthCheck request with a unique CallerReference but settings identical to an existing health check, Route 53 creates the health check.  
    */
  var CallerReference: HealthCheckNonce
  /**
    * A complex type that contains settings for a new health check.
    */
  var HealthCheckConfig: typings.awsDashSdk.clientsRoute53Mod.HealthCheckConfig
}

object CreateHealthCheckRequest {
  @scala.inline
  def apply(CallerReference: HealthCheckNonce, HealthCheckConfig: HealthCheckConfig): CreateHealthCheckRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference, HealthCheckConfig = HealthCheckConfig)
  
    __obj.asInstanceOf[CreateHealthCheckRequest]
  }
}

