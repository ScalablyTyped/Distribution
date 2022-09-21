package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectAlternativeNameMatchers extends StObject {
  
  /**
    * The values sent must match the specified values exactly.
    */
  var exact: SubjectAlternativeNameList
}
object SubjectAlternativeNameMatchers {
  
  inline def apply(exact: SubjectAlternativeNameList): SubjectAlternativeNameMatchers = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAlternativeNameMatchers]
  }
  
  extension [Self <: SubjectAlternativeNameMatchers](x: Self) {
    
    inline def setExact(value: SubjectAlternativeNameList): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactVarargs(value: SubjectAlternativeName*): Self = StObject.set(x, "exact", js.Array(value*))
  }
}
