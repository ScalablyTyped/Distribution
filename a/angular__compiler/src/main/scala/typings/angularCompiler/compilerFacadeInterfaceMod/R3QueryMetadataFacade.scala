package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3QueryMetadataFacade extends StObject {
  
  var descendants: Boolean
  
  var first: Boolean
  
  var predicate: js.Any | js.Array[String]
  
  var propertyName: String
  
  var read: js.Any | Null
  
  var static: Boolean
}
object R3QueryMetadataFacade {
  
  inline def apply(
    descendants: Boolean,
    first: Boolean,
    predicate: js.Any | js.Array[String],
    propertyName: String,
    static: Boolean
  ): R3QueryMetadataFacade = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], read = null)
    __obj.asInstanceOf[R3QueryMetadataFacade]
  }
  
  extension [Self <: R3QueryMetadataFacade](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: js.Any | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value :_*))
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadNull: Self = StObject.set(x, "read", null)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
  }
}
