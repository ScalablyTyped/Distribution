package typings
package asyncblockLib.underscoreAbNs.abNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  var dontWait: js.UndefOr[scala.Boolean] = js.undefined
  var firstArgIsError: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreError: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var responseFormat: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var timeoutIsError: js.UndefOr[scala.Boolean] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(
    dontWait: js.UndefOr[scala.Boolean] = js.undefined,
    firstArgIsError: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreError: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.Any = null,
    responseFormat: js.Array[java.lang.String] = null,
    timeout: scala.Int | scala.Double = null,
    timeoutIsError: js.UndefOr[scala.Boolean] = js.undefined
  ): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dontWait)) __obj.updateDynamic("dontWait")(dontWait)
    if (!js.isUndefined(firstArgIsError)) __obj.updateDynamic("firstArgIsError")(firstArgIsError)
    if (!js.isUndefined(ignoreError)) __obj.updateDynamic("ignoreError")(ignoreError)
    if (key != null) __obj.updateDynamic("key")(key)
    if (responseFormat != null) __obj.updateDynamic("responseFormat")(responseFormat)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIsError)) __obj.updateDynamic("timeoutIsError")(timeoutIsError)
    __obj.asInstanceOf[TaskOptions]
  }
}

