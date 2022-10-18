package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.circle
import typings.antvGLite.antvGLiteStrings.ellipse
import typings.antvGLite.antvGLiteStrings.shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeNode extends StObject {
  
  var at: js.UndefOr[PositionNode] = js.undefined
  
  var style: js.UndefOr[ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode] = js.undefined
  
  var `type`: shape
  
  var value: ellipse | circle
}
object ShapeNode {
  
  inline def apply(value: ellipse | circle): ShapeNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("shape")
    __obj.asInstanceOf[ShapeNode]
  }
  
  extension [Self <: ShapeNode](x: Self) {
    
    inline def setAt(value: PositionNode): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
    
    inline def setStyle(value: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: shape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ellipse | circle): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
