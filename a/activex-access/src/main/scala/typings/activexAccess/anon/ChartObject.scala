package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartObject extends StObject {
  
  val chartObject: js.Any
  
  val drawObject: js.Any
}
object ChartObject {
  
  inline def apply(chartObject: js.Any, drawObject: js.Any): ChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartObject]
  }
  
  extension [Self <: ChartObject](x: Self) {
    
    inline def setChartObject(value: js.Any): Self = StObject.set(x, "chartObject", value.asInstanceOf[js.Any])
    
    inline def setDrawObject(value: js.Any): Self = StObject.set(x, "drawObject", value.asInstanceOf[js.Any])
  }
}
