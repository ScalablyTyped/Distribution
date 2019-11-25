package typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.apolloDashServerDashTypesMod

import typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod.CacheHint
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext[TContext] extends js.Object {
  var overallCachePolicy: js.UndefOr[Required[CacheHint]] = js.undefined
}

object GraphQLRequestContext {
  @scala.inline
  def apply[TContext](overallCachePolicy: Required[CacheHint] = null): GraphQLRequestContext[TContext] = {
    val __obj = js.Dynamic.literal()
    if (overallCachePolicy != null) __obj.updateDynamic("overallCachePolicy")(overallCachePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestContext[TContext]]
  }
}

