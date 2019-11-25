package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.Anon_Directives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵNgModuleTransitiveScopes extends js.Object {
  var compilation: Anon_Directives
  var exported: Anon_Directives
  var schemas: js.Array[SchemaMetadata] | Null
}

object ɵNgModuleTransitiveScopes {
  @scala.inline
  def apply(compilation: Anon_Directives, exported: Anon_Directives, schemas: js.Array[SchemaMetadata] = null): ɵNgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    if (schemas != null) __obj.updateDynamic("schemas")(schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵNgModuleTransitiveScopes]
  }
}

