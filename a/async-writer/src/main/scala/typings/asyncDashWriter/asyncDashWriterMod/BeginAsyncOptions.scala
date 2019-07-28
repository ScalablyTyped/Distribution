package typings.asyncDashWriter.asyncDashWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginAsyncOptions extends js.Object {
  var last: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object BeginAsyncOptions {
  @scala.inline
  def apply(last: js.UndefOr[Boolean] = js.undefined, name: String = null, timeout: Int | Double = null): BeginAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (name != null) __obj.updateDynamic("name")(name)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginAsyncOptions]
  }
}

