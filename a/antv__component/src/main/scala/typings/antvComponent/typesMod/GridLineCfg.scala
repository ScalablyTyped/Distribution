package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLineCfg extends StObject {
  
  /**
    * 栅格线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.undefined
  
  /**
    * 栅格线的类型
    * @type {string}
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object GridLineCfg {
  
  inline def apply(): GridLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridLineCfg]
  }
  
  extension [Self <: GridLineCfg](x: Self) {
    
    inline def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction3(value: (/* item */ Any, /* index */ Double, /* items */ js.Array[Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
