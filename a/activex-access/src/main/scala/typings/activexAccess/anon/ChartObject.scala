package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartObject extends StObject {
  
  val chartObject: js.Any = js.native
  
  val drawObject: js.Any = js.native
}
object ChartObject {
  
  @scala.inline
  def apply(chartObject: js.Any, drawObject: js.Any): ChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartObject]
  }
  
  @scala.inline
  implicit class ChartObjectMutableBuilder[Self <: ChartObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartObject(value: js.Any): Self = StObject.set(x, "chartObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawObject(value: js.Any): Self = StObject.set(x, "drawObject", value.asInstanceOf[js.Any])
  }
}
