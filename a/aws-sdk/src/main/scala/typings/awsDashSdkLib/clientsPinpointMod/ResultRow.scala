package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultRow extends js.Object {
  /**
    *  An array of objects that defines the field and field values that were used to group data in a result set that contains multiple results. This value is null if the data in a result set isn’t grouped.
    */
  var GroupedBys: ListOfResultRowValue
  /**
    *  An array of objects that provides pre-aggregated values for a standard metric that applies to an application or campaign.
    */
  var Values: ListOfResultRowValue
}

object ResultRow {
  @scala.inline
  def apply(GroupedBys: ListOfResultRowValue, Values: ListOfResultRowValue): ResultRow = {
    val __obj = js.Dynamic.literal(GroupedBys = GroupedBys, Values = Values)
  
    __obj.asInstanceOf[ResultRow]
  }
}

