package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightPaddingHorizontal extends StObject {
  
  var fontSize: Double
  
  var height: Double
  
  var paddingHorizontal: Double
  
  var paddingVertical: Double
}
object HeightPaddingHorizontal {
  
  inline def apply(fontSize: Double, height: Double, paddingHorizontal: Double, paddingVertical: Double): HeightPaddingHorizontal = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], paddingHorizontal = paddingHorizontal.asInstanceOf[js.Any], paddingVertical = paddingVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightPaddingHorizontal]
  }
  
  extension [Self <: HeightPaddingHorizontal](x: Self) {
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPaddingHorizontal(value: Double): Self = StObject.set(x, "paddingHorizontal", value.asInstanceOf[js.Any])
    
    inline def setPaddingVertical(value: Double): Self = StObject.set(x, "paddingVertical", value.asInstanceOf[js.Any])
  }
}
