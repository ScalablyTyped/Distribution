package typings.antvG2.anon

import typings.antvG2.mod.Styles.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  /**
    * 辅助线结束位置，值为原始数据值，支持 callback
    */
  var end: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  
  /**
    * 图形样式配置
    */
  var lineStyle: js.UndefOr[line] = js.undefined
  
  /**
    * 辅助线起始位置，值为原始数据值，支持 callback
    */
  var start: js.UndefOr[js.Any | js.Function | (js.Array[String | Double])] = js.undefined
  
  var text: js.UndefOr[AutoRotate] = js.undefined
  
  /**
    * 指定 guide 是否绘制在 canvas 最上层，默认为 false, 即绘制在最下层
    */
  var top: js.UndefOr[Boolean] = js.undefined
}
object End {
  
  inline def apply(): End = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: js.Any | js.Function | (js.Array[String | Double])): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setEndVarargs(value: (String | Double)*): Self = StObject.set(x, "end", js.Array(value :_*))
    
    inline def setLineStyle(value: line): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setStart(value: js.Any | js.Function | (js.Array[String | Double])): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: (String | Double)*): Self = StObject.set(x, "start", js.Array(value :_*))
    
    inline def setText(value: AutoRotate): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
