package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryGroup extends js.Object {
  /**
    * Filters define the criteria for the group. The matchingCount field displays the number of resources that match the criteria. The notMatchingCount field displays the number of resources that don't match the criteria. 
    */
  var Filters: InventoryFilterList
  /**
    * The name of the group.
    */
  var Name: InventoryGroupName
}

object InventoryGroup {
  @scala.inline
  def apply(Filters: InventoryFilterList, Name: InventoryGroupName): InventoryGroup = {
    val __obj = js.Dynamic.literal(Filters = Filters, Name = Name)
  
    __obj.asInstanceOf[InventoryGroup]
  }
}

