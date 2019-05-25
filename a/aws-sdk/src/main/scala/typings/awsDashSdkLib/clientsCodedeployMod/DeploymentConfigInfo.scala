package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfigInfo extends js.Object {
  /**
    * The destination platform type for the deployment (Lambda, Server, or ECS).
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  /**
    * The time at which the deployment configuration was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.undefined
  /**
    * The deployment configuration name.
    */
  var deploymentConfigName: js.UndefOr[DeploymentConfigName] = js.undefined
  /**
    * Information about the number or percentage of minimum healthy instance.
    */
  var minimumHealthyHosts: js.UndefOr[MinimumHealthyHosts] = js.undefined
  /**
    * The configuration that specifies how the deployment traffic is routed. Only deployments with a Lambda compute platform can specify this.
    */
  var trafficRoutingConfig: js.UndefOr[TrafficRoutingConfig] = js.undefined
}

object DeploymentConfigInfo {
  @scala.inline
  def apply(
    computePlatform: ComputePlatform = null,
    createTime: Timestamp = null,
    deploymentConfigId: DeploymentConfigId = null,
    deploymentConfigName: DeploymentConfigName = null,
    minimumHealthyHosts: MinimumHealthyHosts = null,
    trafficRoutingConfig: TrafficRoutingConfig = null
  ): DeploymentConfigInfo = {
    val __obj = js.Dynamic.literal()
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (deploymentConfigId != null) __obj.updateDynamic("deploymentConfigId")(deploymentConfigId)
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName)
    if (minimumHealthyHosts != null) __obj.updateDynamic("minimumHealthyHosts")(minimumHealthyHosts)
    if (trafficRoutingConfig != null) __obj.updateDynamic("trafficRoutingConfig")(trafficRoutingConfig)
    __obj.asInstanceOf[DeploymentConfigInfo]
  }
}

