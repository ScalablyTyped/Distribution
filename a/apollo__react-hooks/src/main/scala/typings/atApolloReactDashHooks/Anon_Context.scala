package typings.atApolloReactDashHooks

import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashHooks.libTypesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var forceUpdate: js.Any
  var options: QueryOptions[TData, TVariables]
}

object Anon_Context {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, forceUpdate: js.Any, options: QueryOptions[TData, TVariables]): Anon_Context[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context, forceUpdate = forceUpdate, options = options)
  
    __obj.asInstanceOf[Anon_Context[TData, TVariables]]
  }
}

