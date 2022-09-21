package typings.antvGLite.utilsGradientMod

import typings.antvGLite.antvGLiteStrings.`position-keyword`
import typings.antvGLite.antvGLiteStrings.bottom
import typings.antvGLite.antvGLiteStrings.center
import typings.antvGLite.antvGLiteStrings.left
import typings.antvGLite.antvGLiteStrings.right
import typings.antvGLite.antvGLiteStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionKeywordNode extends StObject {
  
  var `type`: `position-keyword`
  
  var value: center | left | top | bottom | right
}
object PositionKeywordNode {
  
  inline def apply(value: center | left | top | bottom | right): PositionKeywordNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("position-keyword")
    __obj.asInstanceOf[PositionKeywordNode]
  }
  
  extension [Self <: PositionKeywordNode](x: Self) {
    
    inline def setType(value: `position-keyword`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: center | left | top | bottom | right): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
