package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EcsCluster extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.undefined
  /**
    * The cluster name.
    */
  var EcsClusterName: js.UndefOr[String] = js.undefined
  /**
    * The time and date that the cluster was registered with the stack.
    */
  var RegisteredAt: js.UndefOr[DateTime] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object EcsCluster {
  @scala.inline
  def apply(
    EcsClusterArn: String = null,
    EcsClusterName: String = null,
    RegisteredAt: DateTime = null,
    StackId: String = null
  ): EcsCluster = {
    val __obj = js.Dynamic.literal()
    if (EcsClusterArn != null) __obj.updateDynamic("EcsClusterArn")(EcsClusterArn)
    if (EcsClusterName != null) __obj.updateDynamic("EcsClusterName")(EcsClusterName)
    if (RegisteredAt != null) __obj.updateDynamic("RegisteredAt")(RegisteredAt)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[EcsCluster]
  }
}

