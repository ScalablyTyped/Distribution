package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanKeys extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfUsagePlanKey] = js.native
  var position: js.UndefOr[String] = js.native
}

object UsagePlanKeys {
  @scala.inline
  def apply(items: ListOfUsagePlanKey = null, position: String = null): UsagePlanKeys = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanKeys]
  }
}

