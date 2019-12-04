package typings.atApolloReactDashHooks

import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashHooks.libTypesMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextOptions[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var options: SubscriptionOptions[TData, TVariables]
  var setResult: js.Any
}

object Anon_ContextOptions {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, options: SubscriptionOptions[TData, TVariables], setResult: js.Any): Anon_ContextOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setResult = setResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContextOptions[TData, TVariables]]
  }
}

