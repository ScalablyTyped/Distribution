package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.triangular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  /**
    * @title 最大值
    * @description 默认为数据中的最大值减去一个固定的阈值
    * @default "数据中的最大值减去一个固定的阈值"
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 最小值
    * @description 默认为数据中的最小值减去一个固定的阈值
    * @default "数据中的最小值减去一个固定的阈值"
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 采样数量
    * @description 越大轮廓线越接近真实概率分布函数
    * @default "32"
    */
  var sampleSize: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 三角波类型
    * @description 三角波类型'triangular'
    */
  var `type`: triangular
  
  /**
    * @title 核函数的带宽
    * @description 带宽越大产生的曲线越平滑（越模糊），带宽越小产生的曲线越陡峭
    * @default "3"
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("triangular")
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setType(value: triangular): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
