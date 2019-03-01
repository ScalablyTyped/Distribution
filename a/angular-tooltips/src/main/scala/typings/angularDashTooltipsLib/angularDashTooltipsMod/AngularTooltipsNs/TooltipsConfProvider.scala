package typings
package angularDashTooltipsLib.angularDashTooltipsMod.AngularTooltipsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipsConfProvider extends js.Object {
  def configure(options: TooltipsConfProviderOptions): scala.Unit
}

object TooltipsConfProvider {
  @scala.inline
  def apply(configure: js.Function1[TooltipsConfProviderOptions, scala.Unit]): TooltipsConfProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(configure)
    __obj.asInstanceOf[TooltipsConfProvider]
  }
}

