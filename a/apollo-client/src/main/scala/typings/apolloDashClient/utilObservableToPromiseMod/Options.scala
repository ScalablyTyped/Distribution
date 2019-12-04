package typings.apolloDashClient.utilObservableToPromiseMod

import typings.apolloDashClient.coreObservableQueryMod.ObservableQuery
import typings.apolloDashClient.coreTypesMod.OperationVariables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var errorCallbacks: js.UndefOr[js.Array[js.Function1[/* error */ Error, _]]] = js.undefined
  var observable: ObservableQuery[_, OperationVariables]
  var shouldResolve: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    observable: ObservableQuery[_, OperationVariables],
    errorCallbacks: js.Array[js.Function1[/* error */ Error, _]] = null,
    shouldResolve: js.UndefOr[Boolean] = js.undefined,
    wait: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(observable = observable.asInstanceOf[js.Any])
    if (errorCallbacks != null) __obj.updateDynamic("errorCallbacks")(errorCallbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldResolve)) __obj.updateDynamic("shouldResolve")(shouldResolve.asInstanceOf[js.Any])
    if (wait != null) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

