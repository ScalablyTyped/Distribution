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

