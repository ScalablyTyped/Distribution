package typings.asyncblock._ab.ab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  var dontWait: js.UndefOr[Boolean] = js.undefined
  var firstArgIsError: js.UndefOr[Boolean] = js.undefined
  var ignoreError: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var responseFormat: js.UndefOr[js.Array[String]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var timeoutIsError: js.UndefOr[Boolean] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(
    dontWait: js.UndefOr[Boolean] = js.undefined,
    firstArgIsError: js.UndefOr[Boolean] = js.undefined,
    ignoreError: js.UndefOr[Boolean] = js.undefined,
    key: js.Any = null,
    responseFormat: js.Array[String] = null,
    timeout: Int | Double = null,
    timeoutIsError: js.UndefOr[Boolean] = js.undefined
  ): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dontWait)) __obj.updateDynamic("dontWait")(dontWait.asInstanceOf[js.Any])
    if (!js.isUndefined(firstArgIsError)) __obj.updateDynamic("firstArgIsError")(firstArgIsError.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreError)) __obj.updateDynamic("ignoreError")(ignoreError.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (responseFormat != null) __obj.updateDynamic("responseFormat")(responseFormat.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutIsError)) __obj.updateDynamic("timeoutIsError")(timeoutIsError.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskOptions]
  }
}

