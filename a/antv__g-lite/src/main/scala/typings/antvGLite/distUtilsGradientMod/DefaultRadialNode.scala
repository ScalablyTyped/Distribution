package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.`default-radial`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRadialNode extends StObject {
  
  var at: PositionNode
  
  var `type`: `default-radial`
}
object DefaultRadialNode {
  
  inline def apply(at: PositionNode): DefaultRadialNode = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("default-radial")
    __obj.asInstanceOf[DefaultRadialNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultRadialNode] (val x: Self) extends AnyVal {
    
    inline def setAt(value: PositionNode): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setType(value: `default-radial`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
