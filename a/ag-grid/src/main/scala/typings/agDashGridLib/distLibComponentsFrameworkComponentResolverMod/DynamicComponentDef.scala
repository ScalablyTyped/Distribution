package typings
package agDashGridLib.distLibComponentsFrameworkComponentResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicComponentDef extends js.Object {
  var component: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object DynamicComponentDef {
  @scala.inline
  def apply(component: java.lang.String = null, params: js.Any = null): DynamicComponentDef = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[DynamicComponentDef]
  }
}

