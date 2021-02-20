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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  @JSImport("ant-design-pro/lib/Exception", JSImport.Default)
  @js.native
  class default ()
    extends Component[ExceptionProps[Href], js.Any, js.Any]
  
  type Exception = Component[ExceptionProps[Href], js.Any, js.Any]
  
  @js.native
  trait ExceptionProps[L] extends StObject {
    
    var actions: js.UndefOr[ReactNode] = js.native
    
    var backText: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var desc: js.UndefOr[ReactNode] = js.native
    
    var img: js.UndefOr[String] = js.native
    
    var linkElement: js.UndefOr[String | ComponentType[L]] = js.native
    
    var redirect: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var `type`: js.UndefOr[`403` | `404` | `500`] = js.native
  }
  object ExceptionProps {
    
    @scala.inline
    def apply[L](): ExceptionProps[L] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExceptionProps[L]]
    }
    
    @scala.inline
    implicit class ExceptionPropsMutableBuilder[Self <: ExceptionProps[_], L] (val x: Self with ExceptionProps[L]) extends AnyVal {
      
      @scala.inline
      def setActions(value: ReactNode): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setBackText(value: ReactNode): Self = StObject.set(x, "backText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackTextUndefined: Self = StObject.set(x, "backText", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDesc(value: ReactNode): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      @scala.inline
      def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setLinkElement(value: String | ComponentType[L]): Self = StObject.set(x, "linkElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkElementUndefined: Self = StObject.set(x, "linkElement", js.undefined)
      
      @scala.inline
      def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: `403` | `404` | `500`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
