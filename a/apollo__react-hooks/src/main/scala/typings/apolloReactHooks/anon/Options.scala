package typings.apolloReactHooks.anon

import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactHooks.typesMod.SubscriptionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[TData, TVariables] extends js.Object {
  var context: ApolloContextValue = js.native
  var options: SubscriptionOptions[TData, TVariables] = js.native
  var setResult: js.Any = js.native
}

object Options {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, options: SubscriptionOptions[TData, TVariables], setResult: js.Any): Options[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setResult = setResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[TData, TVariables]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], TData, TVariables] (val x: Self with (Options[TData, TVariables])) extends AnyVal {
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
    def setOptions(value: SubscriptionOptions[TData, TVariables]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetResult(value: js.Any): Self = this.set("setResult", value.asInstanceOf[js.Any])
  }
  
}

