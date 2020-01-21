package typings.angularGrowlV2.mod.growl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global Time-To-Leave configuration.
  */
trait IGrowlTTLConfig extends js.Object {
  var error: js.UndefOr[Double] = js.undefined
  var info: js.UndefOr[Double] = js.undefined
  var success: js.UndefOr[Double] = js.undefined
  var warning: js.UndefOr[Double] = js.undefined
}

object IGrowlTTLConfig {
  @scala.inline
  def apply(
    error: Int | Double = null,
    info: Int | Double = null,
    success: Int | Double = null,
    warning: Int | Double = null
  ): IGrowlTTLConfig = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrowlTTLConfig]
  }
}

