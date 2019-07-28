package typings.apolloDashCache.libTypesCacheMod.CacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvictionResult extends js.Object {
  var success: Boolean
}

object EvictionResult {
  @scala.inline
  def apply(success: Boolean): EvictionResult = {
    val __obj = js.Dynamic.literal(success = success)
  
    __obj.asInstanceOf[EvictionResult]
  }
}

