package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * This parameter is not currently supported.
    */
  var Name: String = js.native
  /**
    * This parameter is not currently supported.
    */
  var Values: FilterValueList = js.native
}

object Filter {
  @scala.inline
  def apply(Name: String, Values: FilterValueList): Filter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filter]
  }
}

