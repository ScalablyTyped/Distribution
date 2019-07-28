package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Arn] = js.undefined
  /**
    * The date and time that the service was created.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description that you specify when you create the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  var DnsConfig: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.DnsConfig] = js.undefined
  var HealthCheckConfig: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.HealthCheckConfig] = js.undefined
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
}

object ServiceSummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreateDate: Timestamp = null,
    Description: ResourceDescription = null,
    DnsConfig: DnsConfig = null,
    HealthCheckConfig: HealthCheckConfig = null,
    HealthCheckCustomConfig: HealthCheckCustomConfig = null,
    Id: ResourceId = null,
    InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
    Name: ServiceName = null
  ): ServiceSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DnsConfig != null) __obj.updateDynamic("DnsConfig")(DnsConfig)
    if (HealthCheckConfig != null) __obj.updateDynamic("HealthCheckConfig")(HealthCheckConfig)
    if (HealthCheckCustomConfig != null) __obj.updateDynamic("HealthCheckCustomConfig")(HealthCheckCustomConfig)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ServiceSummary]
  }
}

