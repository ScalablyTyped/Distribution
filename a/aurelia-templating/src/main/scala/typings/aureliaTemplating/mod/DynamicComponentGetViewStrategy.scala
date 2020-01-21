package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicComponentGetViewStrategy extends js.Object {
  /**
    * Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
    */
  def getViewStrategy(): String | ViewStrategy_
}

object DynamicComponentGetViewStrategy {
  @scala.inline
  def apply(getViewStrategy: () => String | ViewStrategy_): DynamicComponentGetViewStrategy = {
    val __obj = js.Dynamic.literal(getViewStrategy = js.Any.fromFunction0(getViewStrategy))
  
    __obj.asInstanceOf[DynamicComponentGetViewStrategy]
  }
}

