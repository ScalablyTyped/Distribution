package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexDirectionMarginTopPaddingHorizontal extends StObject {
  
  var flexDirection: String = js.native
  
  var marginTop: Double = js.native
  
  var paddingHorizontal: Double = js.native
}
object FlexDirectionMarginTopPaddingHorizontal {
  
  @scala.inline
  def apply(flexDirection: String, marginTop: Double, paddingHorizontal: Double): FlexDirectionMarginTopPaddingHorizontal = {
    val __obj = js.Dynamic.literal(flexDirection = flexDirection.asInstanceOf[js.Any], marginTop = marginTop.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexDirectionMarginTopPaddingHorizontal]
  }
  
  @scala.inline
  implicit class FlexDirectionMarginTopPaddingHorizontalMutableBuilder[Self <: FlexDirectionMarginTopPaddingHorizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlexDirection(value: String): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
  }
}
