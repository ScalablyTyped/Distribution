package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerAttributes extends js.Object {
  /**
    * If enabled, the load balancer captures detailed information of all requests and delivers the information to the Amazon S3 bucket that you specify. For more information, see Enable Access Logs in the Classic Load Balancers Guide.
    */
  var AccessLog: js.UndefOr[typings.awsDashSdk.clientsElbMod.AccessLog] = js.undefined
  /**
    * This parameter is reserved.
    */
  var AdditionalAttributes: js.UndefOr[typings.awsDashSdk.clientsElbMod.AdditionalAttributes] = js.undefined
  /**
    * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away from a deregistered or unhealthy instance. For more information, see Configure Connection Draining in the Classic Load Balancers Guide.
    */
  var ConnectionDraining: js.UndefOr[typings.awsDashSdk.clientsElbMod.ConnectionDraining] = js.undefined
  /**
    * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the specified duration. By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end connections of your load balancer. For more information, see Configure Idle Connection Timeout in the Classic Load Balancers Guide.
    */
  var ConnectionSettings: js.UndefOr[typings.awsDashSdk.clientsElbMod.ConnectionSettings] = js.undefined
  /**
    * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the Availability Zones. For more information, see Configure Cross-Zone Load Balancing in the Classic Load Balancers Guide.
    */
  var CrossZoneLoadBalancing: js.UndefOr[typings.awsDashSdk.clientsElbMod.CrossZoneLoadBalancing] = js.undefined
}

object LoadBalancerAttributes {
  @scala.inline
  def apply(
    AccessLog: AccessLog = null,
    AdditionalAttributes: AdditionalAttributes = null,
    ConnectionDraining: ConnectionDraining = null,
    ConnectionSettings: ConnectionSettings = null,
    CrossZoneLoadBalancing: CrossZoneLoadBalancing = null
  ): LoadBalancerAttributes = {
    val __obj = js.Dynamic.literal()
    if (AccessLog != null) __obj.updateDynamic("AccessLog")(AccessLog)
    if (AdditionalAttributes != null) __obj.updateDynamic("AdditionalAttributes")(AdditionalAttributes)
    if (ConnectionDraining != null) __obj.updateDynamic("ConnectionDraining")(ConnectionDraining)
    if (ConnectionSettings != null) __obj.updateDynamic("ConnectionSettings")(ConnectionSettings)
    if (CrossZoneLoadBalancing != null) __obj.updateDynamic("CrossZoneLoadBalancing")(CrossZoneLoadBalancing)
    __obj.asInstanceOf[LoadBalancerAttributes]
  }
}

