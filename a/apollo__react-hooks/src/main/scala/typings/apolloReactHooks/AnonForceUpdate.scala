package typings.apolloReactHooks

import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactHooks.typesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceUpdate[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var forceUpdate: js.Any
  var options: QueryOptions[TData, TVariables]
}

object AnonForceUpdate {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, forceUpdate: js.Any, options: QueryOptions[TData, TVariables]): AnonForceUpdate[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], forceUpdate = forceUpdate.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonForceUpdate[TData, TVariables]]
  }
}

