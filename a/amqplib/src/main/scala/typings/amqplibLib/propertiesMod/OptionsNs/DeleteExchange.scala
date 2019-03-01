package typings
package amqplibLib.propertiesMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteExchange extends js.Object {
  var ifUnused: js.UndefOr[scala.Boolean] = js.undefined
}

object DeleteExchange {
  @scala.inline
  def apply(ifUnused: js.UndefOr[scala.Boolean] = js.undefined): DeleteExchange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ifUnused)) __obj.updateDynamic("ifUnused")(ifUnused)
    __obj.asInstanceOf[DeleteExchange]
  }
}

