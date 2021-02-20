package typings.angularCore.r3SymbolsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NgModuleDef[T] extends StObject {
  
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
  implicit class NgModuleDefMutableBuilder[Self <: NgModuleDef[_], T] (val x: Self with NgModuleDef[T]) extends AnyVal {
    
    @scala.inline
    def setBootstrap(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapFunction0(value: () => js.Array[Type[_]]): Self = StObject.set(x, "bootstrap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBootstrapVarargs(value: Type[js.Any]*): Self = StObject.set(x, "bootstrap", js.Array(value :_*))
    
    @scala.inline
    def setDeclarations(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationsFunction0(value: () => js.Array[Type[_]]): Self = StObject.set(x, "declarations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeclarationsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportsFunction0(value: () => js.Array[Type[_]]): Self = StObject.set(x, "exports", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExportsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setImports(value: js.Array[Type[_]] | js.Function0[js.Array[Type[_]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsFunction0(value: () => js.Array[Type[_]]): Self = StObject.set(x, "imports", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveCompileScopes(value: NgModuleTransitiveScopes): Self = StObject.set(x, "transitiveCompileScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveCompileScopesNull: Self = StObject.set(x, "transitiveCompileScopes", null)
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
