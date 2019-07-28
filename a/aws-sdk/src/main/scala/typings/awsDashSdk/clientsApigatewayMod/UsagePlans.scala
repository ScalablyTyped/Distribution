package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlans extends js.Object {
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfUsagePlan] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object UsagePlans {
  @scala.inline
  def apply(items: ListOfUsagePlan = null, position: String = null): UsagePlans = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[UsagePlans]
  }
}

