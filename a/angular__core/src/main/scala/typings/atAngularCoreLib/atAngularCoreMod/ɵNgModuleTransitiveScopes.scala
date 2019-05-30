package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵNgModuleTransitiveScopes extends js.Object {
  var compilation: atAngularCoreLib.Anon_Directives
  var exported: atAngularCoreLib.Anon_Directives
  var schemas: js.Array[SchemaMetadata] | scala.Null
}

object ɵNgModuleTransitiveScopes {
  @scala.inline
  def apply(
    compilation: atAngularCoreLib.Anon_Directives,
    exported: atAngularCoreLib.Anon_Directives,
    schemas: js.Array[SchemaMetadata] = null
  ): ɵNgModuleTransitiveScopes = {
    val __obj = js.Dynamic.literal(compilation = compilation, exported = exported)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[ɵNgModuleTransitiveScopes]
  }
}

