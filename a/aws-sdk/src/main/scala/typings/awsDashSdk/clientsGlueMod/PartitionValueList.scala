package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionValueList extends js.Object {
  /**
    * The list of values.
    */
  var Values: ValueStringList = js.native
}

object PartitionValueList {
  @scala.inline
  def apply(Values: ValueStringList): PartitionValueList = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PartitionValueList]
  }
}

