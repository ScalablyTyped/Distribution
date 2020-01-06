package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceHealthSummary extends js.Object {
  /**
    * Describes the overall instance health. Valid values are below.
    */
  var instanceHealth: js.UndefOr[InstanceHealthState] = js.native
  /**
    * More information about the instance health. If the instanceHealth is healthy, then an instanceHealthReason value is not provided. If  instanceHealth  is initial, the  instanceHealthReason  value can be one of the following:     Lb.RegistrationInProgress  - The target instance is in the process of being registered with the load balancer.     Lb.InitialHealthChecking  - The Lightsail load balancer is still sending the target instance the minimum number of health checks required to determine its health status.   If  instanceHealth  is unhealthy, the  instanceHealthReason  value can be one of the following:     Instance.ResponseCodeMismatch  - The health checks did not return an expected HTTP code.     Instance.Timeout  - The health check requests timed out.     Instance.FailedHealthChecks  - The health checks failed because the connection to the target instance timed out, the target instance response was malformed, or the target instance failed the health check for an unknown reason.     Lb.InternalError  - The health checks failed due to an internal error.   If  instanceHealth  is unused, the  instanceHealthReason  value can be one of the following:     Instance.NotRegistered  - The target instance is not registered with the target group.     Instance.NotInUse  - The target group is not used by any load balancer, or the target instance is in an Availability Zone that is not enabled for its load balancer.     Instance.IpUnusable  - The target IP address is reserved for use by a Lightsail load balancer.     Instance.InvalidState  - The target is in the stopped or terminated state.   If  instanceHealth  is draining, the  instanceHealthReason  value can be one of the following:     Instance.DeregistrationInProgress  - The target instance is in the process of being deregistered and the deregistration delay period has not expired.  
    */
  var instanceHealthReason: js.UndefOr[InstanceHealthReason] = js.native
  /**
    * The name of the Lightsail instance for which you are requesting health check data.
    */
  var instanceName: js.UndefOr[ResourceName] = js.native
}

object InstanceHealthSummary {
  @scala.inline
  def apply(
    instanceHealth: InstanceHealthState = null,
    instanceHealthReason: InstanceHealthReason = null,
    instanceName: ResourceName = null
  ): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    if (instanceHealth != null) __obj.updateDynamic("instanceHealth")(instanceHealth.asInstanceOf[js.Any])
    if (instanceHealthReason != null) __obj.updateDynamic("instanceHealthReason")(instanceHealthReason.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceHealthSummary]
  }
}

