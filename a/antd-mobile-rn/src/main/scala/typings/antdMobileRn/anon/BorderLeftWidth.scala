package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLeftWidth extends StObject {
  
  var borderLeftWidth: Double
  
  var borderRadius: Double
  
  var borderRightWidth: Double
}
object BorderLeftWidth {
  
  @scala.inline
  def apply(borderLeftWidth: Double, borderRadius: Double, borderRightWidth: Double): BorderLeftWidth = {
    val __obj = js.Dynamic.literal(borderLeftWidth = borderLeftWidth.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderRightWidth = borderRightWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftWidth]
  }
  
  @scala.inline
  implicit class BorderLeftWidthMutableBuilder[Self <: BorderLeftWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderLeftWidth(value: Double): Self = StObject.set(x, "borderLeftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightWidth(value: Double): Self = StObject.set(x, "borderRightWidth", value.asInstanceOf[js.Any])
  }
}
