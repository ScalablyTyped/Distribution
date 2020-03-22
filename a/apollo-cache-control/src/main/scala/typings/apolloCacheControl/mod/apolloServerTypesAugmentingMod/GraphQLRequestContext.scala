package typings.apolloCacheControl.mod.apolloServerTypesAugmentingMod

import typings.apolloCacheControl.RequiredCacheHint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext[TContext] extends js.Object {
  var overallCachePolicy: js.UndefOr[RequiredCacheHint] = js.undefined
}

object GraphQLRequestContext {
  @scala.inline
  def apply[TContext](overallCachePolicy: RequiredCacheHint = null): GraphQLRequestContext[TContext] = {
    val __obj = js.Dynamic.literal()
    if (overallCachePolicy != null) __obj.updateDynamic("overallCachePolicy")(overallCachePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestContext[TContext]]
  }
}

