package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.Array[Icon]
}
object Data {
  
  inline def apply(data: js.Array[Icon]): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Icon]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Icon*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
