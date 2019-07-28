package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheBehaviors extends js.Object {
  /**
    * Optional: A complex type that contains cache behaviors for this distribution. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[CacheBehaviorList] = js.undefined
  /**
    * The number of cache behaviors for this distribution. 
    */
  var Quantity: integer
}

object CacheBehaviors {
  @scala.inline
  def apply(Quantity: integer, Items: CacheBehaviorList = null): CacheBehaviors = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[CacheBehaviors]
  }
}

