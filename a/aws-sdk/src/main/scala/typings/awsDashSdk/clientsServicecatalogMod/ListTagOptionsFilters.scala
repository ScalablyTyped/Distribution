package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagOptionsFilters extends js.Object {
  /**
    * The active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.undefined
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.undefined
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.undefined
}

object ListTagOptionsFilters {
  @scala.inline
  def apply(Active: js.UndefOr[Boolean] = js.undefined, Key: TagOptionKey = null, Value: TagOptionValue = null): ListTagOptionsFilters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Active)) __obj.updateDynamic("Active")(Active)
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[ListTagOptionsFilters]
  }
}

