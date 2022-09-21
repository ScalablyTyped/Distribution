package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Only extends StObject {
  
  var only: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Only {
  
  inline def apply(): Only = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Only]
  }
  
  extension [Self <: Only](x: Self) {
    
    inline def setOnly(value: String | js.Array[String]): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setOnlyVarargs(value: String*): Self = StObject.set(x, "only", js.Array(value*))
  }
}
