package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeMarkerCfg extends StObject {
  
  /**
    * @title 颜色。
    */
  var color: String
  
  /**
    * @title 是否是极坐标。
    */
  var isInPolar: Boolean
}
object ShapeMarkerCfg {
  
  inline def apply(color: String, isInPolar: Boolean): ShapeMarkerCfg = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], isInPolar = isInPolar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeMarkerCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapeMarkerCfg] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setIsInPolar(value: Boolean): Self = StObject.set(x, "isInPolar", value.asInstanceOf[js.Any])
  }
}
