package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareNgModuleMetadata
  extends StObject
     with R3PartialDeclaration {
  
  /**
    * An array of expressions representing the bootstrap components specified by the module.
    */
  var bootstrap: js.UndefOr[js.Array[Expression]] = js.undefined
  
  /**
    * An array of expressions representing the directives and pipes declared by the module.
    */
  var declarations: js.UndefOr[js.Array[Expression]] = js.undefined
  
  /**
    * An array of expressions representing the exports of the module.
    */
  var exports: js.UndefOr[js.Array[Expression]] = js.undefined
  
  /** Unique ID or expression representing the unique ID of an NgModule. */
  var id: js.UndefOr[Expression] = js.undefined
  
  /**
    * An array of expressions representing the imports of the module.
    */
  var imports: js.UndefOr[js.Array[Expression]] = js.undefined
  
  /**
    * The set of schemas that declare elements to be allowed in the NgModule.
    */
  var schemas: js.UndefOr[js.Array[Expression]] = js.undefined
}
object R3DeclareNgModuleMetadata {
  
  inline def apply(minVersion: String, ngImport: Expression, `type`: Expression, version: String): R3DeclareNgModuleMetadata = {
    val __obj = js.Dynamic.literal(minVersion = minVersion.asInstanceOf[js.Any], ngImport = ngImport.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareNgModuleMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3DeclareNgModuleMetadata] (val x: Self) extends AnyVal {
    
    inline def setBootstrap(value: js.Array[Expression]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    inline def setBootstrapVarargs(value: Expression*): Self = StObject.set(x, "bootstrap", js.Array(value*))
    
    inline def setDeclarations(value: js.Array[Expression]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsUndefined: Self = StObject.set(x, "declarations", js.undefined)
    
    inline def setDeclarationsVarargs(value: Expression*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setExports(value: js.Array[Expression]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "exports", js.undefined)
    
    inline def setExportsVarargs(value: Expression*): Self = StObject.set(x, "exports", js.Array(value*))
    
    inline def setId(value: Expression): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImports(value: js.Array[Expression]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: Expression*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setSchemas(value: js.Array[Expression]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: Expression*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
