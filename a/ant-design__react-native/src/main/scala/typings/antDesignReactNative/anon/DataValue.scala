package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValue extends StObject {
  
  var data: js.Any
  
  var value: js.Any
}
object DataValue {
  
  inline def apply(data: js.Any, value: js.Any): DataValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  
  extension [Self <: DataValue](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
