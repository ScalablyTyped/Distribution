package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelChartObject extends StObject {
  
  val Cancel: js.Any
  
  val chartObject: js.Any
  
  val drawObject: js.Any
}
object CancelChartObject {
  
  inline def apply(Cancel: js.Any, chartObject: js.Any, drawObject: js.Any): CancelChartObject = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelChartObject]
  }
  
  extension [Self <: CancelChartObject](x: Self) {
    
    inline def setCancel(value: js.Any): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    inline def setChartObject(value: js.Any): Self = StObject.set(x, "chartObject", value.asInstanceOf[js.Any])
    
    inline def setDrawObject(value: js.Any): Self = StObject.set(x, "drawObject", value.asInstanceOf[js.Any])
  }
}
