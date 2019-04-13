package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: String
  /**
    * One or more filter values. Filter values are case-sensitive.
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

