package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginGroups extends js.Object {
  /**
    * The items (origin groups) in a distribution.
    */
  var Items: js.UndefOr[OriginGroupList] = js.undefined
  /**
    * The number of origin groups.
    */
  var Quantity: integer
}

object OriginGroups {
  @scala.inline
  def apply(Quantity: integer, Items: OriginGroupList = null): OriginGroups = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[OriginGroups]
  }
}

