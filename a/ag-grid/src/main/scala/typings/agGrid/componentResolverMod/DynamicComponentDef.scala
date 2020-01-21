package typings.agGrid.componentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicComponentDef extends js.Object {
  var component: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object DynamicComponentDef {
  @scala.inline
  def apply(component: String = null, params: js.Any = null): DynamicComponentDef = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicComponentDef]
  }
}

