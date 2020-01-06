package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferingPromotion extends js.Object {
  /**
    * A string that describes the offering promotion.
    */
  var description: js.UndefOr[Message] = js.native
  /**
    * The ID of the offering promotion.
    */
  var id: js.UndefOr[OfferingPromotionIdentifier] = js.native
}

object OfferingPromotion {
  @scala.inline
  def apply(description: Message = null, id: OfferingPromotionIdentifier = null): OfferingPromotion = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferingPromotion]
  }
}

