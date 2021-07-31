package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightMarginTop extends StObject {
  
  var height: Double
  
  var marginTop: Double
  
  var width: Double
}
object HeightMarginTop {
  
  @scala.inline
  def apply(height: Double, marginTop: Double, width: Double): HeightMarginTop = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightMarginTop]
  }
  
  @scala.inline
  implicit class HeightMarginTopMutableBuilder[Self <: HeightMarginTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
