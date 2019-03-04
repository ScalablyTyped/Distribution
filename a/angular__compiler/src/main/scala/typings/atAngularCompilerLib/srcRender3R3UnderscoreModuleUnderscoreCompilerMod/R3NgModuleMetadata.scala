package typings
package atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleMetadata extends js.Object {
  /**
    * An array of expressions representing the bootstrap components specified by the module.
    */
  var bootstrap: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference]
  /**
    * An array of expressions representing the directives and pipes declared by the module.
    */
  var declarations: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference]
  /**
    * Whether to emit the selector scope values (declarations, imports, exports) inline into the
    * module definition, or to generate additional statements which patch them on. Inline emission
    * does not allow components to be tree-shaken, but is useful for JIT mode.
    */
  var emitInline: scala.Boolean
  /**
    * An array of expressions representing the exports of the module.
    */
  var exports: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference]
  /**
    * An array of expressions representing the imports of the module.
    */
  var imports: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference]
  /**
    * An expression representing the module type being compiled.
    */
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3NgModuleMetadata {
  @scala.inline
  def apply(
    bootstrap: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    declarations: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    emitInline: scala.Boolean,
    exports: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    imports: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  ): R3NgModuleMetadata = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap, declarations = declarations, emitInline = emitInline, exports = exports, imports = imports)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[R3NgModuleMetadata]
  }
}

