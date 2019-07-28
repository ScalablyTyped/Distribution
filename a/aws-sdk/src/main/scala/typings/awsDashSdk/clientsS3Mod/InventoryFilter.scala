package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryFilter extends js.Object {
  /**
    * The prefix that an object must have to be included in the inventory results.
    */
  var Prefix: typings.awsDashSdk.clientsS3Mod.Prefix
}

object InventoryFilter {
  @scala.inline
  def apply(Prefix: Prefix): InventoryFilter = {
    val __obj = js.Dynamic.literal(Prefix = Prefix)
  
    __obj.asInstanceOf[InventoryFilter]
  }
}

