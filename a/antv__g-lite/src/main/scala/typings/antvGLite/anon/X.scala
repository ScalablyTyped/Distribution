package typings.antvGLite.anon

import typings.antvGLite.distUtilsGradientMod.EmNode
import typings.antvGLite.distUtilsGradientMod.ExtentKeywordNode
import typings.antvGLite.distUtilsGradientMod.PercentNode
import typings.antvGLite.distUtilsGradientMod.PositionKeywordNode
import typings.antvGLite.distUtilsGradientMod.PxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode
  
  var y: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode
}
object X {
  
  inline def apply(
    x: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode,
    y: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode
  ): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
    
    inline def setX(value: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: ExtentKeywordNode | PxNode | EmNode | PercentNode | PositionKeywordNode): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
