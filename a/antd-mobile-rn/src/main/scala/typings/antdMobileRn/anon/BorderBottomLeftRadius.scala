package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomLeftRadius extends StObject {
  
  var borderBottomLeftRadius: Double = js.native
  
  var borderBottomRightRadius: Double = js.native
  
  var bottom: Double = js.native
  
  var left: Double = js.native
  
  var position: String = js.native
  
  var right: Double = js.native
}
object BorderBottomLeftRadius {
  
  @scala.inline
  def apply(
    borderBottomLeftRadius: Double,
    borderBottomRightRadius: Double,
    bottom: Double,
    left: Double,
    position: String,
    right: Double
  ): BorderBottomLeftRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomLeftRadius]
  }
  
  @scala.inline
  implicit class BorderBottomLeftRadiusMutableBuilder[Self <: BorderBottomLeftRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
