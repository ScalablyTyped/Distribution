package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginTopPaddingHorizontal extends StObject {
  
  var marginTop: Double = js.native
  
  var paddingHorizontal: Double = js.native
}
object MarginTopPaddingHorizontal {
  
  @scala.inline
  def apply(marginTop: Double, paddingHorizontal: Double): MarginTopPaddingHorizontal = {
    val __obj = js.Dynamic.literal(marginTop = marginTop.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopPaddingHorizontal]
  }
  
  @scala.inline
  implicit class MarginTopPaddingHorizontalMutableBuilder[Self <: MarginTopPaddingHorizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
  }
}
