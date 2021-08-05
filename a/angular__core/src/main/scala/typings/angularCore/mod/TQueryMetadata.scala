package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing query metadata extracted from query annotations.
  */
trait TQueryMetadata extends StObject {
  
  var descendants: Boolean
  
  var isStatic: Boolean
  
  var predicate: Type[js.Any] | InjectionToken[js.Any] | js.Array[String]
  
  var read: js.Any
}
object TQueryMetadata {
  
  inline def apply(
    descendants: Boolean,
    isStatic: Boolean,
    predicate: Type[js.Any] | InjectionToken[js.Any] | js.Array[String],
    read: js.Any
  ): TQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[TQueryMetadata]
  }
  
  extension [Self <: TQueryMetadata](x: Self) {
    
    inline def setDescendants(value: Boolean): Self = StObject.set(x, "descendants", value.asInstanceOf[js.Any])
    
    inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: Type[js.Any] | InjectionToken[js.Any] | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value :_*))
    
    inline def setRead(value: js.Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
  }
}
