package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRadiusHeight extends StObject {
  
  var borderRadius: Double = js.native
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var overflow: String = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
}
object BorderRadiusHeight {
  
  @scala.inline
  def apply(borderRadius: Double, height: Double, left: Double, overflow: String, top: Double, width: Double): BorderRadiusHeight = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusHeight]
  }
  
  @scala.inline
  implicit class BorderRadiusHeightMutableBuilder[Self <: BorderRadiusHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
