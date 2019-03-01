package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheControlFormat extends js.Object {
  var hints: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[apolloDashCacheDashControlLib.Anon_Path with CacheHint]
  var version: apolloDashCacheDashControlLib.apolloDashCacheDashControlLibNumbers.`1`
}

object CacheControlFormat {
  @scala.inline
  def apply(
    hints: apolloDashEnvLib.libPolyfillsArrayMod.Global.Array[apolloDashCacheDashControlLib.Anon_Path with CacheHint],
    version: apolloDashCacheDashControlLib.apolloDashCacheDashControlLibNumbers.`1`
  ): CacheControlFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hints")(hints)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[CacheControlFormat]
  }
}

