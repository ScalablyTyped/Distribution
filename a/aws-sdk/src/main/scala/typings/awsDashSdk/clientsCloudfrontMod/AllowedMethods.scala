package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedMethods extends js.Object {
  var CachedMethods: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CachedMethods] = js.native
  /**
    * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
    */
  var Items: MethodsList = js.native
  /**
    * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET, HEAD, and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE requests).
    */
  var Quantity: integer = js.native
}

object AllowedMethods {
  @scala.inline
  def apply(Items: MethodsList, Quantity: integer, CachedMethods: CachedMethods = null): AllowedMethods = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (CachedMethods != null) __obj.updateDynamic("CachedMethods")(CachedMethods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedMethods]
  }
}

