package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceModel[S] extends js.Object {
  var interceptResponse: js.UndefOr[
    js.Function3[/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any, _]
  ] = js.undefined
  var loading: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var local: js.UndefOr[js.Function2[/* state */ js.Any, /* repeated */ js.Any, _]] = js.undefined
  var shouldFetch: js.UndefOr[
    js.Function1[/* fetchFn */ js.Function1[/* repeated */ js.Any, scala.Boolean], scala.Unit]
  ] = js.undefined
  def error(args: js.Any): scala.Unit
  def remote(state: js.Any, args: js.Any*): js.Promise[S]
  def success(state: S): scala.Unit
}

object SourceModel {
  @scala.inline
  def apply[S](
    error: js.Function1[js.Any, scala.Unit],
    remote: js.Function2[js.Any, /* repeated */ js.Any, js.Promise[S]],
    success: js.Function1[S, scala.Unit],
    interceptResponse: js.Function3[/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any, _] = null,
    loading: js.Function1[/* args */ js.Any, scala.Unit] = null,
    local: js.Function2[/* state */ js.Any, /* repeated */ js.Any, _] = null,
    shouldFetch: js.Function1[/* fetchFn */ js.Function1[/* repeated */ js.Any, scala.Boolean], scala.Unit] = null
  ): SourceModel[S] = {
    val __obj = js.Dynamic.literal(error = error, remote = remote, success = success)
    if (interceptResponse != null) __obj.updateDynamic("interceptResponse")(interceptResponse)
    if (loading != null) __obj.updateDynamic("loading")(loading)
    if (local != null) __obj.updateDynamic("local")(local)
    if (shouldFetch != null) __obj.updateDynamic("shouldFetch")(shouldFetch)
    __obj.asInstanceOf[SourceModel[S]]
  }
}

