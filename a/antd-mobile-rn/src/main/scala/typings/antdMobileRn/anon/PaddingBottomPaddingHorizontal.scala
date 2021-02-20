package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingBottomPaddingHorizontal extends StObject {
  
  var paddingBottom: Double = js.native
  
  var paddingHorizontal: Double = js.native
  
  var paddingTop: Double = js.native
}
object PaddingBottomPaddingHorizontal {
  
  @scala.inline
  def apply(paddingBottom: Double, paddingHorizontal: Double, paddingTop: Double): PaddingBottomPaddingHorizontal = {
    val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingTop = paddingTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottomPaddingHorizontal]
  }
  
  @scala.inline
  implicit class PaddingBottomPaddingHorizontalMutableBuilder[Self <: PaddingBottomPaddingHorizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
  }
}
