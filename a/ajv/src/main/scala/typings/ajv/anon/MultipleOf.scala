package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleOf extends StObject {
  
  var multipleOf: Double
}
object MultipleOf {
  
  inline def apply(multipleOf: Double): MultipleOf = {
    val __obj = js.Dynamic.literal(multipleOf = multipleOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipleOf] (val x: Self) extends AnyVal {
    
    inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
  }
}
