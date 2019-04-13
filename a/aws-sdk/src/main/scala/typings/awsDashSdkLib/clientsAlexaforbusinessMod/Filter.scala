package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * The key of a filter.
    */
  var Key: FilterKey
  /**
    * The values of a filter.
    */
  var Values: FilterValueList
}

object Filter {
  @scala.inline
  def apply(Key: FilterKey, Values: FilterValueList): Filter = {
    val __obj = js.Dynamic.literal(Key = Key, Values = Values)
  
    __obj.asInstanceOf[Filter]
  }
}

