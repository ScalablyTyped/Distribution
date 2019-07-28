package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackProvisioningParametersResult extends js.Object {
  /**
    * The AWS OpsWorks Stacks agent installer's URL.
    */
  var AgentInstallerUrl: js.UndefOr[String] = js.undefined
  /**
    * An embedded object that contains the provisioning parameters.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.Parameters] = js.undefined
}

object DescribeStackProvisioningParametersResult {
  @scala.inline
  def apply(AgentInstallerUrl: String = null, Parameters: Parameters = null): DescribeStackProvisioningParametersResult = {
    val __obj = js.Dynamic.literal()
    if (AgentInstallerUrl != null) __obj.updateDynamic("AgentInstallerUrl")(AgentInstallerUrl)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[DescribeStackProvisioningParametersResult]
  }
}

