package typings.apolloReactHooks.anon

import typings.apolloReactCommon.apolloContextMod.ApolloContextValue
import typings.apolloReactHooks.typesMod.QueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnNewData[TData, TVariables] extends js.Object {
  var context: ApolloContextValue = js.native
  var options: QueryOptions[TData, TVariables] = js.native
  def onNewData(): Unit = js.native
}

object OnNewData {
  @scala.inline
  def apply[TData, TVariables](context: ApolloContextValue, onNewData: () => Unit, options: QueryOptions[TData, TVariables]): OnNewData[TData, TVariables] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], onNewData = js.Any.fromFunction0(onNewData), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnNewData[TData, TVariables]]
  }
  @scala.inline
  implicit class OnNewDataOps[Self <: OnNewData[_, _], TData, TVariables] (val x: Self with (OnNewData[TData, TVariables])) extends AnyVal {
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
    def setOnNewData(value: () => Unit): Self = this.set("onNewData", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: QueryOptions[TData, TVariables]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

