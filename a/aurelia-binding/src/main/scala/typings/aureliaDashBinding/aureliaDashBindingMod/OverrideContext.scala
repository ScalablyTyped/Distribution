package typings.aureliaDashBinding.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverrideContext extends js.Object {
  var bindingContext: js.Any
  var parentOverrideContext: js.UndefOr[OverrideContext] = js.undefined
}

object OverrideContext {
  @scala.inline
  def apply(bindingContext: js.Any, parentOverrideContext: OverrideContext = null): OverrideContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any])
    if (parentOverrideContext != null) __obj.updateDynamic("parentOverrideContext")(parentOverrideContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideContext]
  }
}

