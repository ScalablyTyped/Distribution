package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing query metadata extracted from query annotations.
  */
trait TQueryMetadata extends StObject {
  
  var flags: QueryFlags
  
  var predicate: ProviderToken[Any] | js.Array[String]
  
  var read: Any
}
object TQueryMetadata {
  
  inline def apply(flags: QueryFlags, predicate: ProviderToken[Any] | js.Array[String], read: Any): TQueryMetadata = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[TQueryMetadata]
  }
  
  extension [Self <: TQueryMetadata](x: Self) {
    
    inline def setFlags(value: QueryFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: ProviderToken[Any] | js.Array[String]): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateVarargs(value: String*): Self = StObject.set(x, "predicate", js.Array(value*))
    
    inline def setRead(value: Any): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
  }
}
