package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackProvisioningParametersResult extends js.Object {
  /**
    * The AWS OpsWorks Stacks agent installer's URL.
    */
  var AgentInstallerUrl: js.UndefOr[String] = js.native
  /**
    * An embedded object that contains the provisioning parameters.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Parameters] = js.native
}

object DescribeStackProvisioningParametersResult {
  @scala.inline
  def apply(AgentInstallerUrl: String = null, Parameters: Parameters = null): DescribeStackProvisioningParametersResult = {
    val __obj = js.Dynamic.literal()
    if (AgentInstallerUrl != null) __obj.updateDynamic("AgentInstallerUrl")(AgentInstallerUrl.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackProvisioningParametersResult]
  }
}

