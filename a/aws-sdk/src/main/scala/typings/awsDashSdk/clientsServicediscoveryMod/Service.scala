package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Arn] = js.undefined
  /**
    * The date and time that the service was created, in Unix format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The description of the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  var DnsConfig: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.DnsConfig] = js.undefined
  /**
    *  Public DNS namespaces only. A complex type that contains settings for an optional health check. If you specify settings for a health check, AWS Cloud Map associates the health check with the records that you specify in DnsConfig. For information about the charges for health checks, see Amazon Route 53 Pricing.
    */
  var HealthCheckConfig: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.HealthCheckConfig] = js.undefined
  /**
    * A complex type that contains information about an optional custom health check.  If you specify a health check configuration, you can specify either HealthCheckCustomConfig or HealthCheckConfig but not both. 
    */
  var HealthCheckCustomConfig: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.HealthCheckCustomConfig] = js.undefined
  /**
    * The ID that AWS Cloud Map assigned to the service when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  /**
    * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that have been deleted are not included in the count.
    */
  var InstanceCount: js.UndefOr[ResourceCount] = js.undefined
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[ServiceName] = js.undefined
  /**
    * The ID of the namespace that was used to create the service.
    */
  var NamespaceId: js.UndefOr[ResourceId] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreateDate: Timestamp = null,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null,
    DnsConfig: DnsConfig = null,
    HealthCheckConfig: HealthCheckConfig = null,
    HealthCheckCustomConfig: HealthCheckCustomConfig = null,
    Id: ResourceId = null,
    InstanceCount: Int | Double = null,
    Name: ServiceName = null,
    NamespaceId: ResourceId = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DnsConfig != null) __obj.updateDynamic("DnsConfig")(DnsConfig)
    if (HealthCheckConfig != null) __obj.updateDynamic("HealthCheckConfig")(HealthCheckConfig)
    if (HealthCheckCustomConfig != null) __obj.updateDynamic("HealthCheckCustomConfig")(HealthCheckCustomConfig)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (InstanceCount != null) __obj.updateDynamic("InstanceCount")(InstanceCount.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NamespaceId != null) __obj.updateDynamic("NamespaceId")(NamespaceId)
    __obj.asInstanceOf[Service]
  }
}

