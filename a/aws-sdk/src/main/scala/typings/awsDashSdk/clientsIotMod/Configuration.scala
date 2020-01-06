package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * True to enable the configuration.
    */
  var Enabled: js.UndefOr[typings.awsDashSdk.clientsIotMod.Enabled] = js.native
}

object Configuration {
  @scala.inline
  def apply(Enabled: js.UndefOr[scala.Boolean] = js.undefined): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

