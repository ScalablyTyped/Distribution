package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewOption extends StObject {
  
  /**
    * @title view 的唯一表示 ID
    */
  val id: js.UndefOr[String] = js.undefined
  
  /**
    * 图表组件、图形映射等相关的配置。
    */
  val options: js.UndefOr[Options] = js.undefined
  
  /**
    * 设置图表的内边距，使用方式参考 CSS 盒模型。
    * 下图黄色区域即为 padding 的范围。
    * ![](https://gw.alipayobjects.com/mdn/rms_2274c3/afts/img/A*pYwiQrdXGJ8AAAAAAAAAAABkARQnAQ)
    *
    * @example
    * 1. padding: 20
    * 2. padding: [ 10, 30, 30 ]
    */
  val padding: js.UndefOr[ViewPadding] = js.undefined
  
  /**
    * @title view 的绘制范围，起始点为左上角。
    */
  val region: js.UndefOr[Region] = js.undefined
  
  /**
    * @title 设置主题。
    */
  val theme: js.UndefOr[LooseObject | String] = js.undefined
  
  /**
    * @title 是否可见。
    */
  val visible: js.UndefOr[Boolean] = js.undefined
}
object ViewOption {
  
  inline def apply(): ViewOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewOption] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTheme(value: LooseObject | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
