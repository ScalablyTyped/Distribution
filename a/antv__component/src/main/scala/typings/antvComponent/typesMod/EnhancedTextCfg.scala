package typings.antvComponent.typesMod

import typings.antvComponent.antvComponentStrings.head
import typings.antvComponent.antvComponentStrings.middle
import typings.antvComponent.antvComponentStrings.tail
import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnhancedTextCfg extends StObject {
  
  /** 超出 maxLength 是否自动省略 */
  var autoEllipsis: js.UndefOr[Boolean] = js.undefined
  
  /** 文字包围盒样式设置 */
  var background: js.UndefOr[EnhancedTextBackgroundCfg] = js.undefined
  
  /** 文本标注内容 */
  var content: String | Double
  
  /** 文本截断的位置 */
  var ellipsisPosition: js.UndefOr[head | middle | tail] = js.undefined
  
  /** 文本在二维坐标系的显示位置，是沿着 x 轴显示 还是沿着 y 轴显示 */
  var isVertical: js.UndefOr[Boolean] = js.undefined
  
  /** 文本的最大长度 */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /** 旋转，弧度制 */
  var rotate: js.UndefOr[Double] = js.undefined
  
  /** 文本标注样式 */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object EnhancedTextCfg {
  
  inline def apply(content: String | Double): EnhancedTextCfg = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedTextCfg]
  }
  
  extension [Self <: EnhancedTextCfg](x: Self) {
    
    inline def setAutoEllipsis(value: Boolean): Self = StObject.set(x, "autoEllipsis", value.asInstanceOf[js.Any])
    
    inline def setAutoEllipsisUndefined: Self = StObject.set(x, "autoEllipsis", js.undefined)
    
    inline def setBackground(value: EnhancedTextBackgroundCfg): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setContent(value: String | Double): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setEllipsisPosition(value: head | middle | tail): Self = StObject.set(x, "ellipsisPosition", value.asInstanceOf[js.Any])
    
    inline def setEllipsisPositionUndefined: Self = StObject.set(x, "ellipsisPosition", js.undefined)
    
    inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
    
    inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
