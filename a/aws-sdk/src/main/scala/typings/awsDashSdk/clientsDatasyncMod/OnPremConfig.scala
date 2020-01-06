package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPremConfig extends js.Object {
  /**
    * ARNs)of the agents to use for an NFS location.
    */
  var AgentArns: AgentArnList = js.native
}

object OnPremConfig {
  @scala.inline
  def apply(AgentArns: AgentArnList): OnPremConfig = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnPremConfig]
  }
}

