package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.SilentOption {
  /**
    * The index at which to add the models.
    */
  var at: js.UndefOr[scala.Double] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(at: scala.Int | scala.Double = null, silent: js.UndefOr[scala.Boolean] = js.undefined): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (at != null) __obj.updateDynamic("at")(at.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[AddOptions]
  }
}

