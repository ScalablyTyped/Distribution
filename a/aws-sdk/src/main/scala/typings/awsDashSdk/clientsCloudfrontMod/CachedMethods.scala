package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachedMethods extends js.Object {
  /**
    * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
    */
  var Items: MethodsList
  /**
    * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are 2 (for caching responses to GET and HEAD requests) and 3 (for caching responses to GET, HEAD, and OPTIONS requests).
    */
  var Quantity: integer
}

object CachedMethods {
  @scala.inline
  def apply(Items: MethodsList, Quantity: integer): CachedMethods = {
    val __obj = js.Dynamic.literal(Items = Items, Quantity = Quantity)
  
    __obj.asInstanceOf[CachedMethods]
  }
}

