package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAgentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agent to describe.
    */
  var AgentArn: awsDashSdkLib.clientsDatasyncMod.AgentArn
}

object DescribeAgentRequest {
  @scala.inline
  def apply(AgentArn: AgentArn): DescribeAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn)
  
    __obj.asInstanceOf[DescribeAgentRequest]
  }
}

