package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimitiveDefinition extends js.Object {
  var defaultComponents: js.UndefOr[js.Any] = js.undefined
   // TODO cleanup type
  var deprecated: js.UndefOr[Boolean] = js.undefined
  var mappings: js.UndefOr[js.Any] = js.undefined
   // TODO cleanup type
  var transforms: js.UndefOr[js.Any] = js.undefined
}

object PrimitiveDefinition {
  @scala.inline
  def apply(
    defaultComponents: js.Any = null,
    deprecated: js.UndefOr[Boolean] = js.undefined,
    mappings: js.Any = null,
    transforms: js.Any = null
  ): PrimitiveDefinition = {
    val __obj = js.Dynamic.literal()
    if (defaultComponents != null) __obj.updateDynamic("defaultComponents")(defaultComponents.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (mappings != null) __obj.updateDynamic("mappings")(mappings.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimitiveDefinition]
  }
}

