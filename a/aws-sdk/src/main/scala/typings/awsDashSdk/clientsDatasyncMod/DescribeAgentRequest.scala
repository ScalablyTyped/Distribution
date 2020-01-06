package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent to describe.
    */
  var AgentArn: typings.awsDashSdk.clientsDatasyncMod.AgentArn = js.native
}

object DescribeAgentRequest {
  @scala.inline
  def apply(AgentArn: AgentArn): DescribeAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAgentRequest]
  }
}

