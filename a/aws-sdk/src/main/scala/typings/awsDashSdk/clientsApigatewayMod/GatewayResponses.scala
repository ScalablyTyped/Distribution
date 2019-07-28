package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatewayResponses extends js.Object {
  /**
    * Returns the entire collection, because of no pagination support.
    */
  var items: js.UndefOr[ListOfGatewayResponse] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object GatewayResponses {
  @scala.inline
  def apply(items: ListOfGatewayResponse = null, position: String = null): GatewayResponses = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GatewayResponses]
  }
}

