package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisTickLineCfg] (val x: Self) extends AnyVal {
    
    inline def setAlignTick(value: Boolean): Self = StObject.set(x, "alignTick", value.asInstanceOf[js.Any])
    
    inline def setAlignTickUndefined: Self = StObject.set(x, "alignTick", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleFunction3(value: (/* item */ Any, /* index */ Double, /* items */ js.Array[Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
