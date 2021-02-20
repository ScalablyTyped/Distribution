package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightMarginBottom extends StObject {
  
  var height: Double = js.native
  
  var marginBottom: Double = js.native
  
  var width: Double = js.native
}
object HeightMarginBottom {
  
  @scala.inline
  def apply(height: Double, marginBottom: Double, width: Double): HeightMarginBottom = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], marginBottom = marginBottom.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightMarginBottom]
  }
  
  @scala.inline
  implicit class HeightMarginBottomMutableBuilder[Self <: HeightMarginBottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
