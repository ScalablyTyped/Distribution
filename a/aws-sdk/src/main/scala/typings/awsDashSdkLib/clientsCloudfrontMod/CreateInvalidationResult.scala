package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInvalidationResult extends js.Object {
  /**
    * The invalidation's information.
    */
  var Invalidation: js.UndefOr[Invalidation] = js.undefined
  /**
    * The fully qualified URI of the distribution and invalidation batch request, including the Invalidation ID.
    */
  var Location: js.UndefOr[java.lang.String] = js.undefined
}

object CreateInvalidationResult {
  @scala.inline
  def apply(Invalidation: Invalidation = null, Location: java.lang.String = null): CreateInvalidationResult = {
    val __obj = js.Dynamic.literal()
    if (Invalidation != null) __obj.updateDynamic("Invalidation")(Invalidation)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[CreateInvalidationResult]
  }
}

