package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheckConfig extends js.Object {
  /**
    * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see How Route 53 Determines Whether an Endpoint Is Healthy in the Route 53 Developer Guide.
    */
  var FailureThreshold: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.FailureThreshold] = js.native
  /**
    * The path that you want Route 53 to request when performing health checks. The path can be any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file /docs/route53-health-check.html. Route 53 automatically adds the DNS name for the service. If you don't specify a value for ResourcePath, the default value is /. If you specify TCP for Type, you must not specify a value for ResourcePath.
    */
  var ResourcePath: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.ResourcePath] = js.native
  /**
    * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy.  You can't change the value of Type after you create a health check.  You can create the following types of health checks:    HTTP: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.    HTTPS: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.  If you specify HTTPS for the value of Type, the endpoint must support TLS v1.0 or later.     TCP: Route 53 tries to establish a TCP connection. If you specify TCP for Type, don't specify a value for ResourcePath.   For more information, see How Route 53 Determines Whether an Endpoint Is Healthy in the Route 53 Developer Guide.
    */
  var Type: HealthCheckType = js.native
}

object HealthCheckConfig {
  @scala.inline
  def apply(Type: HealthCheckType, FailureThreshold: Int | Double = null, ResourcePath: ResourcePath = null): HealthCheckConfig = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (FailureThreshold != null) __obj.updateDynamic("FailureThreshold")(FailureThreshold.asInstanceOf[js.Any])
    if (ResourcePath != null) __obj.updateDynamic("ResourcePath")(ResourcePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckConfig]
  }
}

