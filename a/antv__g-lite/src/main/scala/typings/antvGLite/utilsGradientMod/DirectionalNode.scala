package typings.antvGLite.utilsGradientMod

import typings.antvGLite.antvGLiteStrings.`bottom left`
import typings.antvGLite.antvGLiteStrings.`bottom right`
import typings.antvGLite.antvGLiteStrings.`left bottom`
import typings.antvGLite.antvGLiteStrings.`left top`
import typings.antvGLite.antvGLiteStrings.`right bottom`
import typings.antvGLite.antvGLiteStrings.`right top`
import typings.antvGLite.antvGLiteStrings.`top left`
import typings.antvGLite.antvGLiteStrings.`top right`
import typings.antvGLite.antvGLiteStrings.bottom
import typings.antvGLite.antvGLiteStrings.directional
import typings.antvGLite.antvGLiteStrings.left
import typings.antvGLite.antvGLiteStrings.right
import typings.antvGLite.antvGLiteStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionalNode extends StObject {
  
  var `type`: directional
  
  var value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
}
object DirectionalNode {
  
  inline def apply(
    value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
  ): DirectionalNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("directional")
    __obj.asInstanceOf[DirectionalNode]
  }
  
  extension [Self <: DirectionalNode](x: Self) {
    
    inline def setType(value: directional): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(
      value: left | top | bottom | right | (`left top`) | (`top left`) | (`left bottom`) | (`bottom left`) | (`right top`) | (`top right`) | (`right bottom`) | (`bottom right`)
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
