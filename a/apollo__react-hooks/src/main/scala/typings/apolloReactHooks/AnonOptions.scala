package typings.apolloReactHooks

import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactHooks.typesMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var options: SubscriptionOptions[TData, TVariables]
  var setResult: js.Any
}

object AnonOptions {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, options: SubscriptionOptions[TData, TVariables], setResult: js.Any): AnonOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setResult = setResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions[TData, TVariables]]
  }
}

