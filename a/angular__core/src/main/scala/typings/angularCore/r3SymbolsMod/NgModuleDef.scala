package typings.angularCore.r3SymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModuleDef[T] extends js.Object {
  
  /** List of components to bootstrap. */
  var bootstrap: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  
  /** Unique ID for the module with which it should be registered.  */
  var id: String | Null = js.native
  
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]] = js.native
  
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.Array[SchemaMetadata] | Null = js.native
  
  /**
    * Cached value of computed `transitiveCompileScopes` for this module.
    *
    * This should never be read directly, but accessed via `transitiveScopesFor`.
    */
  var transitiveCompileScopes: NgModuleTransitiveScopes | Null = js.native
  
  /** Token representing the module. Used by DI. */
  var `type`: T = js.native
}
object NgModuleDef {
  
  @scala.inline
  def apply[T](
    bootstrap: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    declarations: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    exports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    imports: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]],
    `type`: T
  ): NgModuleDef[T] = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgModuleDef[T]]
  }
  
  @scala.inline
  implicit class NgModuleDefOps[Self <: NgModuleDef[_], T] (val x: Self with NgModuleDef[T]) extends AnyVal {
    
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
    def setBootstrapVarargs(value: Type[js.Any]*): Self = this.set("bootstrap", js.Array(value :_*))
    
    @scala.inline
    def setBootstrapFunction0(value: () => js.Array[Type[_]]): Self = this.set("bootstrap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBootstrap(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsVarargs(value: Type[js.Any]*): Self = this.set("declarations", js.Array(value :_*))
    
    @scala.inline
    def setDeclarationsFunction0(value: () => js.Array[Type[_]]): Self = this.set("declarations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeclarations(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsVarargs(value: Type[js.Any]*): Self = this.set("exports", js.Array(value :_*))
    
    @scala.inline
    def setExportsFunction0(value: () => js.Array[Type[_]]): Self = this.set("exports", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsVarargs(value: Type[js.Any]*): Self = this.set("imports", js.Array(value :_*))
    
    @scala.inline
    def setImportsFunction0(value: () => js.Array[Type[_]]): Self = this.set("imports", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = this.set("imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasNull: Self = this.set("schemas", null)
    
    @scala.inline
    def setTransitiveCompileScopes(value: NgModuleTransitiveScopes): Self = this.set("transitiveCompileScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveCompileScopesNull: Self = this.set("transitiveCompileScopes", null)
  }
}
