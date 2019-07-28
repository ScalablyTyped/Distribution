package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInvalidationResult extends js.Object {
  /**
    * The invalidation's information. For more information, see Invalidation Complex Type. 
    */
  var Invalidation: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.Invalidation] = js.undefined
}

object GetInvalidationResult {
  @scala.inline
  def apply(Invalidation: Invalidation = null): GetInvalidationResult = {
    val __obj = js.Dynamic.literal()
    if (Invalidation != null) __obj.updateDynamic("Invalidation")(Invalidation)
    __obj.asInstanceOf[GetInvalidationResult]
  }
}

