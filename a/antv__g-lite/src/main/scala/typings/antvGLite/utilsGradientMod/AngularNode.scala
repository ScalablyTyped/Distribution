package typings.antvGLite.utilsGradientMod

import typings.antvGLite.antvGLiteStrings.angular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularNode extends StObject {
  
  var `type`: angular
  
  var value: String
}
object AngularNode {
  
  inline def apply(value: String): AngularNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("angular")
    __obj.asInstanceOf[AngularNode]
  }
  
  extension [Self <: AngularNode](x: Self) {
    
    inline def setType(value: angular): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
