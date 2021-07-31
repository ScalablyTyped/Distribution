package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarginLeftWidth extends StObject {
  
  var height: Double
  
  var marginLeft: Double
  
  var width: Double
}
object MarginLeftWidth {
  
  @scala.inline
  def apply(height: Double, marginLeft: Double, width: Double): MarginLeftWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], marginLeft = marginLeft.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeftWidth]
  }
  
  @scala.inline
  implicit class MarginLeftWidthMutableBuilder[Self <: MarginLeftWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
