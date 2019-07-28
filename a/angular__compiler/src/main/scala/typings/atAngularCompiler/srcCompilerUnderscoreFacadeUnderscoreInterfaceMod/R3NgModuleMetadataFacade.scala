package typings.atAngularCompiler.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import typings.atAngularCompiler.Anon_NameString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleMetadataFacade extends js.Object {
  var bootstrap: js.Array[js.Function]
  var declarations: js.Array[js.Function]
  var emitInline: Boolean
  var exports: js.Array[js.Function]
  var id: String | Null
  var imports: js.Array[js.Function]
  var schemas: js.Array[Anon_NameString] | Null
  var `type`: js.Any
}

object R3NgModuleMetadataFacade {
  @scala.inline
  def apply(
    bootstrap: js.Array[js.Function],
    declarations: js.Array[js.Function],
    emitInline: Boolean,
    exports: js.Array[js.Function],
    imports: js.Array[js.Function],
    `type`: js.Any,
    id: String = null,
    schemas: js.Array[Anon_NameString] = null
  ): R3NgModuleMetadataFacade = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap, declarations = declarations, emitInline = emitInline, exports = exports, imports = imports)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[R3NgModuleMetadataFacade]
  }
}

