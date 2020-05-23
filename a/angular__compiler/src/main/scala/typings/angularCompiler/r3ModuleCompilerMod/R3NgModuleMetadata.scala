package typings.angularCompiler.r3ModuleCompilerMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleMetadata extends js.Object {
  /**
    * An expression intended for use by statements that are adjacent (i.e. tightly coupled) to but
    * not internal to a class definition.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var adjacentType: Expression
  /**
    * An array of expressions representing the bootstrap components specified by the module.
    */
  var bootstrap: js.Array[R3Reference]
  /**
    * Whether to generate closure wrappers for bootstrap, declarations, imports, and exports.
    */
  var containsForwardDecls: Boolean
  /**
    * An array of expressions representing the directives and pipes declared by the module.
    */
  var declarations: js.Array[R3Reference]
  /**
    * Whether to emit the selector scope values (declarations, imports, exports) inline into the
    * module definition, or to generate additional statements which patch them on. Inline emission
    * does not allow components to be tree-shaken, but is useful for JIT mode.
    */
  var emitInline: Boolean
  /**
    * An array of expressions representing the exports of the module.
    */
  var exports: js.Array[R3Reference]
  /** Unique ID or expression representing the unique ID of an NgModule. */
  var id: Expression | Null
  /**
    * An array of expressions representing the imports of the module.
    */
  var imports: js.Array[R3Reference]
  /**
    * An expression representing the module type being compiled, intended for use within a class
    * definition itself.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var internalType: Expression
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    */
  var schemas: js.Array[R3Reference] | Null
  /**
    * An expression representing the module type being compiled.
    */
  var `type`: R3Reference
}

object R3NgModuleMetadata {
  @scala.inline
  def apply(
    adjacentType: Expression,
    bootstrap: js.Array[R3Reference],
    containsForwardDecls: Boolean,
    declarations: js.Array[R3Reference],
    emitInline: Boolean,
    exports: js.Array[R3Reference],
    imports: js.Array[R3Reference],
    internalType: Expression,
    `type`: R3Reference,
    id: Expression = null,
    schemas: js.Array[R3Reference] = null
  ): R3NgModuleMetadata = {
    val __obj = js.Dynamic.literal(adjacentType = adjacentType.asInstanceOf[js.Any], bootstrap = bootstrap.asInstanceOf[js.Any], containsForwardDecls = containsForwardDecls.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], emitInline = emitInline.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadata]
  }
}

