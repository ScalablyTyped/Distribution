package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpInstanceSummary extends js.Object {
  /**
    * If you included any attributes when you registered the instance, the values of those attributes.
    */
  var Attributes: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Attributes] = js.undefined
  /**
    * If you configured health checking in the service, the current health status of the service instance.
    */
  var HealthStatus: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.HealthStatus] = js.undefined
  /**
    * The ID of an instance that matches the values that you specified in the request.
    */
  var InstanceId: js.UndefOr[ResourceId] = js.undefined
  /**
    * The name of the namespace that you specified when you registered the instance.
    */
  var NamespaceName: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.NamespaceName] = js.undefined
  /**
    * The name of the service that you specified when you registered the instance.
    */
  var ServiceName: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.ServiceName] = js.undefined
}

object HttpInstanceSummary {
  @scala.inline
  def apply(
    Attributes: Attributes = null,
    HealthStatus: HealthStatus = null,
    InstanceId: ResourceId = null,
    NamespaceName: NamespaceName = null,
    ServiceName: ServiceName = null
  ): HttpInstanceSummary = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (HealthStatus != null) __obj.updateDynamic("HealthStatus")(HealthStatus.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (NamespaceName != null) __obj.updateDynamic("NamespaceName")(NamespaceName)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    __obj.asInstanceOf[HttpInstanceSummary]
  }
}

