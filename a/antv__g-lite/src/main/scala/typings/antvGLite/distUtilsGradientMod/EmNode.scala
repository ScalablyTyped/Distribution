package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.em
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmNode extends StObject {
  
  var `type`: em
  
  var value: String
}
object EmNode {
  
  inline def apply(value: String): EmNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("em")
    __obj.asInstanceOf[EmNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmNode] (val x: Self) extends AnyVal {
    
    inline def setType(value: em): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
