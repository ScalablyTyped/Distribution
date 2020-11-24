package typings.antvComponent.typesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlComponentCfg extends ComponentCfg {
  
  /**
    * 组件的 DOM 容器
    * @type {HTMLElement|string}
    */
  var container: js.UndefOr[HTMLElement | String] = js.native
  
  /**
    * 内部 DOM 的样式
    */
  var domStyles: js.UndefOr[LooseObject] = js.native
  
  /**
    * 组件的父容器
    */
  var parent: js.UndefOr[HTMLElement | String] = js.native
}
object HtmlComponentCfg {
  
  @scala.inline
  def apply(): HtmlComponentCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlComponentCfg]
  }
  
  @scala.inline
  implicit class HtmlComponentCfgOps[Self <: HtmlComponentCfg] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: HTMLElement | String): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDomStyles(value: LooseObject): Self = this.set("domStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomStyles: Self = this.set("domStyles", js.undefined)
    
    @scala.inline
    def setParent(value: HTMLElement | String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
}
