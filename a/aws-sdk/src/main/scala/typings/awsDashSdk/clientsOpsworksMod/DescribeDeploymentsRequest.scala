package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeploymentsRequest extends js.Object {
  /**
    * The app ID. If you include this parameter, the command returns a description of the commands associated with the specified app.
    */
  var AppId: js.UndefOr[String] = js.undefined
  /**
    * An array of deployment IDs to be described. If you include this parameter, the command returns a description of the specified deployments. Otherwise, it returns a description of every deployment.
    */
  var DeploymentIds: js.UndefOr[Strings] = js.undefined
  /**
    * The stack ID. If you include this parameter, the command returns a description of the commands associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object DescribeDeploymentsRequest {
  @scala.inline
  def apply(AppId: String = null, DeploymentIds: Strings = null, StackId: String = null): DescribeDeploymentsRequest = {
    val __obj = js.Dynamic.literal()
    if (AppId != null) __obj.updateDynamic("AppId")(AppId)
    if (DeploymentIds != null) __obj.updateDynamic("DeploymentIds")(DeploymentIds)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[DescribeDeploymentsRequest]
  }
}

