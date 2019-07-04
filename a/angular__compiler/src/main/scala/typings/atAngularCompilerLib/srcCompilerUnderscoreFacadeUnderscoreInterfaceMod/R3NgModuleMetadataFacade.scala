package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleMetadataFacade extends js.Object {
  var bootstrap: js.Array[js.Function]
  var declarations: js.Array[js.Function]
  var emitInline: scala.Boolean
  var exports: js.Array[js.Function]
  var id: java.lang.String | scala.Null
  var imports: js.Array[js.Function]
  var schemas: js.Array[atAngularCompilerLib.Anon_NameString] | scala.Null
  var `type`: js.Any
}

object R3NgModuleMetadataFacade {
  @scala.inline
  def apply(
    bootstrap: js.Array[js.Function],
    declarations: js.Array[js.Function],
    emitInline: scala.Boolean,
    exports: js.Array[js.Function],
    imports: js.Array[js.Function],
    `type`: js.Any,
    id: java.lang.String = null,
    schemas: js.Array[atAngularCompilerLib.Anon_NameString] = null
  ): R3NgModuleMetadataFacade = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap, declarations = declarations, emitInline = emitInline, exports = exports, imports = imports)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[R3NgModuleMetadataFacade]
  }
}

