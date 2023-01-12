package typings.antvComponent.libTypesMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlComponentCfg
  extends StObject
     with ComponentCfg {
  
  /**
    * 组件的 DOM 容器
    * @type {HTMLElement|string}
    */
  var container: js.UndefOr[HTMLElement | String] = js.undefined
  
  /**
    * 内部 DOM 的样式
    */
  var domStyles: js.UndefOr[LooseObject] = js.undefined
  
  /**
    * 组件的父容器
    */
  var parent: js.UndefOr[HTMLElement | String] = js.undefined
}
object HtmlComponentCfg {
  
  inline def apply(): HtmlComponentCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlComponentCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlComponentCfg] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLElement | String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setDomStyles(value: LooseObject): Self = StObject.set(x, "domStyles", value.asInstanceOf[js.Any])
    
    inline def setDomStylesUndefined: Self = StObject.set(x, "domStyles", js.undefined)
    
    inline def setParent(value: HTMLElement | String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
