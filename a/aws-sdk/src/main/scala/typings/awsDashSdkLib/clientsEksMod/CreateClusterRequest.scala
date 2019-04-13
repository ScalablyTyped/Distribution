package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  /**
    * Enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs are not exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing. 
    */
  var logging: js.UndefOr[Logging] = js.undefined
  /**
    * The unique name to give to your cluster.
    */
  var name: ClusterName
  /**
    * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide. You must specify at least two subnets. You may specify up to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
    */
  var resourcesVpcConfig: VpcConfigRequest
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to other AWS API operations on your behalf. For more information, see Amazon EKS Service IAM Role in the  Amazon EKS User Guide .
    */
  var roleArn: String
  /**
    * The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version available in Amazon EKS is used.
    */
  var version: js.UndefOr[String] = js.undefined
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    name: ClusterName,
    resourcesVpcConfig: VpcConfigRequest,
    roleArn: String,
    clientRequestToken: String = null,
    logging: Logging = null,
    version: String = null
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(name = name, resourcesVpcConfig = resourcesVpcConfig, roleArn = roleArn)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    if (logging != null) __obj.updateDynamic("logging")(logging)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

