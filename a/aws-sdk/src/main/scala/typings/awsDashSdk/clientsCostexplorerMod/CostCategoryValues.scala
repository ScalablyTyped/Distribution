package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CostCategoryValues extends js.Object {
  var Key: js.UndefOr[CostCategoryName] = js.native
  /**
    * The specific value of the Cost Category.
    */
  var Values: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Values] = js.native
}

object CostCategoryValues {
  @scala.inline
  def apply(Key: CostCategoryName = null, Values: Values = null): CostCategoryValues = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[CostCategoryValues]
  }
}

