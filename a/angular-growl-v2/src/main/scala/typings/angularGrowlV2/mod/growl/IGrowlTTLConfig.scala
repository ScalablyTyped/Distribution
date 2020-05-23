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
    error: js.UndefOr[Double] = js.undefined,
    info: js.UndefOr[Double] = js.undefined,
    success: js.UndefOr[Double] = js.undefined,
    warning: js.UndefOr[Double] = js.undefined
  ): IGrowlTTLConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (!js.isUndefined(info)) __obj.updateDynamic("info")(info.get.asInstanceOf[js.Any])
    if (!js.isUndefined(success)) __obj.updateDynamic("success")(success.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warning)) __obj.updateDynamic("warning")(warning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGrowlTTLConfig]
  }
}

