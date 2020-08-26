package typings.apolloReactHooks.anon

import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactCommon.typesMod.MutationResult
import typings.apolloReactHooks.typesMod.MutationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[TData, TVariables] extends js.Object {
  var context: ApolloContextValue = js.native
  var options: MutationOptions[TData, TVariables] = js.native
  var result: MutationResult[TData] = js.native
  def setResult(result: MutationResult[TData]): js.Any = js.native
}

object Context {
  @scala.inline
  def apply[TData, TVariables](
    context: ApolloContextValue,
    options: MutationOptions[TData, TVariables],
    result: MutationResult[TData],
    setResult: MutationResult[TData] => js.Any
  ): Context[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], setResult = js.Any.fromFunction1(setResult))
    __obj.asInstanceOf[Context[TData, TVariables]]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context[_, _], TData, TVariables] (val x: Self with (Context[TData, TVariables])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: ApolloContextValue): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: MutationOptions[TData, TVariables]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: MutationResult[TData]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetResult(value: MutationResult[TData] => js.Any): Self = this.set("setResult", js.Any.fromFunction1(value))
  }
  
}

