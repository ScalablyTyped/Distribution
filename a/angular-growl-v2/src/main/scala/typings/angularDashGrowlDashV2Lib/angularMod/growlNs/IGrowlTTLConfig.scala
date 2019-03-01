package typings
package angularDashGrowlDashV2Lib.angularMod.growlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global Time-To-Leave configuration.
  */
trait IGrowlTTLConfig extends js.Object {
  var error: js.UndefOr[scala.Double] = js.undefined
  var info: js.UndefOr[scala.Double] = js.undefined
  var success: js.UndefOr[scala.Double] = js.undefined
  var warning: js.UndefOr[scala.Double] = js.undefined
}

object IGrowlTTLConfig {
  @scala.inline
  def apply(
    error: scala.Int | scala.Double = null,
    info: scala.Int | scala.Double = null,
    success: scala.Int | scala.Double = null,
    warning: scala.Int | scala.Double = null
  ): IGrowlTTLConfig = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrowlTTLConfig]
  }
}

