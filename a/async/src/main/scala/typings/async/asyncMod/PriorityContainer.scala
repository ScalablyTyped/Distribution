package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityContainer extends js.Object {
  var priority: Double
}

object PriorityContainer {
  @scala.inline
  def apply(priority: Double): PriorityContainer = {
    val __obj = js.Dynamic.literal(priority = priority)
  
    __obj.asInstanceOf[PriorityContainer]
  }
}

