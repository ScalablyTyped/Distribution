package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAgentsResponse extends js.Object {
  /**
    * A list of agents in your account.
    */
  var Agents: js.UndefOr[AgentList] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin returning the next list of agents.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAgentsResponse {
  @scala.inline
  def apply(Agents: AgentList = null, NextToken: NextToken = null): ListAgentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Agents != null) __obj.updateDynamic("Agents")(Agents)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAgentsResponse]
  }
}

