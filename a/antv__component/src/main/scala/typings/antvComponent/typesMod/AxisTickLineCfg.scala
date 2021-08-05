package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisTickLineCfg extends StObject {
  
  /**
    * 是否同 tick 对齐
    * @type {boolean}
    */
  var alignTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 长度
    * @type {number}
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * 坐标轴刻度线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs | ShapeAttrsCallback] = js.undefined
}
object AxisTickLineCfg {
  
  inline def apply(): AxisTickLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisTickLineCfg]
  }
  
  extension [Self <: AxisTickLineCfg](x: Self) {
    
    inline def setAlignTick(value: Boolean): Self = StObject.set(x, "alignTick", value.asInstanceOf[js.Any])
    
    inline def setAlignTickUndefined: Self = StObject.set(x, "alignTick", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction3(value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
