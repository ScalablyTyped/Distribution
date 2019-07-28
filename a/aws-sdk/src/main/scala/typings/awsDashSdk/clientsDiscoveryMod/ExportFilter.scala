package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportFilter extends js.Object {
  /**
    * Supported condition: EQUALS 
    */
  var condition: Condition
  /**
    * A single ExportFilter name. Supported filters: agentId.
    */
  var name: FilterName
  /**
    * A single agentId for a Discovery Agent. An agentId can be found using the DescribeAgents action. Typically an ADS agentId is in the form o-0123456789abcdef0.
    */
  var values: FilterValues
}

object ExportFilter {
  @scala.inline
  def apply(condition: Condition, name: FilterName, values: FilterValues): ExportFilter = {
    val __obj = js.Dynamic.literal(condition = condition, name = name, values = values)
  
    __obj.asInstanceOf[ExportFilter]
  }
}

