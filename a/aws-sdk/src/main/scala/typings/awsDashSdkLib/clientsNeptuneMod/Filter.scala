package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * This parameter is not currently supported.
    */
  var Name: String
  /**
    * This parameter is not currently supported.
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

