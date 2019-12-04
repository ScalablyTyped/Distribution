package typings.atApolloReactDashHooks

import typings.atApolloReactDashCommon.libContextApolloContextMod.ApolloContextValue
import typings.atApolloReactDashCommon.libTypesTypesMod.MutationResult
import typings.atApolloReactDashHooks.libTypesMod.MutationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TData, TVariables] extends js.Object {
  var context: ApolloContextValue
  var options: MutationOptions[TData, TVariables]
  var result: MutationResult[TData]
  def setResult(result: MutationResult[TData]): js.Any
}

object Anon_Context {
  @scala.inline
  def apply[TData, TVariables](
    context: ApolloContextValue,
    options: MutationOptions[TData, TVariables],
    result: MutationResult[TData],
    setResult: MutationResult[TData] => js.Any
  ): Anon_Context[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], setResult = js.Any.fromFunction1(setResult))
  
    __obj.asInstanceOf[Anon_Context[TData, TVariables]]
  }
}

