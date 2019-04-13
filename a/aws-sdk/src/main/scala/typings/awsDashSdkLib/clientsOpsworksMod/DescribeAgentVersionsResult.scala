package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAgentVersionsResult extends js.Object {
  /**
    * The agent versions for the specified stack or configuration manager. Note that this value is the complete version number, not the abbreviated number used by the console.
    */
  var AgentVersions: js.UndefOr[AgentVersions] = js.undefined
}

object DescribeAgentVersionsResult {
  @scala.inline
  def apply(AgentVersions: AgentVersions = null): DescribeAgentVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (AgentVersions != null) __obj.updateDynamic("AgentVersions")(AgentVersions)
    __obj.asInstanceOf[DescribeAgentVersionsResult]
  }
}

