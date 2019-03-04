package typings
package atAngularRouterLib.srcConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMatchResult extends js.Object {
  var consumed: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment]
  var posParams: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment]
  ] = js.undefined
}

object UrlMatchResult {
  @scala.inline
  def apply(
    consumed: js.Array[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment],
    posParams: org.scalablytyped.runtime.StringDictionary[atAngularRouterLib.srcUrlUnderscoreTreeMod.UrlSegment] = null
  ): UrlMatchResult = {
    val __obj = js.Dynamic.literal(consumed = consumed)
    if (posParams != null) __obj.updateDynamic("posParams")(posParams)
    __obj.asInstanceOf[UrlMatchResult]
  }
}

