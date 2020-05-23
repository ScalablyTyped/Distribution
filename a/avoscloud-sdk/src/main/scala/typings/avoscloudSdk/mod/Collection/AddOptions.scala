package typings.avoscloudSdk.mod.Collection

import typings.avoscloudSdk.mod.SilentOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends SilentOption {
  /**
    * The index at which to add the models.
    */
  var at: js.UndefOr[Double] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(at: js.UndefOr[Double] = js.undefined, silent: js.UndefOr[Boolean] = js.undefined): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(at)) __obj.updateDynamic("at")(at.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOptions]
  }
}

