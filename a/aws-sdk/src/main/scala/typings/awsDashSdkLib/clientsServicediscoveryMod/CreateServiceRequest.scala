package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreateService requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  /**
    * A description for the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create when you register an instance. 
    */
  var DnsConfig: js.UndefOr[DnsConfig] = js.undefined
  /**
    *  Public DNS namespaces only. A complex type that contains settings for an optional Route 53 health check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS records that you specify in DnsConfig.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both.  For information about the charges for health checks, see AWS Cloud Map Pricing.
    */
  var HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
    */
  var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined
  /**
    * The name that you want to assign to the service.
    */
  var Name: ServiceName
  /**
    * The ID of the namespace that you want to use to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.undefined
}

object CreateServiceRequest {
  @scala.inline
  def apply(
    Name: ServiceName,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null,
    DnsConfig: DnsConfig = null,
    HealthCheckConfig: HealthCheckConfig = null,
    HealthCheckCustomConfig: HealthCheckCustomConfig = null,
    NamespaceId: ResourceId = null
  ): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DnsConfig != null) __obj.updateDynamic("DnsConfig")(DnsConfig)
    if (HealthCheckConfig != null) __obj.updateDynamic("HealthCheckConfig")(HealthCheckConfig)
    if (HealthCheckCustomConfig != null) __obj.updateDynamic("HealthCheckCustomConfig")(HealthCheckCustomConfig)
    if (NamespaceId != null) __obj.updateDynamic("NamespaceId")(NamespaceId)
    __obj.asInstanceOf[CreateServiceRequest]
  }
}

