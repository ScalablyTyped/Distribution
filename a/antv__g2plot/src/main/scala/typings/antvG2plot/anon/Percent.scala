package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Percent extends StObject {
  
  var percent: TickCount
  
  var range: Sync
}
object Percent {
  
  inline def apply(percent: TickCount, range: Sync): Percent = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Percent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Percent] (val x: Self) extends AnyVal {
    
    inline def setPercent(value: TickCount): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Sync): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
