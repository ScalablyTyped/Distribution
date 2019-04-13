package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderByElement extends js.Object {
  /**
    * The field on which to order.
    */
  var fieldName: String
  /**
    * Ordering direction.
    */
  var sortOrder: js.UndefOr[orderString] = js.undefined
}

object OrderByElement {
  @scala.inline
  def apply(fieldName: String, sortOrder: orderString = null): OrderByElement = {
    val __obj = js.Dynamic.literal(fieldName = fieldName)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderByElement]
  }
}

