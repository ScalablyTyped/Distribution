package typings.antvGLite.utilsGradientMod

import typings.antvGLite.anon.X
import typings.antvGLite.antvGLiteStrings.position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionNode extends StObject {
  
  var `type`: position
  
  var value: X
}
object PositionNode {
  
  inline def apply(value: X): PositionNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("position")
    __obj.asInstanceOf[PositionNode]
  }
  
  extension [Self <: PositionNode](x: Self) {
    
    inline def setType(value: position): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: X): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
