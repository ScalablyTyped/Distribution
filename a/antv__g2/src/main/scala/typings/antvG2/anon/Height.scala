package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  /**
    * 图片结束位置， 值为原始数据值，支持 callback
    */
  var end: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * x 方向的偏移量
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * y 方向偏移量
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  /**
    * 图片路径
    */
  var src: js.UndefOr[String] = js.undefined
  
  /**
    * 图片起始位置， 值为原始数据值，支持 callback
    */
  var start: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  
  /**
    * 指定 giude 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Height {
  
  inline def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setEnd(value: js.Any | js.Function | (js.Array[String | Double])): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: (String | Double)*): Self = StObject.set(x, "end", js.Array(value :_*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStart(value: js.Any | js.Function | (js.Array[String | Double])): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: (String | Double)*): Self = StObject.set(x, "start", js.Array(value :_*))
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
