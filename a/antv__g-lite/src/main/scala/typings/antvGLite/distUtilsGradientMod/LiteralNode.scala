package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiteralNode
  extends StObject
     with ColorStop {
  
  var length: js.UndefOr[PxNode | EmNode | PercentNode] = js.undefined
  
  var `type`: literal
  
  var value: String
}
object LiteralNode {
  
  inline def apply(value: String): LiteralNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("literal")
    __obj.asInstanceOf[LiteralNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiteralNode] (val x: Self) extends AnyVal {
    
    inline def setLength(value: PxNode | EmNode | PercentNode): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
