package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange extends StObject {
  
  var cascade: Boolean
  
  var cols: Double
  
  def onChange(): Unit
  
  var value: js.Array[scala.Nothing]
}
object OnChange {
  
  inline def apply(cascade: Boolean, cols: Double, onChange: () => Unit, value: js.Array[scala.Nothing]): OnChange = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  
  extension [Self <: OnChange](x: Self) {
    
    inline def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setValue(value: js.Array[scala.Nothing]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: scala.Nothing*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
