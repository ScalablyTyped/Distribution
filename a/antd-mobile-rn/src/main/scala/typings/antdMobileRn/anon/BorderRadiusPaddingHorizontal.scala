package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderRadiusPaddingHorizontal extends StObject {
  
  var borderRadius: Double
  
  var paddingHorizontal: Double
  
  var paddingVertical: Double
}
object BorderRadiusPaddingHorizontal {
  
  @scala.inline
  def apply(borderRadius: Double, paddingHorizontal: Double, paddingVertical: Double): BorderRadiusPaddingHorizontal = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusPaddingHorizontal]
  }
  
  @scala.inline
  implicit class BorderRadiusPaddingHorizontalMutableBuilder[Self <: BorderRadiusPaddingHorizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
