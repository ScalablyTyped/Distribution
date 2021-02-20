package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderBottomRightRadius extends StObject {
  
  var borderBottomLeftRadius: Double = js.native
  
  var borderBottomRightRadius: Double = js.native
}
object BorderBottomRightRadius {
  
  @scala.inline
  def apply(borderBottomLeftRadius: Double, borderBottomRightRadius: Double): BorderBottomRightRadius = {
    val __obj = js.Dynamic.literal(borderBottomLeftRadius = borderBottomLeftRadius.asInstanceOf[js.Any], borderBottomRightRadius = borderBottomRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBottomRightRadius]
  }
  
  @scala.inline
  implicit class BorderBottomRightRadiusMutableBuilder[Self <: BorderBottomRightRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderBottomLeftRadius(value: Double): Self = StObject.set(x, "borderBottomLeftRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomRightRadius(value: Double): Self = StObject.set(x, "borderBottomRightRadius", value.asInstanceOf[js.Any])
  }
}
