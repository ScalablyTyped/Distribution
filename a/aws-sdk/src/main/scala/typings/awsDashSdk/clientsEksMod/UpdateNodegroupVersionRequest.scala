package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodegroupVersionRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  /**
    * The name of the Amazon EKS cluster that is associated with the managed node group to update.
    */
  var clusterName: String = js.native
  /**
    * Force the update if the existing node group's pods are unable to be drained due to a pod disruption budget issue. If an update fails because pods could not be drained, you can force the update after it fails to terminate the old node whether or not any pods are running on the node.
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * The name of the managed node group to update.
    */
  var nodegroupName: String = js.native
  /**
    * The AMI version of the Amazon EKS-optimized AMI to use for the update. By default, the latest available AMI version for the node group's Kubernetes version is used. For more information, see Amazon EKS-Optimized Linux AMI Versions  in the Amazon EKS User Guide.
    */
  var releaseVersion: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to update to. If no version is specified, then the Kubernetes version of the node group does not change. You can specify the Kubernetes version of the cluster to update the node group to the latest AMI version of the cluster's Kubernetes version.
    */
  var version: js.UndefOr[String] = js.native
}

object UpdateNodegroupVersionRequest {
  @scala.inline
  def apply(
    clusterName: String,
    nodegroupName: String,
    clientRequestToken: String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    releaseVersion: String = null,
    version: String = null
  ): UpdateNodegroupVersionRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (releaseVersion != null) __obj.updateDynamic("releaseVersion")(releaseVersion.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupVersionRequest]
  }
}

