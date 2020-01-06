package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the cluster.
    */
  var arn: js.UndefOr[String] = js.native
  /**
    * The certificate-authority-data for your cluster.
    */
  var certificateAuthority: js.UndefOr[Certificate] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The Unix epoch timestamp in seconds for when the cluster was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The endpoint for your Kubernetes API server.
    */
  var endpoint: js.UndefOr[String] = js.native
  /**
    * The identity provider information for the cluster.
    */
  var identity: js.UndefOr[Identity] = js.native
  /**
    * The logging configuration for your cluster.
    */
  var logging: js.UndefOr[Logging] = js.native
  /**
    * The name of the cluster.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The platform version of your Amazon EKS cluster. For more information, see Platform Versions in the  Amazon EKS User Guide .
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The VPC configuration used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide.
    */
  var resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
    */
  var roleArn: js.UndefOr[String] = js.native
  /**
    * The current status of the cluster.
    */
  var status: js.UndefOr[ClusterStatus] = js.native
  /**
    * The metadata that you apply to the cluster to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Cluster tags do not propagate to any other resources associated with the cluster. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  /**
    * The Kubernetes server version for the cluster.
    */
  var version: js.UndefOr[String] = js.native
}

object Cluster {
  @scala.inline
  def apply(
    arn: String = null,
    certificateAuthority: Certificate = null,
    clientRequestToken: String = null,
    createdAt: Timestamp = null,
    endpoint: String = null,
    identity: Identity = null,
    logging: Logging = null,
    name: String = null,
    platformVersion: String = null,
    resourcesVpcConfig: VpcConfigResponse = null,
    roleArn: String = null,
    status: ClusterStatus = null,
    tags: TagMap = null,
    version: String = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (certificateAuthority != null) __obj.updateDynamic("certificateAuthority")(certificateAuthority.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (resourcesVpcConfig != null) __obj.updateDynamic("resourcesVpcConfig")(resourcesVpcConfig.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
}

