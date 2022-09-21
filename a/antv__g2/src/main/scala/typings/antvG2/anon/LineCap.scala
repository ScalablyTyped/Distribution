package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineCap extends StObject {
  
  /**
    * @title 是否圆角
    */
  var lineCap: js.UndefOr[String] = js.undefined
  
  /**
    * @title 滑块颜色
    */
  var thumbColor: js.UndefOr[String] = js.undefined
  
  /**
    * @title 滑块高亮样式，对应主题的 hover.style.thumbColor
    */
  var thumbHighlightColor: js.UndefOr[String] = js.undefined
  
  /**
    * @title 滑道颜色
    */
  var trackColor: js.UndefOr[String] = js.undefined
}
object LineCap {
  
  inline def apply(): LineCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineCap]
  }
  
  extension [Self <: LineCap](x: Self) {
    
    inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setThumbColor(value: String): Self = StObject.set(x, "thumbColor", value.asInstanceOf[js.Any])
    
    inline def setThumbColorUndefined: Self = StObject.set(x, "thumbColor", js.undefined)
    
    inline def setThumbHighlightColor(value: String): Self = StObject.set(x, "thumbHighlightColor", value.asInstanceOf[js.Any])
    
    inline def setThumbHighlightColorUndefined: Self = StObject.set(x, "thumbHighlightColor", js.undefined)
    
    inline def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
    
    inline def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
  }
}
