package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingLeft extends StObject {
  
  var height: Double = js.native
  
  var paddingLeft: Double = js.native
  
  var paddingRight: Double = js.native
}
object PaddingLeft {
  
  @scala.inline
  def apply(height: Double, paddingLeft: Double, paddingRight: Double): PaddingLeft = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeft]
  }
  
  @scala.inline
  implicit class PaddingLeftMutableBuilder[Self <: PaddingLeft] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
  }
}
