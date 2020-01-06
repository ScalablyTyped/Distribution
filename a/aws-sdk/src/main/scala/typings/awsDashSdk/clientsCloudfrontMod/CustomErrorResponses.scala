package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomErrorResponses extends js.Object {
  /**
    * A complex type that contains a CustomErrorResponse element for each HTTP status code for which you want to specify a custom error page and/or a caching duration. 
    */
  var Items: js.UndefOr[CustomErrorResponseList] = js.native
  /**
    * The number of HTTP status codes for which you want to specify a custom error page and/or a caching duration. If Quantity is 0, you can omit Items.
    */
  var Quantity: integer = js.native
}

object CustomErrorResponses {
  @scala.inline
  def apply(Quantity: integer, Items: CustomErrorResponseList = null): CustomErrorResponses = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomErrorResponses]
  }
}

