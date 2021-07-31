package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawShape extends StObject {
  
  var drawShape: js.Any
  
  var getMarkerCfg: js.UndefOr[js.Any] = js.undefined
  
  var getPoints: js.UndefOr[js.Any] = js.undefined
}
object DrawShape {
  
  @scala.inline
  def apply(drawShape: js.Any): DrawShape = {
    val __obj = js.Dynamic.literal(drawShape = drawShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawShape]
  }
  
  @scala.inline
  implicit class DrawShapeMutableBuilder[Self <: DrawShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawShape(value: js.Any): Self = StObject.set(x, "drawShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMarkerCfg(value: js.Any): Self = StObject.set(x, "getMarkerCfg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetMarkerCfgUndefined: Self = StObject.set(x, "getMarkerCfg", js.undefined)
    
    @scala.inline
    def setGetPoints(value: js.Any): Self = StObject.set(x, "getPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPointsUndefined: Self = StObject.set(x, "getPoints", js.undefined)
  }
}
