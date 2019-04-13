package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieNames extends js.Object {
  /**
    * A complex type that contains one Name element for each cookie that you want CloudFront to forward to the origin for this cache behavior.
    */
  var Items: js.UndefOr[CookieNameList] = js.undefined
  /**
    * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior.
    */
  var Quantity: integer
}

object CookieNames {
  @scala.inline
  def apply(Quantity: integer, Items: CookieNameList = null): CookieNames = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[CookieNames]
  }
}

