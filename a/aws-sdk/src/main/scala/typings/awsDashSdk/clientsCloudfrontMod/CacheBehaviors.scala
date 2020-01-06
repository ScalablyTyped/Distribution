package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheBehaviors extends js.Object {
  /**
    * Optional: A complex type that contains cache behaviors for this distribution. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[CacheBehaviorList] = js.native
  /**
    * The number of cache behaviors for this distribution. 
    */
  var Quantity: integer = js.native
}

object CacheBehaviors {
  @scala.inline
  def apply(Quantity: integer, Items: CacheBehaviorList = null): CacheBehaviors = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheBehaviors]
  }
}

