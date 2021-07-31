package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
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
  
  @scala.inline
  def apply(): AxisSubTickLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisSubTickLineCfg]
  }
  
  @scala.inline
  implicit class AxisSubTickLineCfgMutableBuilder[Self <: AxisSubTickLineCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs | ShapeAttrsCallback): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleFunction3(value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => ShapeAttrs): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
