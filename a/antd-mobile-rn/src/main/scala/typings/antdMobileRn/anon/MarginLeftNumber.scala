package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginLeftNumber extends StObject {
  
  var marginLeft: Double = js.native
}
object MarginLeftNumber {
  
  @scala.inline
  def apply(marginLeft: Double): MarginLeftNumber = {
    val __obj = js.Dynamic.literal(marginLeft = marginLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeftNumber]
  }
  
  @scala.inline
  implicit class MarginLeftNumberMutableBuilder[Self <: MarginLeftNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
  }
}
