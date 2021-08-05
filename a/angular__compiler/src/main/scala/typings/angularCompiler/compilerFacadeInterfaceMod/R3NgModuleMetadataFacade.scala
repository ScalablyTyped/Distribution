package typings.angularCompiler.compilerFacadeInterfaceMod

import typings.angularCompiler.anon.NameString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3NgModuleMetadataFacade extends StObject {
  
  var bootstrap: js.Array[js.Function]
  
  var declarations: js.Array[js.Function]
  
  var exports: js.Array[js.Function]
  
  var id: String | Null
  
  var imports: js.Array[js.Function]
  
  var schemas: js.Array[NameString] | Null
  
  var `type`: js.Any
}
object R3NgModuleMetadataFacade {
  
  inline def apply(
    bootstrap: js.Array[js.Function],
    declarations: js.Array[js.Function],
    exports: js.Array[js.Function],
    imports: js.Array[js.Function],
    `type`: js.Any
  ): R3NgModuleMetadataFacade = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], declarations = declarations.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], id = null, schemas = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleMetadataFacade]
  }
  
  extension [Self <: R3NgModuleMetadataFacade](x: Self) {
    
    inline def setBootstrap(value: js.Array[js.Function]): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapVarargs(value: js.Function*): Self = StObject.set(x, "bootstrap", js.Array(value :_*))
    
    inline def setDeclarations(value: js.Array[js.Function]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: js.Function*): Self = StObject.set(x, "declarations", js.Array(value :_*))
    
    inline def setExports(value: js.Array[js.Function]): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    
    inline def setExportsVarargs(value: js.Function*): Self = StObject.set(x, "exports", js.Array(value :_*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setImports(value: js.Array[js.Function]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: js.Function*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    inline def setSchemas(value: js.Array[NameString]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasVarargs(value: NameString*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
