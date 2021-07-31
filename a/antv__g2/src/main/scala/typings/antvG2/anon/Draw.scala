package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Draw extends StObject {
  
  var draw: js.Any
  
  var getMarkerCfg: js.UndefOr[js.Any] = js.undefined
  
  var getPoints: js.UndefOr[js.Any] = js.undefined
}
object Draw {
  
  @scala.inline
  def apply(draw: js.Any): Draw = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draw]
  }
  
  @scala.inline
  implicit class DrawMutableBuilder[Self <: Draw] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: js.Any): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
    
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
