package typings.algoliaCacheCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FallbackableCacheOptions extends js.Object {
  /**
    * List of caches order by priority.
    */
  val caches: js.Array[Cache]
}

object FallbackableCacheOptions {
  @scala.inline
  def apply(caches: js.Array[Cache]): FallbackableCacheOptions = {
    val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FallbackableCacheOptions]
  }
}

