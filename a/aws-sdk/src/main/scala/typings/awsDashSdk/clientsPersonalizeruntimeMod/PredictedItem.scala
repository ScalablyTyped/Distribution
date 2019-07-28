package typings.awsDashSdk.clientsPersonalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredictedItem extends js.Object {
  /**
    * The recommended item ID.
    */
  var itemId: js.UndefOr[ItemID] = js.undefined
}

object PredictedItem {
  @scala.inline
  def apply(itemId: ItemID = null): PredictedItem = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    __obj.asInstanceOf[PredictedItem]
  }
}

