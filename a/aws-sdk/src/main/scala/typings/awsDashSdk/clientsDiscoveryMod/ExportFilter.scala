package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportFilter extends js.Object {
  /**
    * Supported condition: EQUALS 
    */
  var condition: Condition = js.native
  /**
    * A single ExportFilter name. Supported filters: agentId.
    */
  var name: FilterName = js.native
  /**
    * A single agentId for a Discovery Agent. An agentId can be found using the DescribeAgents action. Typically an ADS agentId is in the form o-0123456789abcdef0.
    */
  var values: FilterValues = js.native
}

object ExportFilter {
  @scala.inline
  def apply(condition: Condition, name: FilterName, values: FilterValues): ExportFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportFilter]
  }
}

