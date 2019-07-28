package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomHeaders extends js.Object {
  /**
    *  Optional: A list that contains one OriginCustomHeader element for each custom header that you want CloudFront to forward to the origin. If Quantity is 0, omit Items.
    */
  var Items: js.UndefOr[OriginCustomHeadersList] = js.undefined
  /**
    * The number of custom headers, if any, for this distribution.
    */
  var Quantity: integer
}

object CustomHeaders {
  @scala.inline
  def apply(Quantity: integer, Items: OriginCustomHeadersList = null): CustomHeaders = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[CustomHeaders]
  }
}

