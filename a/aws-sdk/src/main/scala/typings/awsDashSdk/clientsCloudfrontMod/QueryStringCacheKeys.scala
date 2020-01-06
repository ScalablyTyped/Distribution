package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStringCacheKeys extends js.Object {
  /**
    * A list that contains the query string parameters that you want CloudFront to use as a basis for caching for a cache behavior. If Quantity is 0, you can omit Items. 
    */
  var Items: js.UndefOr[QueryStringCacheKeysList] = js.native
  /**
    * The number of whitelisted query string parameters for a cache behavior.
    */
  var Quantity: integer = js.native
}

object QueryStringCacheKeys {
  @scala.inline
  def apply(Quantity: integer, Items: QueryStringCacheKeysList = null): QueryStringCacheKeys = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStringCacheKeys]
  }
}

