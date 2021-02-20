package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingBottomNumber extends StObject {
  
  var paddingBottom: Double = js.native
  
  var paddingHorizontal: Double = js.native
}
object PaddingBottomNumber {
  
  @scala.inline
  def apply(paddingBottom: Double, paddingHorizontal: Double): PaddingBottomNumber = {
    val __obj = js.Dynamic.literal(paddingBottom = paddingBottom.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottomNumber]
  }
  
  @scala.inline
  implicit class PaddingBottomNumberMutableBuilder[Self <: PaddingBottomNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
  }
}
