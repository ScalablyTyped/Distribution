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
    error: js.Any => scala.Unit,
    remote: (js.Any, /* repeated */ js.Any) => js.Promise[S],
    success: S => scala.Unit,
    interceptResponse: (/* response */ js.Any, /* action */ Action[_], /* repeated */ js.Any) => _ = null,
    loading: /* args */ js.Any => scala.Unit = null,
    local: (/* state */ js.Any, /* repeated */ js.Any) => _ = null,
    shouldFetch: /* fetchFn */ js.Function1[/* repeated */ js.Any, scala.Boolean] => scala.Unit = null
  ): SourceModel[S] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), remote = js.Any.fromFunction2(remote), success = js.Any.fromFunction1(success))
    if (interceptResponse != null) __obj.updateDynamic("interceptResponse")(js.Any.fromFunction3(interceptResponse))
    if (loading != null) __obj.updateDynamic("loading")(js.Any.fromFunction1(loading))
    if (local != null) __obj.updateDynamic("local")(js.Any.fromFunction2(local))
    if (shouldFetch != null) __obj.updateDynamic("shouldFetch")(js.Any.fromFunction1(shouldFetch))
    __obj.asInstanceOf[SourceModel[S]]
  }
}

