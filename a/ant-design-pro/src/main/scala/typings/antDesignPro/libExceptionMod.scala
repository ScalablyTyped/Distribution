package typings.antDesignPro

import typings.antDesignPro.anon.Href
import typings.antDesignPro.antDesignProStrings.`403`
import typings.antDesignPro.antDesignProStrings.`404`
import typings.antDesignPro.antDesignProStrings.`500`
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExceptionMod {
  
  @JSImport("ant-design-pro/lib/Exception", JSImport.Default)
  @js.native
  open class default () extends Component[ExceptionProps[Href], Any, Any]
  
  type Exception = Component[ExceptionProps[Href], Any, Any]
  
  trait ExceptionProps[L] extends StObject {
    
    var actions: js.UndefOr[ReactNode] = js.undefined
    
    var backText: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var desc: js.UndefOr[ReactNode] = js.undefined
    
    var img: js.UndefOr[String] = js.undefined
    
    var linkElement: js.UndefOr[String | ComponentType[L]] = js.undefined
    
    var redirect: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
    
    var `type`: js.UndefOr[`403` | `404` | `500`] = js.undefined
  }
  object ExceptionProps {
    
    inline def apply[L](): ExceptionProps[L] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExceptionProps[L]]
    }
    
    extension [Self <: ExceptionProps[?], L](x: Self & ExceptionProps[L]) {
      
      inline def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setBackText(value: ReactNode): Self = StObject.set(x, "backText", value.asInstanceOf[js.Any])
      
      inline def setBackTextUndefined: Self = StObject.set(x, "backText", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDesc(value: ReactNode): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setLinkElement(value: String | ComponentType[L]): Self = StObject.set(x, "linkElement", value.asInstanceOf[js.Any])
      
      inline def setLinkElementUndefined: Self = StObject.set(x, "linkElement", js.undefined)
      
      inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: `403` | `404` | `500`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
