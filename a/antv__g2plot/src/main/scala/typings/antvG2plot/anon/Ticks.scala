package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ticks extends StObject {
  
  var ticks: js.Array[Any]
}
object Ticks {
  
  inline def apply(ticks: js.Array[Any]): Ticks = {
    val __obj = js.Dynamic.literal(ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ticks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ticks] (val x: Self) extends AnyVal {
    
    inline def setTicks(value: js.Array[Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksVarargs(value: Any*): Self = StObject.set(x, "ticks", js.Array(value*))
  }
}
