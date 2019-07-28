package typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod

import typings.apolloDashCacheDashControl.Anon_Path
import typings.apolloDashCacheDashControl.apolloDashCacheDashControlNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheControlFormat extends js.Object {
  var hints: js.Array[Anon_Path with CacheHint]
  var version: `1`
}

object CacheControlFormat {
  @scala.inline
  def apply(hints: js.Array[Anon_Path with CacheHint], version: `1`): CacheControlFormat = {
    val __obj = js.Dynamic.literal(hints = hints, version = version)
  
    __obj.asInstanceOf[CacheControlFormat]
  }
}

