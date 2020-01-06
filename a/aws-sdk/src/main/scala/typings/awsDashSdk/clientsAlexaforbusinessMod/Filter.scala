package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The key of a filter.
    */
  var Key: FilterKey = js.native
  /**
    * The values of a filter.
    */
  var Values: FilterValueList = js.native
}

object Filter {
  @scala.inline
  def apply(Key: FilterKey, Values: FilterValueList): Filter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filter]
  }
}

