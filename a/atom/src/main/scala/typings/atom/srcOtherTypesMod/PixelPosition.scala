package typings.atom.srcOtherTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelPosition extends StObject {
  
  var left: Double
  
  var top: Double
}
object PixelPosition {
  
  inline def apply(left: Double, top: Double): PixelPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelPosition]
  }
  
  extension [Self <: PixelPosition](x: Self) {
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
