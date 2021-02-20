package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightPaddingHorizontal extends StObject {
  
  var fontSize: Double = js.native
  
  var height: Double = js.native
  
  var paddingHorizontal: Double = js.native
  
  var paddingVertical: Double = js.native
}
object HeightPaddingHorizontal {
  
  @scala.inline
  def apply(fontSize: Double, height: Double, paddingHorizontal: Double, paddingVertical: Double): HeightPaddingHorizontal = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightPaddingHorizontal]
  }
  
  @scala.inline
  implicit class HeightPaddingHorizontalMutableBuilder[Self <: HeightPaddingHorizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
