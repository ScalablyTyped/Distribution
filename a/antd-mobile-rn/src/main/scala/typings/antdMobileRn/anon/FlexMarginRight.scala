package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexMarginRight extends StObject {
  
  var flex: Double
  
  var marginRight: Double
  
  var overflow: String
  
  var width: Double
}
object FlexMarginRight {
  
  inline def apply(flex: Double, marginRight: Double, overflow: String, width: Double): FlexMarginRight = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexMarginRight]
  }
  
  extension [Self <: FlexMarginRight](x: Self) {
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
