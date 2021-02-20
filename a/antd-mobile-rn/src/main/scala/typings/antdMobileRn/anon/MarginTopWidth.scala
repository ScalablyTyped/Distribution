package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginTopWidth extends StObject {
  
  var height: Double = js.native
  
  var marginTop: Double = js.native
  
  var width: Double = js.native
}
object MarginTopWidth {
  
  @scala.inline
  def apply(height: Double, marginTop: Double, width: Double): MarginTopWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopWidth]
  }
  
  @scala.inline
  implicit class MarginTopWidthMutableBuilder[Self <: MarginTopWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
