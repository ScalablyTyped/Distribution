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
    * Whether to generate closure wrappers for bootstrap, declarations, imports, and exports.
    */
  var containsForwardDecls: scala.Boolean
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
  /** Unique ID or expression representing the unique ID of an NgModule. */
  var id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
  /**
    * An array of expressions representing the imports of the module.
    */
  var imports: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference]
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    */
  var schemas: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference] | scala.Null
  /**
    * An expression representing the module type being compiled.
    */
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3NgModuleMetadata {
  @scala.inline
  def apply(
    bootstrap: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    containsForwardDecls: scala.Boolean,
    declarations: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    emitInline: scala.Boolean,
    exports: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    imports: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    id: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression = null,
    schemas: js.Array[atAngularCompilerLib.srcRender3UtilMod.R3Reference] = null
  ): R3NgModuleMetadata = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap, containsForwardDecls = containsForwardDecls, declarations = declarations, emitInline = emitInline, exports = exports, imports = imports)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (schemas != null) __obj.updateDynamic("schemas")(schemas)
    __obj.asInstanceOf[R3NgModuleMetadata]
  }
}

