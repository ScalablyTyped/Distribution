package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryLabelLayoutCfg extends StObject {
  
  /**
    * @title 各个布局函数开放给用户的配置。
    */
  var cfg: js.UndefOr[LooseObject] = js.undefined
  
  /**
    * @title label 布局类型。
    */
  var `type`: String
}
object GeometryLabelLayoutCfg {
  
  inline def apply(`type`: String): GeometryLabelLayoutCfg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryLabelLayoutCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeometryLabelLayoutCfg] (val x: Self) extends AnyVal {
    
    inline def setCfg(value: LooseObject): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
