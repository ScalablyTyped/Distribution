package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderTopRightRadius extends StObject {
  
  var borderBottomRightRadius: Double = js.native
  
  var borderTopRightRadius: Double = js.native
}
object BorderTopRightRadius {
  
  @scala.inline
  def apply(borderBottomRightRadius: Double, borderTopRightRadius: Double): BorderTopRightRadius = {
    val __obj = js.Dynamic.literal(borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any], borderTopRightRadius = borderTopRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopRightRadius]
  }
  
  @scala.inline
  implicit class BorderTopRightRadiusMutableBuilder[Self <: BorderTopRightRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopRightRadius(value: Double): Self = StObject.set(x, "borderTopRightRadius", value.asInstanceOf[js.Any])
  }
}
