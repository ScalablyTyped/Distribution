package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayResponses extends js.Object {
  /**
    * Returns the entire collection, because of no pagination support.
    */
  var items: js.UndefOr[ListOfGatewayResponse] = js.native
  var position: js.UndefOr[String] = js.native
}

object GatewayResponses {
  @scala.inline
  def apply(items: ListOfGatewayResponse = null, position: String = null): GatewayResponses = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayResponses]
  }
}

