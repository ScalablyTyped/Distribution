package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNodegroupRequest extends js.Object {
  /**
    * The AMI type for your node group. GPU instance types should use the AL2_x86_64_GPU AMI type, which uses the Amazon EKS-optimized Linux AMI with GPU support. Non-GPU instances should use the AL2_x86_64 AMI type, which uses the Amazon EKS-optimized Linux AMI.
    */
  var amiType: js.UndefOr[AMITypes] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The name of the cluster to create the node group in.
    */
  var clusterName: String = js.native
  /**
    * The root device disk size (in GiB) for your node group instances. The default disk size is 20 GiB.
    */
  var diskSize: js.UndefOr[BoxedInteger] = js.native
  /**
    * The instance type to use for your node group. Currently, you can specify a single instance type for a node group. The default value for this parameter is t3.medium. If you choose a GPU instance type, be sure to specify the AL2_x86_64_GPU with the amiType parameter.
    */
  var instanceTypes: js.UndefOr[StringList] = js.native
  /**
    * The Kubernetes labels to be applied to the nodes in the node group when they are created.
    */
  var labels: js.UndefOr[labelsMap] = js.native
  /**
    * The IAM role associated with your node group. The Amazon EKS worker node kubelet daemon makes calls to AWS APIs on your behalf. Worker nodes receive permissions for these API calls through an IAM instance profile and associated policies. Before you can launch worker nodes and register them into a cluster, you must create an IAM role for those worker nodes to use when they are launched. For more information, see Amazon EKS Worker Node IAM Role in the  Amazon EKS User Guide .
    */
  var nodeRole: String = js.native
  /**
    * The unique name to give your node group.
    */
  var nodegroupName: String = js.native
  /**
    * The AMI version of the Amazon EKS-optimized AMI to use with your node group. By default, the latest available AMI version for the node group's current Kubernetes version is used. For more information, see Amazon EKS-Optimized Linux AMI Versions in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  /**
    * The remote access (SSH) configuration to use with your node group.
    */
  var remoteAccess: js.UndefOr[RemoteAccessConfig] = js.native
  /**
    * The scaling configuration details for the Auto Scaling group that is created for your node group.
    */
  var scalingConfig: js.UndefOr[NodegroupScalingConfig] = js.native
  /**
    * The subnets to use for the Auto Scaling group that is created for your node group. These subnets must have the tag key kubernetes.io/cluster/CLUSTER_NAME with a value of shared, where CLUSTER_NAME is replaced with the name of your cluster.
    */
  var subnets: StringList = js.native
  /**
    * The metadata to apply to the node group to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Node group tags do not propagate to any other resources associated with the node group, such as the Amazon EC2 instances or subnets.
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The Kubernetes version to use for your managed nodes. By default, the Kubernetes version of the cluster is used, and this is the only accepted specified value.
    */
  var version: js.UndefOr[String] = js.native
}

object CreateNodegroupRequest {
  @scala.inline
  def apply(
    clusterName: String,
    nodeRole: String,
    nodegroupName: String,
    subnets: StringList,
    amiType: AMITypes = null,
    clientRequestToken: String = null,
    diskSize: Int | Double = null,
    instanceTypes: StringList = null,
    labels: labelsMap = null,
    releaseVersion: String = null,
    remoteAccess: RemoteAccessConfig = null,
    scalingConfig: NodegroupScalingConfig = null,
    tags: TagMap = null,
    version: String = null
  ): CreateNodegroupRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodeRole = nodeRole.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any])
    if (amiType != null) __obj.updateDynamic("amiType")(amiType.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (diskSize != null) __obj.updateDynamic("diskSize")(diskSize.asInstanceOf[js.Any])
    if (instanceTypes != null) __obj.updateDynamic("instanceTypes")(instanceTypes.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (releaseVersion != null) __obj.updateDynamic("releaseVersion")(releaseVersion.asInstanceOf[js.Any])
    if (remoteAccess != null) __obj.updateDynamic("remoteAccess")(remoteAccess.asInstanceOf[js.Any])
    if (scalingConfig != null) __obj.updateDynamic("scalingConfig")(scalingConfig.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNodegroupRequest]
  }
}

