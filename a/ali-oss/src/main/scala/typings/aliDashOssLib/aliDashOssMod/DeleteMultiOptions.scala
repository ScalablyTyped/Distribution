package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMultiOptions extends js.Object {
  var quite: js.UndefOr[scala.Boolean] = js.undefined
   // quite mode or verbose mode, default is false
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object DeleteMultiOptions {
  @scala.inline
  def apply(quite: js.UndefOr[scala.Boolean] = js.undefined, timeout: scala.Int | scala.Double = null): DeleteMultiOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quite)) __obj.updateDynamic("quite")(quite)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiOptions]
  }
}

