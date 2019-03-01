package typings
package awsDashSdkLib.libSharedDashIniIniDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFileOptions extends js.Object {
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var isConfig: js.UndefOr[scala.Boolean] = js.undefined
}

object LoadFileOptions {
  @scala.inline
  def apply(filename: java.lang.String = null, isConfig: js.UndefOr[scala.Boolean] = js.undefined): LoadFileOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (!js.isUndefined(isConfig)) __obj.updateDynamic("isConfig")(isConfig)
    __obj.asInstanceOf[LoadFileOptions]
  }
}

