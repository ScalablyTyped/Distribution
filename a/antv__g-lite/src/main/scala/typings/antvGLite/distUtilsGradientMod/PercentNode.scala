package typings.antvGLite.distUtilsGradientMod

import typings.antvGLite.antvGLiteStrings.Percentsign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentNode extends StObject {
  
  var `type`: Percentsign
  
  var value: String
}
object PercentNode {
  
  inline def apply(value: String): PercentNode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("%")
    __obj.asInstanceOf[PercentNode]
  }
  
  extension [Self <: PercentNode](x: Self) {
    
    inline def setType(value: Percentsign): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
