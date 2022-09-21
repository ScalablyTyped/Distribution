package typings.antvG2.anon

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  /**
    * @title 背景框 内边距
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * @title 背景框图形属性配置
    * - fill?: string; 背景框 填充色
    * - stroke?: string; 背景框 描边色
    * - lineWidth?: string; 背景框 描边宽度
    * - radius?: number | number[]; 背景框圆角，支持整数或数组形式
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object Padding {
  
  inline def apply(): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Padding]
  }
  
  extension [Self <: Padding](x: Self) {
    
    inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
