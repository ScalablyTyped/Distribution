package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginLeftMarginRight extends StObject {
  
  var marginLeft: Double = js.native
  
  var marginRight: Double = js.native
}
object MarginLeftMarginRight {
  
  @scala.inline
  def apply(marginLeft: Double, marginRight: Double): MarginLeftMarginRight = {
    val __obj = js.Dynamic.literal(marginLeft = marginLeft.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeftMarginRight]
  }
  
  @scala.inline
  implicit class MarginLeftMarginRightMutableBuilder[Self <: MarginLeftMarginRight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
  }
}
