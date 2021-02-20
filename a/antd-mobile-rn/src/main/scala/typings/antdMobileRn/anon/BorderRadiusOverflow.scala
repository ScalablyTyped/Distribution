package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderRadiusOverflow extends StObject {
  
  var borderRadius: Double = js.native
  
  var overflow: String = js.native
}
object BorderRadiusOverflow {
  
  @scala.inline
  def apply(borderRadius: Double, overflow: String): BorderRadiusOverflow = {
    val __obj = js.Dynamic.literal(borderRadius = borderRadius.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusOverflow]
  }
  
  @scala.inline
  implicit class BorderRadiusOverflowMutableBuilder[Self <: BorderRadiusOverflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
  }
}
