package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelChartObject extends StObject {
  
  val Cancel: js.Any = js.native
  
  val chartObject: js.Any = js.native
  
  val drawObject: js.Any = js.native
}
object CancelChartObject {
  
  @scala.inline
  def apply(Cancel: js.Any, chartObject: js.Any, drawObject: js.Any): CancelChartObject = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelChartObject]
  }
  
  @scala.inline
  implicit class CancelChartObjectMutableBuilder[Self <: CancelChartObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: js.Any): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartObject(value: js.Any): Self = StObject.set(x, "chartObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawObject(value: js.Any): Self = StObject.set(x, "drawObject", value.asInstanceOf[js.Any])
  }
}
