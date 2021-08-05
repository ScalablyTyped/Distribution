package typings.antvG2.mod

import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.polygon
import typings.antvG2.mod.Styles.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisGrid extends StObject {
  
  /**
    * 声明网格顶点从两个刻度中间开始，默认从刻度点开始
    */
  var align: js.UndefOr[center] = js.undefined
  
  /**
    * 当网格类型 type 为 polygon 时，使用 alternateColor 为网格设置交替的颜色。
    * 指定一个值则先渲染奇数层，两个值则交替渲染
    */
  var alternateColor: js.UndefOr[String | (js.Tuple2[String, String])] = js.undefined
  
  /**
    * 是否隐藏第一条网格线，默认为 false
    */
  var hideFirstLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 是否隐藏最后一条网格线，默认为 false
    */
  var hideLastLine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 当网格类型 type 为 line 时，使用 lineStyle 设置样式
    */
  var lineStyle: js.UndefOr[line] = js.undefined
  
  /**
    * 声明网格的类型，line 表示线，polygon 表示矩形框
    */
  var `type`: js.UndefOr[typings.antvG2.antvG2Strings.line | polygon] = js.undefined
}
object AxisGrid {
  
  inline def apply(): AxisGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisGrid]
  }
  
  extension [Self <: AxisGrid](x: Self) {
    
    inline def setAlign(value: center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setAlternateColor(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "alternateColor", value.asInstanceOf[js.Any])
    
    inline def setAlternateColorUndefined: Self = StObject.set(x, "alternateColor", js.undefined)
    
    inline def setHideFirstLine(value: Boolean): Self = StObject.set(x, "hideFirstLine", value.asInstanceOf[js.Any])
    
    inline def setHideFirstLineUndefined: Self = StObject.set(x, "hideFirstLine", js.undefined)
    
    inline def setHideLastLine(value: Boolean): Self = StObject.set(x, "hideLastLine", value.asInstanceOf[js.Any])
    
    inline def setHideLastLineUndefined: Self = StObject.set(x, "hideLastLine", js.undefined)
    
    inline def setLineStyle(value: line): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setType(value: typings.antvG2.antvG2Strings.line | polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
