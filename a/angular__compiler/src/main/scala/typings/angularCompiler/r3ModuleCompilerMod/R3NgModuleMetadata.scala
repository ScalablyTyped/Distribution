package typings.angularCompiler.r3ModuleCompilerMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.render3UtilMod.R3Reference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3NgModuleMetadata extends js.Object {
  /**
    * An expression intended for use by statements that are adjacent (i.e. tightly coupled) to but
    * not internal to a class definition.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var adjacentType: Expression = js.native
  /**
    * An array of expressions representing the bootstrap components specified by the module.
    */
  var bootstrap: js.Array[R3Reference] = js.native
  /**
    * Whether to generate closure wrappers for bootstrap, declarations, imports, and exports.
    */
  var containsForwardDecls: Boolean = js.native
  /**
    * An array of expressions representing the directives and pipes declared by the module.
    */
  var declarations: js.Array[R3Reference] = js.native
  /**
    * Whether to emit the selector scope values (declarations, imports, exports) inline into the
    * module definition, or to generate additional statements which patch them on. Inline emission
    * does not allow components to be tree-shaken, but is useful for JIT mode.
    */
  var emitInline: Boolean = js.native
  /**
    * An array of expressions representing the exports of the module.
    */
  var exports: js.Array[R3Reference] = js.native
  /** Unique ID or expression representing the unique ID of an NgModule. */
  var id: Expression | Null = js.native
  /**
    * An array of expressions representing the imports of the module.
    */
  var imports: js.Array[R3Reference] = js.native
  /**
    * An expression representing the module type being compiled, intended for use within a class
    * definition itself.
    *
    * This can differ from the outer `type` if the class is being compiled by ngcc and is inside
    * an IIFE structure that uses a different name internally.
    */
  var internalType: Expression = js.native
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    */
  var schemas: js.Array[R3Reference] | Null = js.native
  /**
    * An expression representing the module type being compiled.
    */
  var `type`: R3Reference = js.native
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
    `type`: R3Reference
  ): R3NgModuleMetadata = {
    val __obj = js.Dynamic.literal(adjacentType = adjacentType.asInstanceOf[js.Any], bootstrap = bootstrap.asInstanceOf[js.Any], containsForwardDecls = containsForwardDecls.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], emitInline = emitInline.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadata]
  }
  @scala.inline
  implicit class R3NgModuleMetadataOps[Self <: R3NgModuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjacentType(value: Expression): Self = this.set("adjacentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBootstrapVarargs(value: R3Reference*): Self = this.set("bootstrap", js.Array(value :_*))
    @scala.inline
    def setBootstrap(value: js.Array[R3Reference]): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainsForwardDecls(value: Boolean): Self = this.set("containsForwardDecls", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclarationsVarargs(value: R3Reference*): Self = this.set("declarations", js.Array(value :_*))
    @scala.inline
    def setDeclarations(value: js.Array[R3Reference]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmitInline(value: Boolean): Self = this.set("emitInline", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportsVarargs(value: R3Reference*): Self = this.set("exports", js.Array(value :_*))
    @scala.inline
    def setExports(value: js.Array[R3Reference]): Self = this.set("exports", value.asInstanceOf[js.Any])
    @scala.inline
    def setImportsVarargs(value: R3Reference*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[R3Reference]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalType(value: Expression): Self = this.set("internalType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: R3Reference): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Expression): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setSchemasVarargs(value: R3Reference*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: js.Array[R3Reference]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemasNull: Self = this.set("schemas", null)
  }
  
}

