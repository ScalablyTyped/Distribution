package typings.awsDashSdk.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderByElement extends js.Object {
  /**
    * The field on which to order.
    */
  var fieldName: String = js.native
  /**
    * Ordering direction.
    */
  var sortOrder: js.UndefOr[orderString] = js.native
}

object OrderByElement {
  @scala.inline
  def apply(fieldName: String, sortOrder: orderString = null): OrderByElement = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderByElement]
  }
}

