package typings.apolloCacheControl

import typings.apolloCacheControl.mod.CacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCacheHint extends js.Object {
  var cacheHint: CacheHint
  def setCacheHint(hint: CacheHint): Unit
}

object AnonCacheHint {
  @scala.inline
  def apply(cacheHint: CacheHint, setCacheHint: CacheHint => Unit): AnonCacheHint = {
    val __obj = js.Dynamic.literal(cacheHint = cacheHint.asInstanceOf[js.Any], setCacheHint = js.Any.fromFunction1(setCacheHint))
  
    __obj.asInstanceOf[AnonCacheHint]
  }
}

