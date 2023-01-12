package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartObject extends StObject {
  
  val chartObject: Any
  
  val drawObject: Any
}
object ChartObject {
  
  inline def apply(chartObject: Any, drawObject: Any): ChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartObject] (val x: Self) extends AnyVal {
    
    inline def setChartObject(value: Any): Self = StObject.set(x, "chartObject", value.asInstanceOf[js.Any])
    
    inline def setDrawObject(value: Any): Self = StObject.set(x, "drawObject", value.asInstanceOf[js.Any])
  }
}
