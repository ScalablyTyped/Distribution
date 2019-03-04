package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverrideContext extends js.Object {
  var bindingContext: js.Any
  var parentOverrideContext: OverrideContext
}

object OverrideContext {
  @scala.inline
  def apply(bindingContext: js.Any, parentOverrideContext: OverrideContext): OverrideContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext, parentOverrideContext = parentOverrideContext)
  
    __obj.asInstanceOf[OverrideContext]
  }
}

