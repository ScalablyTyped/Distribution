package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryDelayOptions extends js.Object {
  /**
    * The base number of milliseconds to use in the exponential backoff for operation retries.
    * Defaults to 100 ms.
    */
  var base: js.UndefOr[scala.Double] = js.undefined
  /**
    * A custom function that accepts a retry count and returns the amount of time to delay in milliseconds.
    * The base option will be ignored if this option is supplied.
    */
  var customBackoff: js.UndefOr[js.Function1[/* retryCount */ scala.Double, scala.Double]] = js.undefined
}

