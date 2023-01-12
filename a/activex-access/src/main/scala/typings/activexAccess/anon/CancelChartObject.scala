package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelChartObject extends StObject {
  
  val Cancel: Any
  
  val chartObject: Any
  
  val drawObject: Any
}
object CancelChartObject {
  
  inline def apply(Cancel: Any, chartObject: Any, drawObject: Any): CancelChartObject = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelChartObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelChartObject] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Any): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setChartObject(value: Any): Self = StObject.set(x, "chartObject", value.asInstanceOf[js.Any])
    
    inline def setDrawObject(value: Any): Self = StObject.set(x, "drawObject", value.asInstanceOf[js.Any])
  }
}
