package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  /**
    * Default value is `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Default value is `10`.
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, maxRetries: Int | Double = null): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

