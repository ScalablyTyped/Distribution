package typings
package asyncDashRetryLib.asyncDashRetryMod.AsyncRetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var factor: js.UndefOr[scala.Double] = js.undefined
  var maxTimeout: js.UndefOr[scala.Double] = js.undefined
  var minTimeout: js.UndefOr[scala.Double] = js.undefined
  var onRetry: js.UndefOr[js.Function1[/* e */ stdLib.Error, _]] = js.undefined
  var randomize: js.UndefOr[scala.Boolean] = js.undefined
  var retries: js.UndefOr[scala.Double] = js.undefined
}

