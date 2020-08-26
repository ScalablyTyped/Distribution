package typings.apolloClient.observableToPromiseMod

import typings.apolloClient.observableQueryMod.ObservableQuery
import typings.apolloClient.typesMod.OperationVariables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var errorCallbacks: js.UndefOr[js.Array[js.Function1[/* error */ Error, _]]] = js.native
  var observable: ObservableQuery[_, OperationVariables] = js.native
  var shouldResolve: js.UndefOr[Boolean] = js.native
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(observable: ObservableQuery[_, OperationVariables]): Options = {
    val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setObservable(value: ObservableQuery[_, OperationVariables]): Self = this.set("observable", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCallbacksVarargs(value: (js.Function1[/* error */ Error, js.Any])*): Self = this.set("errorCallbacks", js.Array(value :_*))
    @scala.inline
    def setErrorCallbacks(value: js.Array[js.Function1[/* error */ Error, _]]): Self = this.set("errorCallbacks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCallbacks: Self = this.set("errorCallbacks", js.undefined)
    @scala.inline
    def setShouldResolve(value: Boolean): Self = this.set("shouldResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldResolve: Self = this.set("shouldResolve", js.undefined)
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
  
}

