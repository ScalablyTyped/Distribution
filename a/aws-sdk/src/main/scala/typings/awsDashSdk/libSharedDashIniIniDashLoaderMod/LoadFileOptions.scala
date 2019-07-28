package typings.awsDashSdk.libSharedDashIniIniDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFileOptions extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var isConfig: js.UndefOr[Boolean] = js.undefined
}

object LoadFileOptions {
  @scala.inline
  def apply(filename: String = null, isConfig: js.UndefOr[Boolean] = js.undefined): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(isConfig)) __obj.updateDynamic("isConfig")(isConfig)
    __obj.asInstanceOf[LoadFileOptions]
  }
}

