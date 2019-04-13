package typings
package angularDashTooltipsLib.angularDashTooltipsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipsConfProvider extends js.Object {
  def configure(options: TooltipsConfProviderOptions): scala.Unit
}

object TooltipsConfProvider {
  @scala.inline
  def apply(configure: TooltipsConfProviderOptions => scala.Unit): TooltipsConfProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
  
    __obj.asInstanceOf[TooltipsConfProvider]
  }
}

