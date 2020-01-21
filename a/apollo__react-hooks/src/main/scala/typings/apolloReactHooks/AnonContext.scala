package typings.apolloReactHooks

import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactCommon.typesMod.MutationResult
import typings.apolloReactHooks.typesMod.MutationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var options: MutationOptions[TData, TVariables]
  var result: MutationResult[TData]
  def setResult(result: MutationResult[TData]): js.Any
}

object AnonContext {
  @scala.inline
  def apply[TData, TVariables](
    context: ApolloContextValue,
    options: MutationOptions[TData, TVariables],
    result: MutationResult[TData],
    setResult: MutationResult[TData] => js.Any
  ): AnonContext[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], setResult = js.Any.fromFunction1(setResult))
  
    __obj.asInstanceOf[AnonContext[TData, TVariables]]
  }
}

