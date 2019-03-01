package typings
package asyncLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityContainer extends js.Object {
  var priority: scala.Double
}

object PriorityContainer {
  @scala.inline
  def apply(priority: scala.Double): PriorityContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("priority")(priority)
    __obj.asInstanceOf[PriorityContainer]
  }
}

