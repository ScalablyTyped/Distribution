package typings.angularCore.mod

import typings.angularCore.anon.Directives
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵNgModuleTransitiveScopes extends js.Object {
  var compilation: Directives
  var exported: Directives
  var schemas: js.Array[SchemaMetadata] | Null
}

object ɵNgModuleTransitiveScopes {
  @scala.inline
  def apply(compilation: Directives, exported: Directives, schemas: js.Array[SchemaMetadata] = null): ɵNgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵNgModuleTransitiveScopes]
  }
}

