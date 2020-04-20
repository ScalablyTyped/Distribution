package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasCacheKey extends js.Object {
  /**
    * An object for manipulating this requests cache key. Only present during `onClientRequest()`.
    */
  val cacheKey: CacheKey
}

object HasCacheKey {
  @scala.inline
  def apply(cacheKey: CacheKey): HasCacheKey = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasCacheKey]
  }
}

