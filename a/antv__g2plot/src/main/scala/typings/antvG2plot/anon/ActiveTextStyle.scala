package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.`bottom-left`
import typings.antvG2plot.antvG2plotStrings.`top-left`
import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTextStyle extends StObject {
  
  /**
    * @title 激活的字体样式
    * @description 设置面包屑字激活的字体样式
    */
  var activeTextStyle: js.UndefOr[ShapeAttrs] = js.undefined
  
  /**
    * @title 分割线文本
    * @description 设置面包屑分割线文本
    */
  var dividerText: js.UndefOr[String] = js.undefined
  
  /**
    * @title 位置
    * @description 设置面包屑显示位置
    */
  var position: `top-left` | `bottom-left`
  
  /**
    * @title 根文本
    * @description 设置面包屑根文本
    */
  var rootText: js.UndefOr[String] = js.undefined
  
  /**
    * @title 字体样式
    * @description 设置面包屑字体样式
    */
  var textStyle: js.UndefOr[ShapeAttrs] = js.undefined
}
object ActiveTextStyle {
  
  inline def apply(position: `top-left` | `bottom-left`): ActiveTextStyle = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTextStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveTextStyle] (val x: Self) extends AnyVal {
    
    inline def setActiveTextStyle(value: ShapeAttrs): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
    
    inline def setActiveTextStyleUndefined: Self = StObject.set(x, "activeTextStyle", js.undefined)
    
    inline def setDividerText(value: String): Self = StObject.set(x, "dividerText", value.asInstanceOf[js.Any])
    
    inline def setDividerTextUndefined: Self = StObject.set(x, "dividerText", js.undefined)
    
    inline def setPosition(value: `top-left` | `bottom-left`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRootText(value: String): Self = StObject.set(x, "rootText", value.asInstanceOf[js.Any])
    
    inline def setRootTextUndefined: Self = StObject.set(x, "rootText", js.undefined)
    
    inline def setTextStyle(value: ShapeAttrs): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
