package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderTopLeftRadius extends StObject {
  
  var borderTopLeftRadius: Double
  
  var borderTopRightRadius: Double
  
  var borderTopWidth: Double
}
object BorderTopLeftRadius {
  
  @scala.inline
  def apply(borderTopLeftRadius: Double, borderTopRightRadius: Double, borderTopWidth: Double): BorderTopLeftRadius = {
    val __obj = js.Dynamic.literal(borderTopLeftRadius = borderTopLeftRadius.asInstanceOf[js.Any], borderTopRightRadius = borderTopRightRadius.asInstanceOf[js.Any], borderTopWidth = borderTopWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopLeftRadius]
  }
  
  @scala.inline
  implicit class BorderTopLeftRadiusMutableBuilder[Self <: BorderTopLeftRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopWidth(value: Double): Self = StObject.set(x, "borderTopWidth", value.asInstanceOf[js.Any])
  }
}
