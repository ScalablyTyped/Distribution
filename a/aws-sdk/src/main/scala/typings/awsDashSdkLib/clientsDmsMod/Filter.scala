package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The name of the filter.
    */
  var Name: String
  /**
    * The filter value.
    */
  var Values: FilterValueList
}

object Filter {
  @scala.inline
  def apply(Name: String, Values: FilterValueList): Filter = {
    val __obj = js.Dynamic.literal(Name = Name, Values = Values)
  
    __obj.asInstanceOf[Filter]
  }
}

