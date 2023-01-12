package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickCount extends StObject {
  
  var sync: String
  
  var tickCount: Double
  
  var tickInterval: Double
}
object TickCount {
  
  inline def apply(sync: String, tickCount: Double, tickInterval: Double): TickCount = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], tickInterval = tickInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TickCount] (val x: Self) extends AnyVal {
    
    inline def setSync(value: String): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickInterval(value: Double): Self = StObject.set(x, "tickInterval", value.asInstanceOf[js.Any])
  }
}
