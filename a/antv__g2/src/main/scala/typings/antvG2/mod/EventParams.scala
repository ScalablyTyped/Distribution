package typings.antvG2.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * base type
  */
trait EventParams extends StObject {
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var geom: js.UndefOr[js.Any] = js.undefined
  
  var shape: js.UndefOr[Shape] = js.undefined
  
  var target: js.UndefOr[HTMLCanvasElement] = js.undefined
  
  var toElement: js.UndefOr[HTMLElement] = js.undefined
  
  var views: js.UndefOr[js.Array[View]] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object EventParams {
  
  inline def apply(): EventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventParams]
  }
  
  extension [Self <: EventParams](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setGeom(value: js.Any): Self = StObject.set(x, "geom", value.asInstanceOf[js.Any])
    
    inline def setGeomUndefined: Self = StObject.set(x, "geom", js.undefined)
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setTarget(value: HTMLCanvasElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setToElement(value: HTMLElement): Self = StObject.set(x, "toElement", value.asInstanceOf[js.Any])
    
    inline def setToElementUndefined: Self = StObject.set(x, "toElement", js.undefined)
    
    inline def setViews(value: js.Array[View]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: View*): Self = StObject.set(x, "views", js.Array(value :_*))
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
