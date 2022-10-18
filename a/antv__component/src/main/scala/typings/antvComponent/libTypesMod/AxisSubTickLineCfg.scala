package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisSubTickLineCfg extends StObject {
  
  /**
    * 子刻度个数
    * @type {number}
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * 子刻度线长度
    * @type {number}
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * 坐标轴刻度线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.undefined
}
object AxisSubTickLineCfg {
  
  inline def apply(): AxisSubTickLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisSubTickLineCfg]
  }
  
  extension [Self <: AxisSubTickLineCfg](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction3(value: (/* item */ Any, /* index */ Double, /* items */ js.Array[Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
