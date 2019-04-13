package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnPremConfig extends js.Object {
  /**
    * ARNs)of the agents to use for an NFS location.
    */
  var AgentArns: AgentArnList
}

object OnPremConfig {
  @scala.inline
  def apply(AgentArns: AgentArnList): OnPremConfig = {
    val __obj = js.Dynamic.literal(AgentArns = AgentArns)
  
    __obj.asInstanceOf[OnPremConfig]
  }
}

