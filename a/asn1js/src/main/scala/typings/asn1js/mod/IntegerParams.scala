package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerParams extends StObject {
  
  var value: js.UndefOr[Double] = js.undefined
}
object IntegerParams {
  
  inline def apply(): IntegerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegerParams]
  }
  
  extension [Self <: IntegerParams](x: Self) {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
