package typings.angularCore.anon

import typings.angularCore.r3SymbolsMod.SchemaMetadata
import typings.angularCore.r3SymbolsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exports[T] extends StObject {
  
  /** List of components to bootstrap. */
  var bootstrap: js.UndefOr[js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]] = js.undefined
  
  /** List of components, directives, and pipes declared by this module. */
  var declarations: js.UndefOr[js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]] = js.undefined
  
  /**
    * List of modules, `ModuleWithProviders`, components, directives, or pipes exported by this
    * module.
    */
  var exports: js.UndefOr[js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]] = js.undefined
  
  /** Unique ID for the module that is used with `getModuleFactory`. */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /** List of modules or `ModuleWithProviders` imported by this module. */
  var imports: js.UndefOr[js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]] = js.undefined
  
  /** The set of schemas that declare elements to be allowed in the NgModule. */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.undefined
  
  /** Token representing the module. Used by DI. */
  var `type`: T
}
object Exports {
  
  inline def apply[T](`type`: T): Exports[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exports[T]]
  }
  
  extension [Self <: Exports[?], T](x: Self & Exports[T]) {
    
    inline def setBootstrap(value: js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapFunction0(value: () => js.Array[Type[js.Any]]): Self = StObject.set(x, "bootstrap", js.Any.fromFunction0(value))
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    inline def setBootstrapVarargs(value: Type[js.Any]*): Self = StObject.set(x, "bootstrap", js.Array(value :_*))
    
    inline def setDeclarations(value: js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsFunction0(value: () => js.Array[Type[js.Any]]): Self = StObject.set(x, "declarations", js.Any.fromFunction0(value))
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    inline def setExports(value: js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsFunction0(value: () => js.Array[Type[js.Any]]): Self = StObject.set(x, "exports", js.Any.fromFunction0(value))
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImports(value: js.Array[Type[js.Any]] | js.Function0[js.Array[Type[js.Any]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsFunction0(value: () => js.Array[Type[js.Any]]): Self = StObject.set(x, "imports", js.Any.fromFunction0(value))
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Type[js.Any]*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
