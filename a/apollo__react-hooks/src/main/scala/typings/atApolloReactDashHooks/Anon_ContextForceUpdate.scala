package typings.atApolloReactDashHooks

import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashHooks.libTypesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextForceUpdate[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var forceUpdate: js.Any
  var options: QueryOptions[TData, TVariables]
}

object Anon_ContextForceUpdate {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, forceUpdate: js.Any, options: QueryOptions[TData, TVariables]): Anon_ContextForceUpdate[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = forceUpdate.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ContextForceUpdate[TData, TVariables]]
  }
}

