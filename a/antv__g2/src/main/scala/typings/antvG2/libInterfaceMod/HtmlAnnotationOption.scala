package typings.antvG2.libInterfaceMod

import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import typings.antvG2.libChartViewMod.View
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlAnnotationOption
  extends StObject
     with PointPositionBaseOption {
  
  /**
    * @title X 方向对齐
    */
  var alignX: js.UndefOr[left | middle | right] = js.undefined
  
  /**
    * @title Y 方向对齐
    */
  var alignY: js.UndefOr[typings.antvG2.antvG2Strings.top | middle | bottom] = js.undefined
  
  /**
    * @title 容器元素
    */
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  /**
    * @title 自定义 HTML DOM 元素
    */
  var html: String | HTMLElement | (js.Function2[/* container */ HTMLElement, /* view */ View, Unit | String | HTMLElement])
}
object HtmlAnnotationOption {
  
  inline def apply(
    html: String | HTMLElement | (js.Function2[/* container */ HTMLElement, /* view */ View, Unit | String | HTMLElement]),
    position: AnnotationPosition
  ): HtmlAnnotationOption = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlAnnotationOption]
  }
  
  extension [Self <: HtmlAnnotationOption](x: Self) {
    
    inline def setAlignX(value: left | middle | right): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
    
    inline def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
    
    inline def setAlignY(value: top | middle | bottom): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
    
    inline def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setHtml(
      value: String | HTMLElement | (js.Function2[/* container */ HTMLElement, /* view */ View, Unit | String | HTMLElement])
    ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlFunction2(value: (/* container */ HTMLElement, /* view */ View) => Unit | String | HTMLElement): Self = StObject.set(x, "html", js.Any.fromFunction2(value))
  }
}
