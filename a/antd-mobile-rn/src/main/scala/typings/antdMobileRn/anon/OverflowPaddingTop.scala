package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverflowPaddingTop extends StObject {
  
  var borderRadius: Double = js.native
  
  var overflow: String = js.native
  
  var paddingTop: Double = js.native
  
  var width: Double = js.native
}
object OverflowPaddingTop {
  
  @scala.inline
  def apply(borderRadius: Double, overflow: String, paddingTop: Double, width: Double): OverflowPaddingTop = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowPaddingTop]
  }
  
  @scala.inline
  implicit class OverflowPaddingTopMutableBuilder[Self <: OverflowPaddingTop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
