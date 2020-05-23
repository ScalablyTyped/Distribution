package typings.asyncWriter.mod

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
  def apply(
    last: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): BeginAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginAsyncOptions]
  }
}

