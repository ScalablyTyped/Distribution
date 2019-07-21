package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.apolloDashServerDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext[TContext] extends js.Object {
  var overallCachePolicy: js.UndefOr[
    stdLib.Required[apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheHint]
  ] = js.undefined
}

object GraphQLRequestContext {
  @scala.inline
  def apply[TContext](
    overallCachePolicy: stdLib.Required[apolloDashCacheDashControlLib.apolloDashCacheDashControlMod.CacheHint] = null
  ): GraphQLRequestContext[TContext] = {
    val __obj = js.Dynamic.literal()
    if (overallCachePolicy != null) __obj.updateDynamic("overallCachePolicy")(overallCachePolicy)
    __obj.asInstanceOf[GraphQLRequestContext[TContext]]
  }
}

