package typings.antvG2.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * base type
  */
@js.native
trait EventParams extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var geom: js.UndefOr[js.Any] = js.native
  
  var shape: js.UndefOr[Shape] = js.native
  
  var target: js.UndefOr[HTMLCanvasElement] = js.native
  
  var toElement: js.UndefOr[HTMLElement] = js.native
  
  var views: js.UndefOr[js.Array[View]] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object EventParams {
  
  @scala.inline
  def apply(): EventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventParams]
  }
  
  @scala.inline
  implicit class EventParamsMutableBuilder[Self <: EventParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setGeom(value: js.Any): Self = StObject.set(x, "geom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeomUndefined: Self = StObject.set(x, "geom", js.undefined)
    
    @scala.inline
    def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setTarget(value: HTMLCanvasElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setToElement(value: HTMLElement): Self = StObject.set(x, "toElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToElementUndefined: Self = StObject.set(x, "toElement", js.undefined)
    
    @scala.inline
    def setViews(value: js.Array[View]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    @scala.inline
    def setViewsVarargs(value: View*): Self = StObject.set(x, "views", js.Array(value :_*))
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
