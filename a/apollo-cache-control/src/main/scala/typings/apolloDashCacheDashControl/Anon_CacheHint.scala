package typings.apolloDashCacheDashControl

import typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.CacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheHint extends js.Object {
  var cacheHint: CacheHint
  def setCacheHint(hint: CacheHint): Unit
}

object Anon_CacheHint {
  @scala.inline
  def apply(cacheHint: CacheHint, setCacheHint: CacheHint => Unit): Anon_CacheHint = {
    val __obj = js.Dynamic.literal(cacheHint = cacheHint, setCacheHint = js.Any.fromFunction1(setCacheHint))
  
    __obj.asInstanceOf[Anon_CacheHint]
  }
}

