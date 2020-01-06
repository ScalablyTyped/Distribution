package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginGroups extends js.Object {
  /**
    * The items (origin groups) in a distribution.
    */
  var Items: js.UndefOr[OriginGroupList] = js.native
  /**
    * The number of origin groups.
    */
  var Quantity: integer = js.native
}

object OriginGroups {
  @scala.inline
  def apply(Quantity: integer, Items: OriginGroupList = null): OriginGroups = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginGroups]
  }
}

