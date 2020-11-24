package typings.antvComponent.typesMod

import typings.antvComponent.antvComponentStrings.bottom
import typings.antvComponent.antvComponentStrings.left
import typings.antvComponent.antvComponentStrings.middle
import typings.antvComponent.antvComponentStrings.right
import typings.antvComponent.antvComponentStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlAnnotationCfg extends HtmlComponentCfg {
  
  /** X 方向对齐，默认 left */
  var alignX: js.UndefOr[left | middle | right] = js.native
  
  /** Y 方向对齐，默认 top */
  var alignY: js.UndefOr[top | middle | bottom] = js.native
  
  /** 自定义 html */
  var html: String | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | HTMLElement]) = js.native
  
  /** zIndex 设置 */
  var zIndex: js.UndefOr[Double] = js.native
}
object HtmlAnnotationCfg {
  
  @scala.inline
  def apply(
    html: String | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | HTMLElement])
  ): HtmlAnnotationCfg = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlAnnotationCfg]
  }
  
  @scala.inline
  implicit class HtmlAnnotationCfgOps[Self <: HtmlAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHtmlFunction1(value: /* container */ HTMLElement => Unit | String | HTMLElement): Self = this.set("html", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHtml(
      value: String | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | HTMLElement])
    ): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignX(value: left | middle | right): Self = this.set("alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignX: Self = this.set("alignX", js.undefined)
    
    @scala.inline
    def setAlignY(value: top | middle | bottom): Self = this.set("alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignY: Self = this.set("alignY", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
