package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * True to enable the configuration.
    */
  var Enabled: js.UndefOr[Enabled] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(Enabled: js.UndefOr[Enabled] = js.undefined): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[Configuration]
  }
}

