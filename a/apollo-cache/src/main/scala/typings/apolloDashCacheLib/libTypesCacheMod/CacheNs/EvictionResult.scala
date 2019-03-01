package typings
package apolloDashCacheLib.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvictionResult extends js.Object {
  var success: scala.Boolean
}

object EvictionResult {
  @scala.inline
  def apply(success: scala.Boolean): EvictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[EvictionResult]
  }
}

