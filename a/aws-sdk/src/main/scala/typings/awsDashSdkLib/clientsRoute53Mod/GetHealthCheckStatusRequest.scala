package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHealthCheckStatusRequest extends js.Object {
  /**
    * The ID for the health check that you want the current status for. When you created the health check, CreateHealthCheck returned the ID in the response, in the HealthCheckId element.  If you want to check the status of a calculated health check, you must use the Amazon Route 53 console or the CloudWatch console. You can't use GetHealthCheckStatus to get the status of a calculated health check. 
    */
  var HealthCheckId: awsDashSdkLib.clientsRoute53Mod.HealthCheckId
}

object GetHealthCheckStatusRequest {
  @scala.inline
  def apply(HealthCheckId: HealthCheckId): GetHealthCheckStatusRequest = {
    val __obj = js.Dynamic.literal(HealthCheckId = HealthCheckId)
  
    __obj.asInstanceOf[GetHealthCheckStatusRequest]
  }
}

