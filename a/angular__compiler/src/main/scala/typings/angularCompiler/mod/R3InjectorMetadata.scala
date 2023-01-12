package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3InjectorMetadata extends StObject {
  
  var imports: js.Array[Expression]
  
  var internalType: Expression
  
  var name: String
  
  var providers: Expression | Null
  
  var `type`: R3Reference
}
object R3InjectorMetadata {
  
  inline def apply(imports: js.Array[Expression], internalType: Expression, name: String, `type`: R3Reference): R3InjectorMetadata = {
    val __obj = js.Dynamic.literal(imports = imports.asInstanceOf[js.Any], internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providers = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3InjectorMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: R3InjectorMetadata] (val x: Self) extends AnyVal {
    
    inline def setImports(value: js.Array[Expression]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Expression*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: Expression): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersNull: Self = StObject.set(x, "providers", null)
    
    inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
