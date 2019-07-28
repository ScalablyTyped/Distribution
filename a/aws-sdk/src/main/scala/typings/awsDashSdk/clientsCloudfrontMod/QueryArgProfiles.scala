package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryArgProfiles extends js.Object {
  /**
    * Number of items for query argument-profile mapping for field-level encryption.
    */
  var Items: js.UndefOr[QueryArgProfileList] = js.undefined
  /**
    * Number of profiles for query argument-profile mapping for field-level encryption.
    */
  var Quantity: integer
}

object QueryArgProfiles {
  @scala.inline
  def apply(Quantity: integer, Items: QueryArgProfileList = null): QueryArgProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[QueryArgProfiles]
  }
}

