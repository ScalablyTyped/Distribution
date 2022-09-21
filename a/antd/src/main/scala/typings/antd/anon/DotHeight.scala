package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotHeight extends StObject {
  
  var dotHeight: Double
  
  var dotWidth: Double
  
  var dotWidthActive: Double
}
object DotHeight {
  
  inline def apply(dotHeight: Double, dotWidth: Double, dotWidthActive: Double): DotHeight = {
    val __obj = js.Dynamic.literal(dotHeight = dotHeight.asInstanceOf[js.Any], dotWidth = dotWidth.asInstanceOf[js.Any], dotWidthActive = dotWidthActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotHeight]
  }
  
  extension [Self <: DotHeight](x: Self) {
    
    inline def setDotHeight(value: Double): Self = StObject.set(x, "dotHeight", value.asInstanceOf[js.Any])
    
    inline def setDotWidth(value: Double): Self = StObject.set(x, "dotWidth", value.asInstanceOf[js.Any])
    
    inline def setDotWidthActive(value: Double): Self = StObject.set(x, "dotWidthActive", value.asInstanceOf[js.Any])
  }
}
