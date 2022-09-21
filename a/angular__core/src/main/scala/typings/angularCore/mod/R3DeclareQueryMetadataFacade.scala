package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait R3DeclareQueryMetadataFacade extends StObject {
  
  var descendants: js.UndefOr[Boolean] = js.undefined
  
  var emitDistinctChangesOnly: js.UndefOr[Boolean] = js.undefined
  
  var first: js.UndefOr[Boolean] = js.undefined
  
  var predicate: OpaqueValue | js.Array[String]
  
  var propertyName: String
  
  var read: js.UndefOr[OpaqueValue] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
}
object R3DeclareQueryMetadataFacade {
  
  inline def apply(predicate: OpaqueValue | js.Array[String], propertyName: String): R3DeclareQueryMetadataFacade = {
    val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DeclareQueryMetadataFacade]
  }
  
  extension [Self <: R3DeclareQueryMetadataFacade](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setDescendantsUndefined: Self = StObject.set(x, "descendants", js.undefined)
    
    inline def setEmitDistinctChangesOnly(value: Boolean): Self = StObject.set(x, "emitDistinctChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setEmitDistinctChangesOnlyUndefined: Self = StObject.set(x, "emitDistinctChangesOnly", js.undefined)
    
    inline def setFirst(value: Boolean): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
    
    inline def setPredicate(value: OpaqueValue | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value*))
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setRead(value: OpaqueValue): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
