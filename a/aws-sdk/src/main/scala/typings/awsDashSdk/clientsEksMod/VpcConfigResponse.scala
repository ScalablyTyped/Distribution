package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcConfigResponse extends js.Object {
  /**
    * This parameter indicates whether the Amazon EKS private API server endpoint is enabled. If the Amazon EKS private API server endpoint is enabled, Kubernetes API requests that originate from within your cluster's VPC use the private VPC endpoint instead of traversing the internet.
    */
  var endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter indicates whether the Amazon EKS public API server endpoint is enabled. If the Amazon EKS public API server endpoint is disabled, your cluster's Kubernetes API server can receive only requests that originate from within the cluster VPC. 
    */
  var endpointPublicAccess: js.UndefOr[Boolean] = js.undefined
  /**
    * The security groups associated with the cross-account elastic network interfaces that are used to allow communication between your worker nodes and the Kubernetes control plane.
    */
  var securityGroupIds: js.UndefOr[StringList] = js.undefined
  /**
    * The subnets associated with your cluster.
    */
  var subnetIds: js.UndefOr[StringList] = js.undefined
  /**
    * The VPC associated with your cluster.
    */
  var vpcId: js.UndefOr[String] = js.undefined
}

object VpcConfigResponse {
  @scala.inline
  def apply(
    endpointPrivateAccess: js.UndefOr[Boolean] = js.undefined,
    endpointPublicAccess: js.UndefOr[Boolean] = js.undefined,
    securityGroupIds: StringList = null,
    subnetIds: StringList = null,
    vpcId: String = null
  ): VpcConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endpointPrivateAccess)) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess)
    if (!js.isUndefined(endpointPublicAccess)) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess)
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[VpcConfigResponse]
  }
}

