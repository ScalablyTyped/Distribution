package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartitionValueList extends js.Object {
  /**
    * The list of values.
    */
  var Values: ValueStringList
}

object PartitionValueList {
  @scala.inline
  def apply(Values: ValueStringList): PartitionValueList = {
    val __obj = js.Dynamic.literal(Values = Values)
  
    __obj.asInstanceOf[PartitionValueList]
  }
}

