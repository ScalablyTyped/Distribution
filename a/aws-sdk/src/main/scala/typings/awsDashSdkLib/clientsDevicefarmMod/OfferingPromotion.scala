package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferingPromotion extends js.Object {
  /**
    * A string describing the offering promotion.
    */
  var description: js.UndefOr[Message] = js.undefined
  /**
    * The ID of the offering promotion.
    */
  var id: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
}

object OfferingPromotion {
  @scala.inline
  def apply(description: Message = null, id: OfferingPromotionIdentifier = null): OfferingPromotion = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[OfferingPromotion]
  }
}

