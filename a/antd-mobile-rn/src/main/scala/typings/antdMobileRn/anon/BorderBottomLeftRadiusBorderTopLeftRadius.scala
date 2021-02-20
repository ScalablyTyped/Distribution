package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomLeftRadiusBorderTopLeftRadius extends StObject {
  
  var borderBottomLeftRadius: Double = js.native
  
  var borderTopLeftRadius: Double = js.native
}
object BorderBottomLeftRadiusBorderTopLeftRadius {
  
  @scala.inline
  def apply(borderBottomLeftRadius: Double, borderTopLeftRadius: Double): BorderBottomLeftRadiusBorderTopLeftRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderTopLeftRadius = borderTopLeftRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomLeftRadiusBorderTopLeftRadius]
  }
  
  @scala.inline
  implicit class BorderBottomLeftRadiusBorderTopLeftRadiusMutableBuilder[Self <: BorderBottomLeftRadiusBorderTopLeftRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopLeftRadius(value: Double): Self = StObject.set(x, "borderTopLeftRadius", value.asInstanceOf[js.Any])
  }
}
