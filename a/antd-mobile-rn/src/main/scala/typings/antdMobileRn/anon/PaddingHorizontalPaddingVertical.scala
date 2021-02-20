package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingHorizontalPaddingVertical extends StObject {
  
  var paddingHorizontal: Double = js.native
  
  var paddingVertical: Double = js.native
}
object PaddingHorizontalPaddingVertical {
  
  @scala.inline
  def apply(paddingHorizontal: Double, paddingVertical: Double): PaddingHorizontalPaddingVertical = {
    val __obj = js.Dynamic.literal(paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingHorizontalPaddingVertical]
  }
  
  @scala.inline
  implicit class PaddingHorizontalPaddingVerticalMutableBuilder[Self <: PaddingHorizontalPaddingVertical] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
