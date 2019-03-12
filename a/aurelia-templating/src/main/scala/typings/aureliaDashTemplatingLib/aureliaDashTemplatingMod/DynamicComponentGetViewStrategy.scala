package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicComponentGetViewStrategy extends js.Object {
  /**
    * Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
    */
  def getViewStrategy(): java.lang.String | ViewStrategy
}

object DynamicComponentGetViewStrategy {
  @scala.inline
  def apply(getViewStrategy: () => java.lang.String | ViewStrategy): DynamicComponentGetViewStrategy = {
    val __obj = js.Dynamic.literal(getViewStrategy = js.Any.fromFunction0(getViewStrategy))
  
    __obj.asInstanceOf[DynamicComponentGetViewStrategy]
  }
}

