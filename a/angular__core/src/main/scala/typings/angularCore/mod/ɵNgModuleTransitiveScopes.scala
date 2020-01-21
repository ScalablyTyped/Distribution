package typings.angularCore.mod

import typings.angularCore.AnonDirectives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵNgModuleTransitiveScopes extends js.Object {
  var compilation: AnonDirectives
  var exported: AnonDirectives
  var schemas: js.Array[SchemaMetadata] | Null
}

object ɵNgModuleTransitiveScopes {
  @scala.inline
  def apply(compilation: AnonDirectives, exported: AnonDirectives, schemas: js.Array[SchemaMetadata] = null): ɵNgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵNgModuleTransitiveScopes]
  }
}

