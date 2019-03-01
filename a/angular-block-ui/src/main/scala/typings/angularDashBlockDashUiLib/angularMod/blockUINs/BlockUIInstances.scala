package typings
package angularDashBlockDashUiLib.angularMod.blockUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockUIInstances extends js.Object {
  def get(id: java.lang.String): BlockUIService
}

object BlockUIInstances {
  @scala.inline
  def apply(get: js.Function1[java.lang.String, BlockUIService]): BlockUIInstances = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[BlockUIInstances]
  }
}

