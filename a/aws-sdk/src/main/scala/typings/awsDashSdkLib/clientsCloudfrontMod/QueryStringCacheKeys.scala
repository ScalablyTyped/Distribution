package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringCacheKeys extends js.Object {
  /**
    * (Optional) A list that contains the query string parameters that you want CloudFront to use as a basis for caching for this cache behavior. If Quantity is 0, you can omit Items. 
    */
  var Items: js.UndefOr[QueryStringCacheKeysList] = js.undefined
  /**
    * The number of whitelisted query string parameters for this cache behavior.
    */
  var Quantity: integer
}

object QueryStringCacheKeys {
  @scala.inline
  def apply(Quantity: integer, Items: QueryStringCacheKeysList = null): QueryStringCacheKeys = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[QueryStringCacheKeys]
  }
}

