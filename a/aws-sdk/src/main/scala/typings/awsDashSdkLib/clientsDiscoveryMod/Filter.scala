package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * A conditional operator. The following operators are valid: EQUALS, NOT_EQUALS, CONTAINS, NOT_CONTAINS. If you specify multiple filters, the system utilizes all filters as though concatenated by AND. If you specify multiple values for a particular filter, the system differentiates the values using OR. Calling either DescribeConfigurations or ListConfigurations returns attributes of matching configuration items.
    */
  var condition: Condition
  /**
    * The name of the filter.
    */
  var name: String
  /**
    * A string value on which to filter. For example, if you choose the destinationServer.osVersion filter name, you could specify Ubuntu for the value.
    */
  var values: FilterValues
}

object Filter {
  @scala.inline
  def apply(condition: Condition, name: String, values: FilterValues): Filter = {
    val __obj = js.Dynamic.literal(condition = condition, name = name, values = values)
  
    __obj.asInstanceOf[Filter]
  }
}

