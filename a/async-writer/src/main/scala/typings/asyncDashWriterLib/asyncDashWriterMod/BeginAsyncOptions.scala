package typings
package asyncDashWriterLib.asyncDashWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginAsyncOptions extends js.Object {
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object BeginAsyncOptions {
  @scala.inline
  def apply(
    last: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): BeginAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (name != null) __obj.updateDynamic("name")(name)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginAsyncOptions]
  }
}

